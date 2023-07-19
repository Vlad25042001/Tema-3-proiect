package com.example.Proiectspring.reposiitory;

import com.example.Proiectspring.controller.Echipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EchipeRepository extends JpaRepository<Echipe, Integer> {
}
