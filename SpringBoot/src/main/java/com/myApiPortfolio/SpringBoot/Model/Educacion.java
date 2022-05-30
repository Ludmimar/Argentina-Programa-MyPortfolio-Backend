
package com.myApiPortfolio.SpringBoot.Model;
import com.sun.istack.NotNull;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    @NotNull      
    String school;
    @NotNull
    String title;
    @NotNull
    String img;
    @NotNull
    String career;
    @NotNull    
    Integer start;
    @NotNull
    String end;
    @NotNull
    Long idPersona;

    public Educacion(Long id, String school, String title, String img, String career, Integer start, String end, Long idPersona) {
        this.id = id;
        this.school = school;
        this.title = title;
        this.img = img;
        this.career = career;
        this.start = start;
        this.end = end;
        this.idPersona = idPersona;
    }

    public Educacion() {
    }

    public Long getId() {
        return id;
    }

    public String getSchool() {
        return school;
    }

    public String getTitle() {
        return title;
    }

    public String getImg() {
        return img;
    }

    public String getCareer() {
        return career;
    }

    public Integer getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }
    
    

}
