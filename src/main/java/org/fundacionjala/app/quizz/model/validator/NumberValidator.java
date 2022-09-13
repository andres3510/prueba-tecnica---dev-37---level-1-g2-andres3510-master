package org.fundacionjala.app.quizz.model.validator;

import java.util.List;

public class NumberValidator implements Validator {

    private static final String ERROR_MESSAGE = "The value must be a number";

    @Override
    public void validate(String value, String conditionValueString, List<String> errors) {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            errors.add(ERROR_MESSAGE);
        }
    }
}