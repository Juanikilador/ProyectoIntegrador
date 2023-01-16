package com.portfolio.Juan.Security.Service;

import com.portfolio.Juan.Security.Enums.Entity.Usuario;
import com.portfolio.Juan.Security.Enums.Entity.UsuarioPrincipal;
import org.springframework.security.core.userdetails.UserDetailsService; 
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImpl implements UserDetailsService{
    @Autowired 
    UsuarioService usuarioService;
    
    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);
    }
    
}
