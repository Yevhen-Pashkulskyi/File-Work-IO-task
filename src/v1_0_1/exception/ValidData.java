package v1_0_1.exception;

import v1_0_1.exception.custom.NumberException;
import v1_0_1.utils.Constants;

public class ValidData {

    public String validInNumber(String input) {
        if (input.matches(Constants.INPUT_REGEX_NUMBER)) {
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
