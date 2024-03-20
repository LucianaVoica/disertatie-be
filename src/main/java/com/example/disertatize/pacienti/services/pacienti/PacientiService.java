package com.example.disertatize.pacienti.services.pacienti;

import com.example.disertatize.entity.Pacienti;
import com.example.disertatize.pacienti.commands.command.AdaugaPacientCommand;
import com.example.disertatize.pacienti.queries.dto.Pacient;

import java.util.List;

public interface PacientiService {
    List<Pacienti> getAllPacienti();
    AdaugaPacientCommand getPacientById(String id);
    void adaugaPacient(AdaugaPacientCommand pacient);
    void modificaPacient(String id, AdaugaPacientCommand pacient);
    void stergePacient(String id);
}
