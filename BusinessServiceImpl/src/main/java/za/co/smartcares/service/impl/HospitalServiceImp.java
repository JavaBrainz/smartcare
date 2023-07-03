package za.co.smartcares.service.impl;

import za.co.smartcare.common.entity.Hospital;
import za.co.smartcare.dataAccess.repository.HospitalRepository;
import za.co.smartcare.service.HospitalService;

import java.util.List;

public class HospitalServiceImp implements HospitalService {

    private HospitalRepository hospitalRepository;

    public void setHospitalRepository(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @Override
    public List<Hospital> allPatients() {
        return hospitalRepository.findAll();
    }
}
