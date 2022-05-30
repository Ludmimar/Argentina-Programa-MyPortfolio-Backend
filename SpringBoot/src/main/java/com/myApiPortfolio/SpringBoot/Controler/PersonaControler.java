package com.myApiPortfolio.SpringBoot.Controler;

import com.myApiPortfolio.SpringBoot.Model.Persona;
import com.myApiPortfolio.SpringBoot.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"https://ludmila-martos.web.app/"}) //no puede faltar, es un grado de seguridad
public class PersonaControler {
    @Autowired
    PersonaService personaService;
    
    @GetMapping("/persona/saludar/{nombre}")
    public String saludar(@PathVariable String nombre)
    {
        return "Bienvenidos a Argentina Programa " + nombre;
    }
   
    @GetMapping("/persona/saludar")
    public String saludar(@RequestParam String nombre,@RequestParam String apellido )
    {
        return "Bienvenidos a Argentina Programa " + nombre + " " + apellido;
    }
    
    @PostMapping("/persona")
    public void crearPersona(@RequestBody Persona persona)
    {
        personaService.crearPersona(persona);
    }
    
    @DeleteMapping("/persona/{id}")
    public void borrarPersona(@PathVariable Long id)
    {
        personaService.borrarPersona(id);
    }
    
    @GetMapping("/persona/{id}")
    @ResponseBody
    public Persona obtenerPersona(@PathVariable Long id)
    {
        return personaService.obtenerPersona(id);
    }
    
    @PutMapping("/persona")
    public void modificarPersona(@RequestBody Persona persona)
    {
        personaService.modificarPersona(persona);
    }
     
}
