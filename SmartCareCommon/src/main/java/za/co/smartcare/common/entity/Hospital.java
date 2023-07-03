package za.co.smartcare.common.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * This will be the hospital Entity class that will represent
 * the hospital table from the database with all the neccessary
 * columns and relationships
 *
 * <p>
 *     The Hospital
 * </p>
 */

@Entity
@Table(name = "HOSPITAL")
public class Hospital implements Serializable {

    private static final long serialVersionUID = -1000000000007L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HOSPITAL_ID")
    private Long hospitalId;

    @Column(name = "HOSPITAL_NAME")
    private String hospitalName;

    @Column(name = "HOSPITAL_ADDRESS")
    private String hospitalAddress;

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    /*Todo :
       Add more columns according to the ERD
       Address to be moved as it own Entity
     *
     */

}
