package za.co.smartcares.service.impl;

import za.co.smartcare.common.entity.Patient;
import za.co.smartcare.dataAccess.repository.PatientRepository;
import za.co.smartcare.service.PatientService;

import java.util.List;

public class PatientServiceImp implements PatientService {

    private  PatientRepository patientRepository;

    public void setPatientRepository(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> patientsList() {
        return patientRepository.findAll();
    }
}
