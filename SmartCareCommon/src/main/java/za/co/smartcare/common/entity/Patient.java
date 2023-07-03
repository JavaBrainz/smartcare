package za.co.smartcare.common.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * This will be the patient Entity class that will represent
 * the patient table from the database with all the neccessary
 * columns and relationships
 *
 * <p>
 *     The patient
 * </p>
 */
@Entity
@Table(name = "PATIENT")
public class Patient implements Serializable {

    private static final long serialVersionUID = -1000000000007L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PATIENT_ID")
    private Long patientId;

    @Column(name = "PATIENT_NAME")
    private String patientName;

    //TODO : Add More fields according to the ERD


    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}
