package com.example.disertatize.utils.messages;

import org.springframework.context.MessageSource;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class BaseMessageService {
    public static BaseMessageService INSTANCE;

    private final MessageSource messageSource;

    public BaseMessageService(MessageSource messageSource) {
        this.messageSource = messageSource;
        INSTANCE = this;
    }

    public static String getMessage(String code) {
        return BaseMessageService.INSTANCE.messageSource.getMessage(code, null, Locale.getDefault());
    }

    public static String getMessage(String code, @Nullable String... args) {
        return BaseMessageService.INSTANCE.messageSource.getMessage(code, args, Locale.getDefault());
    }

}
