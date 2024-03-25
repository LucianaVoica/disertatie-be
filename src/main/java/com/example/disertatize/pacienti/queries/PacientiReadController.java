package com.example.disertatize.pacienti.queries;

import com.example.disertatize.entity.Pacienti;
import com.example.disertatize.pacienti.services.pacienti.PacientiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class PacientiReadController {
    @Autowired
    private PacientiService pacientService;

    @GetMapping("/pacienti")
    public List<Pacienti> getAllPacienti() {
        return pacientService.getAllPacienti();
    }


    @GetMapping("/pacienti/{id}")
    public Optional<Pacienti> getPacientById(@PathVariable String id){
        return  pacientService.getPacientById(id);
    }



}
