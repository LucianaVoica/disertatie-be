package com.example.disertatize.pacienti.commands.command;


import com.example.disertatize.utils.cnp.Cnp;
import com.example.disertatize.utils.phone.Phone;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModificaPacientCommand {

    @NotBlank
    @Size(max=50)
    String nume;

    @NotBlank
    @Size(max=50)
    String prenume;

    @NotBlank
    @Cnp
    String cnp;

    @NotBlank
    String serieCI;
    @NotBlank
    String numarCI;

    @NotBlank
    @Phone
    String telefon;

    @NotBlank
    @Size(max = 255)
    String email;

    // Vedem daca ramen
//    @NotBlank
//    @Size(max = 50)
//    String medicPrecedent;

//    @NotBlank
//    @Size(max = 255)
//    String observatii;

//    @NotBlank
//    @Size(max=250)
//    String diagnostic;

    // conditie pt a fi in trecut, nu @Future
//    @NotNull
//    LocalDateTime dataInregistrae;


}
