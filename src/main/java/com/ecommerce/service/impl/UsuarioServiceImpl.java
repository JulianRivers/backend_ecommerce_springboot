package com.ecommerce.service.impl;

import com.ecommerce.model.entity.Usuario;
import com.ecommerce.respository.UsuarioRepository;
import com.ecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("El usuario " + email + " no existe."));

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        if (usuario.getRol() != null) {
            authorities.add(new SimpleGrantedAuthority(usuario.getRol().getName()));
        } else {
            throw new UsernameNotFoundException("Error en el Login: usuario '" + email + "' no tiene roles asignados!");
        }
        return new User(usuario.getEmail(),usuario.getContrasenia(), authorities);
    }
}

