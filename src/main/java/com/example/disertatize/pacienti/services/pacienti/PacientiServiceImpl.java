package com.example.disertatize.pacienti.services.pacienti;

import com.example.disertatize.entity.Pacienti;
import com.example.disertatize.pacienti.commands.command.AdaugaPacientCommand;
import com.example.disertatize.pacienti.queries.dto.Pacient;
import com.example.disertatize.repository.PacientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PacientiServiceImpl implements  PacientiService{
    private final PacientRepository pacientRepository;

    @Override
    public List<Pacienti> getAllPacienti() {
        List<Pacienti> pacienti = pacientRepository.findAll();
        return pacienti;

    }

    @Override
    public Optional<Pacienti> getPacientById(String id) {
        return pacientRepository.findById(id);
    }

    @Override
    public void adaugaPacient(AdaugaPacientCommand pacientCommand) {
        Pacienti pacienti = convertToEntity(pacientCommand);
        pacientRepository.save(pacienti);
    }

    @Override
    public void modificaPacient(String id, Pacient pacient) {

        Pacienti pacientExistent = pacientRepository.findById(String.valueOf(id)).orElseThrow(() ->new IllegalArgumentException("Pacientul  nu a fost gasit"));

            pacientExistent.setNume(pacient.getNume());
            pacientExistent.setPrenume(pacient.getPrenume());
            pacientExistent.setCnp(pacient.getCnp());
            pacientExistent.setSerieCI(pacient.getSerieCI());
            pacientExistent.setNumarCI(pacient.getNumarCI());
            pacientExistent.setTelefon(pacient.getTelefon());
            pacientExistent.setEmail(pacient.getEmail());

            pacientRepository.save(pacientExistent);
    }

    @Override
    public void stergePacient(String id) {
      Pacienti pacienti = pacientRepository.findById(id).orElse(null);
      if(pacienti !=null){
          pacientRepository.delete(pacienti);
      }
    }



    private AdaugaPacientCommand convertToCommand(Pacienti pacienti){
        AdaugaPacientCommand pacientCommand = new AdaugaPacientCommand();
         pacientCommand.setNume(pacientCommand.getNume());
         pacientCommand.setPrenume(pacientCommand.getPrenume());
         pacientCommand.setCnp(pacientCommand.getCnp());
         pacientCommand.setSerieCI(pacientCommand.getSerieCI());
         pacientCommand.setNumarCI(pacientCommand.getNumarCI());
         pacientCommand.setTelefon(pacientCommand.getTelefon());
         pacientCommand.setEmail(pacientCommand.getEmail());

         return pacientCommand;
    };

    private Pacienti convertToEntity(AdaugaPacientCommand pacientCommand){
        Pacienti pacienti = new Pacienti();
        pacienti.setNume(pacientCommand.getNume());
        pacienti.setPrenume(pacientCommand.getPrenume());
        pacienti.setCnp(pacientCommand.getCnp());
        pacienti.setSerieCI(pacientCommand.getSerieCI());
        pacienti.setNumarCI(pacientCommand.getNumarCI());
        pacienti.setTelefon(pacientCommand.getTelefon());
        pacienti.setEmail(pacientCommand.getEmail());

        return pacienti;
    }


}

