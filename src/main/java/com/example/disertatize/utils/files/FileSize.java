package com.example.disertatize.utils.files;

import jakarta.validation.Payload;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.RUNTIME)
public @interface FileSize {
    @AliasFor("maxSizeInMb")
    int value() default 50;

    String message() default "Dimensiunea maximă a fișierului este depășită.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @AliasFor("value")
    int maxSizeInMb() default 50;
}
