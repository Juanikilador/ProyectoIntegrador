package com.portfolio.Juan.Security.Service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository irolRepository;
    
    public Optional<Rol>getByRolNombre(RolNombre rolNombre) {
        return irolRepository.findByRolNombre(rolNombre); 
    }
    
    public void save(Rol rol) {
        irolRepository.save(rol);
    }
}
