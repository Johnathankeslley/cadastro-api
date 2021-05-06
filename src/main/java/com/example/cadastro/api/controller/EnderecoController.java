package com.example.cadastro.api.controller;

import com.example.cadastro.api.models.endereco.Endereco;
import com.example.cadastro.api.models.endereco.dto.request.EnderecoDTO;
import com.example.cadastro.api.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("endereco")
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService;

    @PostMapping("/salvar")
    public ResponseEntity<Endereco> salvarEndereco(@RequestBody @Valid EnderecoDTO enderecoDTO) {
        return new ResponseEntity<>(enderecoService.salvarEndereco(enderecoDTO), HttpStatus.CREATED);
    }

}
