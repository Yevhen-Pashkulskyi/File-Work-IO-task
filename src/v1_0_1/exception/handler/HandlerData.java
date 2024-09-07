package v1_0_1.exception.handler;

import v1_0_1.exception.custom.NumberException;
import v1_0_1.exception.validate.ValidData;

public class HandlerData {

    public String handleNumber(String input) {
        ValidData vd = new ValidData();
        try {
            return vd.validQuota(vd.validateNumber(input));
        } catch (IllegalArgumentException | ArithmeticException e) {
            return new NumberException("Number exception: ", e).getMessage() + e.getMessage();
        }
    }

    public String handleString(String input) {
        ValidData vd = new ValidData();
        try {
            return vd.validNameFile(input);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}

