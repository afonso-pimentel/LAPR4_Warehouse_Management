/*
 * Copyright (c) 2021-2022 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package eapli.base.surveysmanagement.application.strategies;

import eapli.base.customerusermanagement.domain.*;
import eapli.base.customerusermanagement.repositories.CustomerRepository;
import eapli.base.ordersmanagement.domain.Order_;
import eapli.base.ordersmanagement.domain.PaymentMethod;
import eapli.base.ordersmanagement.domain.ShipmentMethod;
import eapli.base.ordersmanagement.repositories.OrderRepository;
import eapli.base.surveysmanagement.application.strategy.BrandPeriodRuleStrategy;
import eapli.base.surveysmanagement.domain.SurveyRule;
import eapli.base.surveysmanagement.domain.SurveyRules;
import eapli.framework.general.domain.model.Designation;
import eapli.framework.general.domain.model.EmailAddress;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BrandPeriodRuleStrategyTests {
    @Mock
    private CustomerRepository mockCustomerRepository;

    @Mock
    private OrderRepository mockOrderRepository;

    private BrandPeriodRuleStrategy brandPeriodRuleStrategy;

    @BeforeEach
    public void createMocks() {
        MockitoAnnotations.openMocks(this);
        brandPeriodRuleStrategy = new BrandPeriodRuleStrategy(mockOrderRepository, mockCustomerRepository);
    }

    @Test
    public void performStrategy_NullSurveyRule_ShouldReturnIllegalArgumentException(){
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> brandPeriodRuleStrategy.performStrategy(null));
    }

    @Test
    public void performStrategy_InvalidSurveyRule_ShouldReturnIllegalArgumentException(){
        // Arrange
        var invalidRule = new SurveyRule(SurveyRules.SCALAR_GENDER, " ", " ");

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> brandPeriodRuleStrategy.performStrategy(invalidRule));
    }

    @Test
    public void performStrategy_ValidSurveyRule_ShouldReturnExpectedTargetAudience(){
        // Arrange
        var brand = "Lion of Porches";
        var startDate = Calendar.getInstance().getTime();
        var endDate = Calendar.getInstance().getTime();

        var validRule = new SurveyRule(SurveyRules.PERIOD_BRAND, brand,startDate, endDate);

        Iterable<Customer> expectedAudience = getTargetAudience();
        Iterable<Order_> listOfOrders = getListOfOrders();

        Optional<Customer> expectedValidCustomer = Optional.of(expectedAudience.iterator().next());

        when(mockOrderRepository.findOrdersWithProductFromSpecificBrand(Designation.valueOf(brand), startDate, endDate))
                .thenReturn(listOfOrders);

        when(mockCustomerRepository.findByVatCode(expectedValidCustomer.get().identity()))
                .thenReturn(expectedValidCustomer);

        // Act
        Iterable<Customer> resultAudience = brandPeriodRuleStrategy.performStrategy(validRule);

        // Assert
        assertEquals(expectedAudience, resultAudience);

        verify(mockOrderRepository).findOrdersWithProductFromSpecificBrand(Designation.valueOf(brand), startDate, endDate);
        verify(mockCustomerRepository).findByVatCode(expectedValidCustomer.get().identity());
    }

    public Iterable<Customer> getTargetAudience(){
        var customers = new ArrayList<Customer>();
        var vatId = VatCode.valueOf("123456789");
        var name = Designation.valueOf("TEST CUSTOMER");
        var emailAddress = EmailAddress.valueOf("test@hotmail.com");
        var phoneNumber = PhoneNumber.valueOf(912223432);
        var gender = Gender.valueOf("Male");
        var birthDate = BirthDate.valueOf(Calendar.getInstance().getTime());
        var billingAddress = Address.valueOf("STREET", "23", "CITY");
        var deliveryAddress = Address.valueOf("STREET", "23", "CITY");

        customers.add(new Customer(vatId, name, emailAddress, phoneNumber, gender, birthDate, billingAddress, deliveryAddress));

        return customers;
    }

    public Iterable<Order_> getListOfOrders(){
        var orders = new ArrayList<Order_>();

        var vatId = VatCode.valueOf("123456789");
        var shipmentMethod = ShipmentMethod.valueOf("CTT");
        var paymentMethod = PaymentMethod.valueOf("PAYPAL");
        var shipmentAddress = Address.valueOf("STREET", "23", "CITY");
        var date = Calendar.getInstance().getTime();

        var order = new Order_(vatId, shipmentMethod, paymentMethod, shipmentAddress, date);

        orders.add(order);

        return orders;
    }
}
