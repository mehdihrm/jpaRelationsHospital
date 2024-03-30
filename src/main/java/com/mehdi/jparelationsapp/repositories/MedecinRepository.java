package com.mehdi.jparelationsapp.repositories;

import com.mehdi.jparelationsapp.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String nom);
}