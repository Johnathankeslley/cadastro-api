package com.example.cadastro.api.services;

import com.example.cadastro.api.error.UsuarioNaoEncontradoException;
import com.example.cadastro.api.models.usuario.Usuario;
import com.example.cadastro.api.models.usuario.dto.requests.UsuarioRequestDTO;
import com.example.cadastro.api.models.usuario.dto.responses.UsuarioResponseDTO;
import com.example.cadastro.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(UsuarioRequestDTO usuarioRequestDTO) {
        return usuarioRepository.save(new Usuario(usuarioRequestDTO));
    }

    public UsuarioResponseDTO buscarUsuario(Long id) {
        return new UsuarioResponseDTO(usuarioRepository.findById(id).orElseThrow(() -> new UsuarioNaoEncontradoException("Usuario nao encontrado")));
    }

}
