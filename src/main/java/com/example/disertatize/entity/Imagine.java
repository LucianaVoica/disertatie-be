package com.example.disertatize.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Imagini")
public class Imagine implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idImagine", nullable = false)
    private String idImagine;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPacient", nullable = false)
    private String idPacient;

    @Column(name = "fileName")
    private String fileName;

    @Column(name = "predictie")
    private String predictie;

    @Column(name = "observatii")
    private String observatii;
}
