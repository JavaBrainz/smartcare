package za.co.smartcare.rescontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.smartcare.common.entity.Hospital;
import za.co.smartcare.service.HospitalService;

import javax.xml.ws.RequestWrapper;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    private HospitalService hospitalService;

    public void setHospitalService(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Hospital>> fetchHospitals()
    {
        return ResponseEntity.ok(hospitalService.allPatients());
    }
}
