package com.example.disertatize.utils.files;

import io.micrometer.common.util.StringUtils;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.Objects;

public class FileConstraintsValidator implements ConstraintValidator<FileConstraints, MultipartFile> {
    private FileSize fileSize;
    private FileType fileType;
    private FileExtension fileExtension;
    private boolean isRequired;

    public FileConstraintsValidator() {
    }

    public void initialize(FileConstraints fileConstraints) {
        this.fileSize = fileConstraints.fileSize();
        this.fileType = fileConstraints.fileType();
        this.fileExtension = fileConstraints.fileExtension();
        this.isRequired = fileConstraints.isRequired();
    }

    public boolean isValid(MultipartFile file, ConstraintValidatorContext context) {
        context.disableDefaultConstraintViolation();
        if (!this.isRequired && Objects.isNull(file)) {
            return true;
        } else if (!Objects.isNull(file) && !file.isEmpty()) {
            if ((long)this.fileSize.maxSizeInMb() * 1024L * 1024L < file.getSize()) {
                this.addToConstraintValidatorContext(context, this.fileSize.message());
                return false;
            } else {
                String fileName = StringUtils.isBlank(file.getOriginalFilename()) ? file.getName() : file.getOriginalFilename();
                if (!StringUtils.isBlank(fileName) && !Arrays.stream(this.fileExtension.fileExtensions()).noneMatch((fileExtensionEnum) -> {
                    return fileName.toLowerCase().endsWith(fileExtensionEnum.getValue());
                })) {
                    if (Arrays.stream(this.fileType.fileTypes()).map(FileTypeEnum::getValue).noneMatch((fileTypeEnumValue) -> {
                        return fileTypeEnumValue.equals(file.getContentType());
                    })) {
                        this.addToConstraintValidatorContext(context, this.fileType.message());
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    this.addToConstraintValidatorContext(context, this.fileExtension.message());
                    return false;
                }
            }
        } else {
            this.addToConstraintValidatorContext(context, "Fișierul încărcat este gol.");
            return false;
        }
    }

    private void addToConstraintValidatorContext(final ConstraintValidatorContext context, String message) {
        context.buildConstraintViolationWithTemplate(message).addConstraintViolation();
    }
}

