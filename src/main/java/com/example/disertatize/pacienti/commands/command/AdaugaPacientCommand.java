package com.example.disertatize.pacienti.commands.command;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdaugaPacientCommand extends ModificaPacientCommand {
    @NotNull
    String id;

}
