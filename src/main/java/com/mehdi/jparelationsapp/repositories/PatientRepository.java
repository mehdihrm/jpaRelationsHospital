package com.mehdi.jparelationsapp.repositories;

import com.mehdi.jparelationsapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByNom(String name);
}
