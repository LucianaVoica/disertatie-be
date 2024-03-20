package com.example.disertatize.repository;

import com.example.disertatize.entity.Pacienti;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PacientRepository extends JpaRepository<Pacienti, String> {
    Pacienti save(Pacienti pacienti);
    Optional<Pacienti> findById(String id);
    void delete(Pacienti pacienti);
    List<Pacienti> findAll();
}
