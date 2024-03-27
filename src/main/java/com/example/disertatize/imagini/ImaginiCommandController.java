package com.example.disertatize.imagini;

import com.example.disertatize.repository.ImagineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/pacienti/imagini")
@RequiredArgsConstructor
public class ImaginiCommandController {

    @Autowired
    private ImagineRepository imagineRepository;

    @PostMapping("/{idPacient}/upload")
    public String uploadImage(@PathVariable String idPacient, MultipartFile imagine){

    }
}
