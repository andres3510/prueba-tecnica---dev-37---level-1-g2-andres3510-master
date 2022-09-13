package org.fundacionjala.app.quizz.model.configuration;

import java.text.SimpleDateFormat;

import org.fundacionjala.app.quizz.model.validator.ValidatorType;

public class NumberConfiguration extends QuestionConfiguration {
    public static final SimpleDateFormat FORMATTER = new SimpleDateFormat("dd/MM/yyyy");

    public NumberConfiguration() {
        super(false, ValidatorType.REQUIRED, ValidatorType.NUMBER);
    }

    @Override
    public String convertValue(String value) {
        return FORMATTER.format(value);
    }
}
    
