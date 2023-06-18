package com.barbarabarriosfulquet.portfolio.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experience implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameExperience;
    private String titleExperience;
    private String yearExperience;
    private String countryExperience;
    private String descriptionExperience;

    public Experience() {
    }

    public Experience(String nameExperience, String titleExperience, String yearExperience, String countryExperience, String descriptionExperience) {
        this.nameExperience = nameExperience;
        this.titleExperience = titleExperience;
        this.yearExperience = yearExperience;
        this.countryExperience = countryExperience;
        this.descriptionExperience = descriptionExperience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameExperience() {
        return nameExperience;
    }

    public void setNameExperience(String nameExperience) {
        this.nameExperience = nameExperience;
    }
    
    public String getTitleExperience() {
        return titleExperience;
    }

    public void setTitleExperience(String nameExperience) {
        this.titleExperience = nameExperience;
    }

    public String getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(String yearExperience) {
        this.yearExperience = yearExperience;
    }

    public String getCountryExperience() {
        return countryExperience;
    }

    public void setCountryExperience(String countryExperience) {
        this.countryExperience = countryExperience;
    }

    public String getDescriptionExperience() {
        return descriptionExperience;
    }

    public void setDescriptionExperience(String descriptionExperience) {
        this.descriptionExperience = descriptionExperience;
    }
}
