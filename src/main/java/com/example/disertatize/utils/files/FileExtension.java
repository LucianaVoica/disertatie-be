package com.example.disertatize.utils.files;

import jakarta.validation.Payload;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.RUNTIME)
public @interface FileExtension {
    @AliasFor("fileExtensions")
    FileExtensionEnum[] value() default {FileExtensionEnum.PDF};

    String message() default "Formatul fișierului pe care doriți să îl încărcați nu este permis.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @AliasFor("value")
    FileExtensionEnum[] fileExtensions() default {FileExtensionEnum.PDF};
}
