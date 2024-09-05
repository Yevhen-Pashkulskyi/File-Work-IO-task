package v1_0_1.exception;

import v1_0_1.exception.custom.NumberException;

public class ValidData {
    private final String INPUT_REGEX_NUMBER = "^[0-9]*[.,]?[0-9]$";

    public String validInNumber(String input) {
        if (input.matches(INPUT_REGEX_NUMBER)) {
            return input;
        }
        throw new NumberException("Invalid number " + input);
    }

    public String handleNumber(String input) {
        try {
            return validInNumber(input);
        } catch (NumberException e) {
            return e.getMessage();
        }
    }
}
