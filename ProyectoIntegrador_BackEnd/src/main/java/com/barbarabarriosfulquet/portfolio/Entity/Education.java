package com.barbarabarriosfulquet.portfolio.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameEducation;
    private String titleEducation;
    private String yearEducation;
    private String countryEducation;
    private String descriptionEducation;

    public Education() {
    }

    public Education(String nameEducation, String titleEducation, String yearEducation, String countryEducation, String descriptionEducation) {
        this.nameEducation = nameEducation;
        this.titleEducation = titleEducation;
        this.yearEducation = yearEducation;
        this.countryEducation = countryEducation;
        this.descriptionEducation = descriptionEducation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameEducation() {
        return nameEducation;
    }

    public void setNameEducation(String nameEducation) {
        this.nameEducation = nameEducation;
    }

    public String getTitleEducation() {
        return titleEducation;
    }

    public void setTitleEducation(String titleEducation) {
        this.titleEducation = titleEducation;
    }

    public String getYearEducation() {
        return yearEducation;
    }

    public void setYearEducation(String yearEducation) {
        this.yearEducation = yearEducation;
    }

    public String getCountryEducation() {
        return countryEducation;
    }

    public void setCountryEducation(String countryEducation) {
        this.countryEducation = countryEducation;
    }

    public String getDescriptionEducation() {
        return descriptionEducation;
    }

    public void setDescriptionEducation(String descriptionEducation) {
        this.descriptionEducation = descriptionEducation;
    }
}