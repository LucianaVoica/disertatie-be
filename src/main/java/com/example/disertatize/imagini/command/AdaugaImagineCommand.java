package com.example.disertatize.imagini.command;

import com.example.disertatize.utils.files.FileConstraints;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class AdaugaImagineCommand {

    @NotNull
     String idImagine;

    @NotNull
     String idPacient;

   @FileConstraints
   MultipartFile fileName;

    @NotBlank
     String predictie;
    @NotBlank
     String observatii;
}
