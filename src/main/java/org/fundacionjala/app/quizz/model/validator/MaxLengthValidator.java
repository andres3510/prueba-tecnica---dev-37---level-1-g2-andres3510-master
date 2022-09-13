package org.fundacionjala.app.quizz.model.validator;

import java.util.List;

public class MaxLengthValidator extends AbstractValidator {

    private static final String ERROR_MESSAGE = "The value must be less than %s characters";

    @Override
    public void validate(String value, String conditionValue, List<String> errors) {
        if (value.length() > Integer.parseInt(conditionValue)) {
            errors.add(String.format(ERROR_MESSAGE, conditionValue));
        }
    }
}