package com.example.disertatize.pacienti.queries;

import com.example.disertatize.entity.Pacienti;
import com.example.disertatize.pacienti.commands.command.AdaugaPacientCommand;
import com.example.disertatize.pacienti.queries.dto.Pacient;
import com.example.disertatize.pacienti.services.pacienti.PacientiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class PacientiReadController {
    @Autowired
    private PacientiService pacientService;

    @GetMapping("/pacienti")
    public List<Pacienti> getAllPacienti() {
        return pacientService.getAllPacienti();
    }

}
