package za.co.smartcare.dataAccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.smartcare.common.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital,Long> {

}
