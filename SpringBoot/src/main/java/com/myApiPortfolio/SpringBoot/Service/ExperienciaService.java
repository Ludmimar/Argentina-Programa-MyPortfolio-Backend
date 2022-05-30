
package com.myApiPortfolio.SpringBoot.Service;

import com.myApiPortfolio.SpringBoot.Model.Experiencia;
import com.myApiPortfolio.SpringBoot.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService {
    
    @Autowired
    ExperienciaRepository expRepo;
    
    public List<Experiencia> obtenerRegistroExperiencia(Long idPersona)
    {
        return expRepo.findByIdPersona(idPersona);
    }
    
    public void eliminarExperiencia(Long id)
    {
        expRepo.deleteById(id);
    }
    
    public Experiencia guardarExperiencia(Experiencia experiencia)
    {
        return expRepo.save(experiencia);
    } 
    
    public Experiencia obtenerUnaExperiencia(Long Id){            
        return expRepo.findById(Id).orElse(null);
    }
     
   public void updateExperiencia(Experiencia experiencia)
    {
        expRepo.save(experiencia);
    }     
    
}
