
package com.myApiPortfolio.SpringBoot.Model;

import com.sun.istack.NotNull;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    @NotNull    
    String title;
    @NotNull 
    String details;
    @NotNull 
    String img;
    @NotNull 
    String lenguage;
    @NotNull 
    String url;
    @NotNull 
    Long idPersona;

    public Experiencia() {
    }

    public Experiencia(Long id, String title, String details, String img, String lenguage, String url,Long idPersona) {
        this.id = id;
        this.title = title;
        this.details = details;
        this.img = img;
        this.lenguage = lenguage;
        this.url = url;
        this.idPersona = idPersona;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public String getImg() {
        return img;
    }

    public String getLenguage() {
        return lenguage;
    }

    public String getUrl() {
        return url;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setLenguage(String lenguage) {
        this.lenguage = lenguage;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }
    
    
}
