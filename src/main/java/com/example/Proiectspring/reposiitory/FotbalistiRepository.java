package com.example.Proiectspring.reposiitory;

import com.example.Proiectspring.controller.Fotbalisti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FotbalistiRepository extends JpaRepository<Fotbalisti, Integer> {
}
