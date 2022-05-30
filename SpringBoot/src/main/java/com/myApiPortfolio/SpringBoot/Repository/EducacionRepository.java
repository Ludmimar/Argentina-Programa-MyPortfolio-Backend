
package com.myApiPortfolio.SpringBoot.Repository;

import com.myApiPortfolio.SpringBoot.Model.Educacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long>{
     public List<Educacion> findByIdPersona(Long idPersona);
}
