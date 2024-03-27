package com.example.disertatize.services;

import com.example.disertatize.entity.Imagine;
import com.example.disertatize.imagini.command.AdaugaImagineCommand;

import java.util.List;
import java.util.Optional;

public interface ImagineService {

    List<Imagine> getAllImagini();

    Optional<Imagine> getImagineById(String idImagine);

    void adaugaImagine(AdaugaImagineCommand imagineCommand);

    void stergeImagine(String idImagine);
}
