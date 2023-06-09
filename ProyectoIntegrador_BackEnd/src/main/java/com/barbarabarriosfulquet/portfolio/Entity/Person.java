package com.barbarabarriosfulquet.portfolio.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "Error: Longitud máxima 50 caracteres")
    private String name;
    
    @NotNull
    @Size(min = 1, max = 50, message = "Error: Longitud máxima 50 caracteres")
    private String lastname;
    
    @Size(min = 0, max = 50, message = "Error image")
    private String img;    
    
}