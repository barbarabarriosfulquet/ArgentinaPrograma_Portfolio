package com.barbarabarriosfulquet.portfolio.Dto;

import javax.validation.constraints.NotBlank;

public class DtoExperience {
    @NotBlank
    private String nameExp;
    @NotBlank
    private String descriptionExp;
    
    //Constructores

    public DtoExperience() {
    }

    public DtoExperience(String nameExp, String descriptionExp) {
        this.nameExp = nameExp;
        this.descriptionExp = descriptionExp;
    }
    //Getters & Setters

    public String getNameExp() {
        return nameExp;
    }

    public void setNameExp(String nameExp) {
        this.nameExp = nameExp;
    }

    public String getDescriptionExp() {
        return descriptionExp;
    }

    public void setDescriptionExp(String descriptionExp) {
        this.descriptionExp = descriptionExp;
    }
}
