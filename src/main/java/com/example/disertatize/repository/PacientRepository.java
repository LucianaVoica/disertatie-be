package com.example.disertatize.repository;

import com.example.disertatize.entity.Pacienti;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PacientRepository extends JpaRepository<Pacienti, String> {
    @NotNull
    Pacienti save(Pacienti pacienti);

    void delete(Pacienti pacienti);
    List<Pacienti> findAll();
}
