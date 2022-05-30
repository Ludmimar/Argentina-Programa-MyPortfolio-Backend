package com.myApiPortfolio.SpringBoot.Controler;

import com.myApiPortfolio.SpringBoot.Model.Experiencia;
import com.myApiPortfolio.SpringBoot.Service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"https://ludmila-martos.web.app/"})
public class ExperienciaController {
    
    @Autowired
    ExperienciaService expService;
    @GetMapping("/experiencia/{idPersona}")
    public List<Experiencia> obtenerRegistrosExperiencia(@PathVariable Long idPersona)
    {
        return expService.obtenerRegistroExperiencia(idPersona);
    }
    
    @DeleteMapping("/experiencia/{id}")
    public void eliminarExperiencia(@PathVariable Long id)
    {
        expService.eliminarExperiencia(id);
    }
    
     @PostMapping("/experiencia")
    public Experiencia guardarExperiencia(@RequestBody Experiencia experiencia)
    {
        return expService.guardarExperiencia(experiencia);
    }
    
     @GetMapping(path = {"/experiencia/Buscar/{id}"})
    public Experiencia obtenerUnaExperiencia(@PathVariable Long id)
    {
        return expService.obtenerUnaExperiencia(id);
    }
    
    @PutMapping("/experiencia/editar")
    public void modificarExperiencia(@RequestBody Experiencia experiencia)
    {
        expService.updateExperiencia(experiencia);
    }
    
}
