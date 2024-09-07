package v1_0_1.exception.validate;

import v1_0_1.exception.custom.NumberException;
import v1_0_1.utils.Constants;

public class ValidData {

    public String validateNumber(String input) throws IllegalArgumentException {
        if (!input.matches(Constants.INPUT_REGEX_NUMBER)) {
            throw new IllegalArgumentException("Invalid number " + input);
        }
        return input;
    }

    public String validQuota(String input) throws ArithmeticException {
        if (Integer.parseInt(input) < Constants.QUOTA_LOWER_LIMIT &
                Integer.parseInt(input) > Constants.QUOTA_UPPER_LIMIT) {
            throw new ArithmeticException("Invalid quota " + input);
        } else {
            return input;
        }
    }

    public String validNameFile(String input) throws IllegalArgumentException {
        if (input.matches(Constants.REGEX_SYMBOL)) {
            throw new IllegalArgumentException("the file name should not contain \".\" \"/\" ");
        }
        return input;
    }
}
