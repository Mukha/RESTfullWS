package models;

import javax.persistence.*;

/**
 * Created by Мадина on 26.02.2015.
 */
@Entity
@Table(name="diseases")
public class Disease {
    @Id
    @Column(name="disease_id")
    private int diseaseId;
    @Column(name="disease_name")
    private String diseaseName;
    @Column(name="description")
    private String diseaseDescription;

    public int getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(int diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDiseaseDescription() {
        return diseaseDescription;
    }

    public void setDiseaseDescription(String diseaseDescription) {
        this.diseaseDescription = diseaseDescription;
    }
}
