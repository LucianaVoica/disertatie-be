package com.example.disertatize.utils.files;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {FileConstraintsValidator.class})
public @interface FileConstraints {
    String message() default "Fișierul nu respectă criteriile de validitate.";

    boolean isRequired() default true;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    FileSize fileSize() default @FileSize;

    FileType fileType() default @FileType;

    FileExtension fileExtension() default @FileExtension;
}
