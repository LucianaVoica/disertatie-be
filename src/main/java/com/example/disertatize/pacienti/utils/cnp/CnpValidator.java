package com.example.disertatize.pacienti.utils.cnp;

import io.micrometer.common.util.StringUtils;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class CnpValidator implements ConstraintValidator<Cnp, String> {
    private static final int CNP_LENGTH = 13;
    private static final Pattern CNP_PATTERN = Pattern.compile("[0-9]{13}");
    private boolean required;

    public CnpValidator() {
    }

    public void initialize(Cnp constraintAnnotation) {
        this.required = constraintAnnotation.required();
    }

    public boolean isValid(final String cnp, final ConstraintValidatorContext context) {
        return this.required || cnp != null && !StringUtils.isBlank(cnp) ? isValid(cnp) : true;
    }

    public static boolean isValid(final String cnp) {
        if (StringUtils.isNotBlank(cnp) && cnp.length() == 13 && CNP_PATTERN.matcher(cnp).matches()) {
            int rest = sum(cnp) % 11;
            int twelveDigit = digitAt(cnp, 12);
            return rest < 10 && rest == twelveDigit || rest == 10 && twelveDigit == 1;
        } else {
            return false;
        }
    }

    private static int sum(final String cnp) {
        return 2 * digitAt(cnp, 0) + 7 * digitAt(cnp, 1) + 9 * digitAt(cnp, 2) + digitAt(cnp, 3) + 4 * digitAt(cnp, 4) + 6 * digitAt(cnp, 5) + 3 * digitAt(cnp, 6) + 5 * digitAt(cnp, 7) + 8 * digitAt(cnp, 8) + 2 * digitAt(cnp, 9) + 7 * digitAt(cnp, 10) + 9 * digitAt(cnp, 11);
    }

    private static int digitAt(final String cnp, final int index) {
        return Integer.parseInt(Character.toString(cnp.charAt(index)));
    }
}

