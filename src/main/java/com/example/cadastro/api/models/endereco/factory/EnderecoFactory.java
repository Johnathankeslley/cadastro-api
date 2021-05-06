package com.example.cadastro.api.models.endereco.factory;

import com.example.cadastro.api.error.UsuarioNaoEncontradoException;
import com.example.cadastro.api.models.endereco.Endereco;
import com.example.cadastro.api.models.endereco.dto.request.EnderecoDTO;
import com.example.cadastro.api.models.usuario.Usuario;
import com.example.cadastro.api.models.viacep.ViaCep;
import com.example.cadastro.api.repository.UsuarioRepository;

import org.springframework.stereotype.Component;


@Component
public class EnderecoFactory {

    private final UsuarioRepository usuarioRepository;

    public EnderecoFactory(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Endereco enderecoDeEnderecoDTO(EnderecoDTO dto) {
        Usuario usuario = usuarioRepository.findById(dto.getUsuarioId())
                .orElseThrow(() -> new UsuarioNaoEncontradoException("Usuario não encontrado"));

        return Endereco.builder()
                .logradouro(dto.getLogradouro())
                .numero(dto.getNumero())
                .complemento(dto.getComplemento())
                .bairro(dto.getBairro())
                .cidade(dto.getCidade())
                .cep(dto.getCep())
                .usuario(usuario)
                .build();
    }


    public Endereco enderecoDeViaCep(ViaCep viaCep, Long usuarioId) {
        Usuario usuario = usuarioRepository.findById(usuarioId)
                .orElseThrow(() -> new UsuarioNaoEncontradoException("Usuario não encontrado"));

        return Endereco.builder()
                .logradouro(viaCep.getLogradouro())
                .complemento(viaCep.getComplemento())
                .bairro(viaCep.getBairro())
                .cep(viaCep.getCep())
                .usuario(usuario)
                .build();
    }
}
