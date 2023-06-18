package com.barbarabarriosfulquet.portfolio.Dto;

import javax.validation.constraints.NotBlank;

public class DtoExperience {

    @NotBlank
    private String nameExperience;
    @NotBlank
    private String titleExperience;
    @NotBlank
    private String yearExperience;
    @NotBlank
    private String countryExperience;
    @NotBlank
    private String descriptionExperience;

    public DtoExperience() {
    }

    public DtoExperience(String nameExperience, String titleExperience, String yearExperience, String countryExperience, String descriptionExperience) {
        this.nameExperience = nameExperience;
        this.titleExperience = titleExperience;
        this.yearExperience = yearExperience;
        this.countryExperience = countryExperience;
        this.descriptionExperience = descriptionExperience;
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

    public void setTitleExperience(String titleExperience) {
        this.titleExperience = titleExperience;
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
