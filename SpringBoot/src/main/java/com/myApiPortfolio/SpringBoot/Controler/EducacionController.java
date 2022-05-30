package com.myApiPortfolio.SpringBoot.Controler;

import com.myApiPortfolio.SpringBoot.Model.Educacion;
import com.myApiPortfolio.SpringBoot.Service.EducacionService;
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
public class EducacionController {
    
    @Autowired
    EducacionService eduService;
    @GetMapping("/educacion/{idPersona}")
    public List<Educacion> obtenerRegistrosEducacion(@PathVariable Long idPersona)
    {
        return eduService.obtenerRegistroEducacion(idPersona);
    }
    
    @DeleteMapping("/educacion/{id}")
    public void eliminarEducacion(@PathVariable Long id)
    {
        eduService.eliminarEducacion(id);
    }    
    
    @PostMapping("/educacion")
    public Educacion guardarEducacion(@RequestBody Educacion educacion)
    {
        return eduService.guardarEducacion(educacion);
    }
        
     @PutMapping("/educacion/editar")
    public void modificarEducacion(@RequestBody Educacion educacion)
    {
        eduService.updateEducacion(educacion);
    }  
    }
