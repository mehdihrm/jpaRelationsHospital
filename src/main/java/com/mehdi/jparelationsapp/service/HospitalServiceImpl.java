package com.mehdi.jparelationsapp.service;

import com.mehdi.jparelationsapp.entities.Consultation;
import com.mehdi.jparelationsapp.entities.Medecin;
import com.mehdi.jparelationsapp.entities.Patient;
import com.mehdi.jparelationsapp.entities.RendezVous;
import com.mehdi.jparelationsapp.repositories.ConsultationRepository;
import com.mehdi.jparelationsapp.repositories.MedecinRepository;
import com.mehdi.jparelationsapp.repositories.PatientRepository;
import com.mehdi.jparelationsapp.repositories.RendezVousRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@AllArgsConstructor
@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {


    private PatientRepository patientRepository;

    private MedecinRepository medecinRepository;

    private RendezVousRepository rendezVousRepository;

    private ConsultationRepository consultationRepository;

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
