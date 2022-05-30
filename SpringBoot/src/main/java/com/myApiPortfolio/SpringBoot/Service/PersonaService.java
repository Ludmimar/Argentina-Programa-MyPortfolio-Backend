package com.myApiPortfolio.SpringBoot.Service;

import com.myApiPortfolio.SpringBoot.Model.Persona;
import com.myApiPortfolio.SpringBoot.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    PersonaRepository personaRepository;    

    @Override
    public void crearPersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void borrarPersona(Long Id) {
        personaRepository.deleteById(Id);
    }

    @Override
    public List<Persona> listarPersonas() {
        return  personaRepository.findAll();
    }
    
    public Persona obtenerPersona(Long Id){            
        return personaRepository.findById(Id).orElse(null);
    }
    
    public void modificarPersona(Persona persona)
    {
        personaRepository.save(persona);
    }
 
  
}
