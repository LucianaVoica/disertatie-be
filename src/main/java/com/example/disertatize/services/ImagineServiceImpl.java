package com.example.disertatize.services;

import com.example.disertatize.entity.Imagine;
import com.example.disertatize.imagini.command.AdaugaImagineCommand;
import com.example.disertatize.repository.ImagineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ImagineServiceImpl implements ImagineService{

    private final ImagineRepository imagineRepository;

    @Override
    public List<Imagine> getAllImagini() {
        List<Imagine> imagines = imagineRepository.findAll();
        return imagines;
    }

    @Override
    public Optional<Imagine> getImagineById(String idImagine) { return imagineRepository.findById(idImagine);}

    @Override
    public void adaugaImagine(AdaugaImagineCommand imagineCommand){
        Imagine imagine = convert(imagineCommand);
        imagineRepository.save(imagine);
    }

    @Override
    public void stergeImagine( String idImagine){
        Imagine imagine = imagineRepository.findById(idImagine).orElse(null);
        if(imagine !=null){
            imagineRepository.delete(imagine);
        }
    }


    private Imagine convert( AdaugaImagineCommand imagineCommand){
        Imagine imagine = new Imagine();
        imagine.setPredictie(imagineCommand.getPredictie());
        imagine.setObservatii(imagineCommand.getObservatii());
        imagine.setFileName(imagine.getFileName());

        return imagine;
    }
}
