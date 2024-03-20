package com.example.disertatize.pacienti.utils.messages;

import lombok.experimental.UtilityClass;

@UtilityClass
public class GenreicMessageUtil {
    public static String existaDejaAcestCNP(){
        return BaseMessageService.getMessage("persoana.existaDejaAcestCNP");
    }
}
