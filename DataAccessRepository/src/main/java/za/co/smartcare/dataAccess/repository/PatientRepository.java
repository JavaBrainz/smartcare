package za.co.smartcare.dataAccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import za.co.smartcare.common.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
