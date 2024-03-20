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
@Table(name = "Pacienti")
public class Pacienti implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "nume")
    private String nume;

    @Column(name = "prenume")
    private String prenume;

    @Column(name = "cnp")
    private String cnp;

    @Column(name = "serieCI")
    private  String serieCI;

    @Column(name = "numarcI")
    private String numarCI;

    @Column(name = "telefon")
    private String telefon;

    @Column(name = "email")
    private String email;



}
