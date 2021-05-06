package com.example.cadastro.api.controller;


import com.example.cadastro.api.models.usuario.Usuario;
import com.example.cadastro.api.models.usuario.dto.requests.UsuarioRequestDTO;
import com.example.cadastro.api.models.usuario.dto.responses.UsuarioResponseDTO;
import com.example.cadastro.api.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/salvar")
    public ResponseEntity<Usuario> saveUser(@RequestBody @Valid UsuarioRequestDTO usuarioRequestDTO) {
        return new ResponseEntity<>(usuarioService.salvarUsuario(usuarioRequestDTO), HttpStatus.CREATED);
    }

    @GetMapping("/buscar")
    public ResponseEntity<UsuarioResponseDTO> buscarUsuario(@RequestParam Long id) {
        return new ResponseEntity<>(usuarioService.buscarUsuario(id), HttpStatus.OK);
    }



}
