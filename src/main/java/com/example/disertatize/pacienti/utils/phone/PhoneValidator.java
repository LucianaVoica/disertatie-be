package com.example.disertatize.pacienti.utils.phone;

import io.micrometer.common.util.StringUtils;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class PhoneValidator implements ConstraintValidator<Phone, String> {

    private static final Pattern PHONE_PATTERN = Pattern.compile("^(?:\\+|00)?(4)?(07[0-9]{1}[0-9]{1}|02[0-9]{2}|03[0-9]{2}){1}?(\\s|\\.|\\-)?([0-9]{3}(\\s|\\.|\\-|)){2}$");

    private boolean required;

    public PhoneValidator(){
    }

    public void initialize(Phone phoneConstraints) {
        this.required = phoneConstraints.required();
    }

    public boolean isValid(final String phone, final ConstraintValidatorContext context) {
        if (!this.required && StringUtils.isBlank(phone)) {
            return true;
        } else {
            return StringUtils.isNotBlank(phone) && PHONE_PATTERN.matcher(phone).matches();
        }
    }
}
