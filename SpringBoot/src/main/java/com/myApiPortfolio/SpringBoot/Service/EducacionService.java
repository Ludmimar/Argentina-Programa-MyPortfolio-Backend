
package com.myApiPortfolio.SpringBoot.Service;

import com.myApiPortfolio.SpringBoot.Model.Educacion;
import com.myApiPortfolio.SpringBoot.Repository.EducacionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService{
    
    @Autowired
    EducacionRepository eduRepo;
    
    public List<Educacion> obtenerRegistroEducacion(Long idPersona)
    {
        return eduRepo.findByIdPersona(idPersona);
    }
    
    public void eliminarEducacion(Long id)
    {
        eduRepo.deleteById(id);
    }
    
    public Educacion guardarEducacion(Educacion educacion)
    {
        return eduRepo.save(educacion);
    } 
    
     public Educacion obtenerUnaEducacion(Long Id){            
        return eduRepo.findById(Id).orElse(null);
    }
     
   public void updateEducacion(Educacion educacion)
    {
        eduRepo.save(educacion);
    }   
   
    //no uso por el momento
    //Agrego validaciones      
    public boolean existePorId(Long id){
        return eduRepo.existsById(id);
    }
    public Optional<Educacion> obtenerPorId(Long id){
        return eduRepo.findById(id);
    }
    
   
 }
