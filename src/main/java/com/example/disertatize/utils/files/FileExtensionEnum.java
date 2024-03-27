package com.example.disertatize.utils.files;

import lombok.Generated;

public enum FileExtensionEnum {
    PDF(".pdf"),
    DOC(".doc"),
    XLS(".xls"),
    DOCX(".docx"),
    XLSX(".xlsx"),
    JPEG(".jpeg"),
    JPG(".jpg"),
    PNG(".png");

    private final String value;

    private FileExtensionEnum(String value) {
        this.value = value;
    }

    @Generated
    public String getValue() {
        return this.value;
    }
}
