package com.portfolio.rodrigomontes.Repository;

import com.portfolio.rodrigomontes.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
