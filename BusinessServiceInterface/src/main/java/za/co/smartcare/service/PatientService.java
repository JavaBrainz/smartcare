package za.co.smartcare.service;

import za.co.smartcare.common.entity.Patient;

import java.util.List;

public interface PatientService {
    Patient savePatient(Patient patient);
    List<Patient> patientsList();
}
