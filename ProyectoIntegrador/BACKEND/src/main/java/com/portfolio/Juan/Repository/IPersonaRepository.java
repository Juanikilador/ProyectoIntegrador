package com.portfolio.Juan.Repository;

import com.portfolio.Juan.Entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,LSong> {

    public List<Persona> findAll();
    
}
