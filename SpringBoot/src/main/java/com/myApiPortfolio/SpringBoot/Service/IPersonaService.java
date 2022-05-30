
package com.myApiPortfolio.SpringBoot.Service;

import com.myApiPortfolio.SpringBoot.Model.Persona;
import java.util.List;


public interface IPersonaService {
   
    public void crearPersona(Persona persona);
    public void borrarPersona(Long Id);
    public List<Persona> listarPersonas();
    
}
