package com.mehdi.jparelationsapp.repositories;

import com.mehdi.jparelationsapp.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
