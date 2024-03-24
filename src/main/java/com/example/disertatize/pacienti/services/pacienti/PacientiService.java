package com.example.disertatize.pacienti.services.pacienti;

import com.example.disertatize.entity.Pacienti;
import com.example.disertatize.pacienti.commands.command.AdaugaPacientCommand;

import java.util.List;
import java.util.Optional;

public interface PacientiService {
    List<Pacienti> getAllPacienti();
    Optional<Pacienti> getPacientById(String id);
    void adaugaPacient(AdaugaPacientCommand pacient);
    void modificaPacient(String id, AdaugaPacientCommand pacient);
    void stergePacient(String id);
}
