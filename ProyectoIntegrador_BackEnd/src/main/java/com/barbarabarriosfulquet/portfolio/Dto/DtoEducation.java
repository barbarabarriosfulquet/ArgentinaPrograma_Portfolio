package com.barbarabarriosfulquet.portfolio.Dto;

import javax.validation.constraints.NotBlank;

public class DtoEducation {

    @NotBlank
    private String nameEducation;
    @NotBlank
    private String titleEducation;
    @NotBlank
    private String yearEducation;
    @NotBlank
    private String countryEducation;
    @NotBlank
    private String descriptionEducation;

    public DtoEducation() {
    }

    public DtoEducation(String nameEducation, String titleEducation, String yearEducation, String countryEducation, String descriptionEducation) {
        this.nameEducation = nameEducation;
        this.titleEducation = titleEducation;
        this.yearEducation = yearEducation;
        this.countryEducation = countryEducation;
        this.descriptionEducation = descriptionEducation;
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