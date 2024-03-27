package com.example.disertatize.repository;

import com.example.disertatize.entity.Imagine;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImagineRepository extends JpaRepository<Imagine, String> {

    @NotNull
    Imagine save (Imagine imagine);

    void delete (Imagine imagine);

    List<Imagine> findAll();

}
