package com.portfolio.Juan.Security.Service;

import com.portfolio.Juan.Security.Enums.Entity.Usuario;
import com.portfolio.Juan.Security.Repository.IUsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return iusuarioRepository.findByNombreUsuario(nombreUsuario); 
    }
    
    public boolean existByNombreUsuario(String nombreUsuario) {
        return iusuarioRepository.existByNombreUsuario(nombreUsuario);
    }
    
    public boolean existByEmail(String email) {
        return iusuarioRepository.existByEmail(email);
    }
    
    public void save(Usuario usuario) {
        iusuarioRepository.save(usuario);
    }
}
