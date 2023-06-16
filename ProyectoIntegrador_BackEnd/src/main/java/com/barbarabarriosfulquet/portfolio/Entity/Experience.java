package com.barbarabarriosfulquet.portfolio.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameExp;
    private String descriptionExp;

    //Constructores
    public Experience() {
    }

    public Experience(String nameExp, String descriptionExp) {
        this.nameExp = nameExp;
        this.descriptionExp = descriptionExp;
    }

    //Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
