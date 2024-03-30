package com.mehdi.jparelationsapp.service;

import com.mehdi.jparelationsapp.entities.Consultation;
import com.mehdi.jparelationsapp.entities.Medecin;
import com.mehdi.jparelationsapp.entities.Patient;
import com.mehdi.jparelationsapp.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}
