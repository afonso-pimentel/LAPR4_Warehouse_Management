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

package eapli.base.surveysmanagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.surveysmanagement.application.strategy.SurveyRuleStrategyFactoryImpl;
import eapli.base.surveysmanagement.domain.Survey;
import eapli.base.surveysmanagement.domain.SurveyException;
import eapli.base.surveysmanagement.domain.SurveyRule;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Implementation for RegisterSurveyController
 */
public class RegisterSurveyControllerImpl implements RegisterSurveyController {
    private final RegisterSurveyService registerSurveyService;

    /**
     * Initializes a new instance of RegisterSurveyControllerImpl
     */
    public RegisterSurveyControllerImpl(){
        registerSurveyService = new RegisterSurveyServiceImpl(PersistenceContext.repositories().surveys(), new SurveyRuleStrategyFactoryImpl());
    }

    /**
     * @return
     * @inheritDoc
     */
    @Override
    public Survey addSurvey(String surveyCode, String description, Date startDate, Date endDate, byte[] questionnaireFile, Iterable<SurveyRuleDTO> rulesToBeApplied) throws ParseException, SurveyException {
        return registerSurveyService.addSurvey(surveyCode, description, startDate, endDate, questionnaireFile, mapRules(rulesToBeApplied));
    }

    private Iterable<SurveyRule> mapRules(Iterable<SurveyRuleDTO> rulesToBeApplied) throws ParseException {
        var mappedSurveyRules = new ArrayList<SurveyRule>();

        for(SurveyRuleDTO dto : rulesToBeApplied){
            Date startDate = dto.startPeriod != null && dto.startPeriod != "" ?
                    new SimpleDateFormat("dd/MM/yyyy").parse(dto.startPeriod)
                    : null;

            Date endDate = dto.endPeriod != null && dto.startPeriod != "" ?
                    new SimpleDateFormat("dd/MM/yyyy").parse(dto.endPeriod)
                    : null;

            var mappedSurveyRule = new SurveyRule(dto.rule, dto.value, dto.value2, startDate, endDate);

            mappedSurveyRules.add(mappedSurveyRule);
        }
        return mappedSurveyRules;
    }
}
