package com.example.disertatize.utils.files;

import lombok.Generated;

public enum FileTypeEnum {
    PDF("application/pdf"),
    DOC("application/msword"),
    XLS("application/vnd.ms-excel"),
    DOCX("application/vnd.openxmlformats-officedocument.wordprocessingml.document"),
    XLSX("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"),
    JPEG("image/jpeg"),
    PNG("image/png");

    private final String value;

    private FileTypeEnum(String value) {
        this.value = value;
    }

    @Generated
    public String getValue() {
        return this.value;
    }
}
