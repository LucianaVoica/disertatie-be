package com.example.disertatize.pacienti.commands;


import com.example.disertatize.pacienti.commands.command.AdaugaPacientCommand;
import com.example.disertatize.pacienti.services.pacienti.PacientiService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/pacienti")
@RequiredArgsConstructor
public class PacientiCommandController {

    @Autowired
    private PacientiService pacientService;

    @PostMapping("/adauga")
    public void adaugaPacient(@RequestBody AdaugaPacientCommand pacient) {
        pacientService.adaugaPacient(pacient);
    }

    @PutMapping("/{id}/modifica")
    public void modificaPacient(@PathVariable String id, @RequestBody AdaugaPacientCommand pacient) {
        pacientService.modificaPacient(id, pacient);
    }

    @DeleteMapping("/{id}/sterge")
    public void stergePacient(@PathVariable String id) {
        pacientService.stergePacient(id);
    }


}