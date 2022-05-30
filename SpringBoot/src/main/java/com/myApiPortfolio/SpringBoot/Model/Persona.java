
package com.myApiPortfolio.SpringBoot.Model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
//Esto agrega automaticamenbte los getter y setter y no los tengo que escribir
@Getter    @Setter
@Entity
public class Persona {
    @Id  //PARA QUE SE GENERE DE MANERA AUTOMATICA Y DE MANERA INCREMENTAL
    @GeneratedValue(strategy = GenerationType.IDENTITY)        
    Long id;
    
    @Basic
    String name;
    String lastname;
    String position;
    String ubication;
    String image;
    String dateOfBirth;
    String mail;
    String aboutMe;
    String aboutMeImg;   
    String backImage;    
    String logoArgProg;
    String password;

    public Persona() {
    }

    public Persona(Long id, String name, String lastname, String position, String ubication, String image, String dateOfBirth, String mail, String aboutMe, String aboutMeImg, String backImage, String logoArgProg, String password) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.position = position;
        this.ubication = ubication;
        this.image = image;
        this.dateOfBirth = dateOfBirth;
        this.mail = mail;
        this.aboutMe = aboutMe;
        this.aboutMeImg = aboutMeImg;
        this.backImage = backImage;
        this.logoArgProg = logoArgProg;
        this.password = password;
    }
   
}
