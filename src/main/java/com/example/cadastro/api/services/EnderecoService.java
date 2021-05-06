package com.example.cadastro.api.services;

import com.example.cadastro.api.models.endereco.Endereco;
import com.example.cadastro.api.models.endereco.dto.request.EnderecoDTO;
import com.example.cadastro.api.models.endereco.factory.EnderecoFactory;
import com.example.cadastro.api.models.viacep.ViaCep;
import com.example.cadastro.api.network.ViaCepClient;
import com.example.cadastro.api.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    @Autowired
    EnderecoFactory enderecoFactory;

    @Autowired
    ViaCepClient viaCepClient;

    public ViaCep buscarCep(String cep) {
        return viaCepClient.viaCep(cep);
    }

    public Endereco salvarEndereco(EnderecoDTO enderecoDTO) {
        ViaCep viaCep = buscarCep(enderecoDTO.getCep());

        if (viaCep.getCep() != null) {
            Endereco endereco = enderecoFactory.enderecoDeViaCep(viaCep, enderecoDTO.getUsuarioId());

            if (endereco.getComplemento().isEmpty()) {
                endereco.setComplemento(enderecoDTO.getComplemento());
            }
            endereco.setNumero(enderecoDTO.getNumero());
            endereco.setCidade(enderecoDTO.getCidade());

            return enderecoRepository.save(endereco);

        } else {
            return enderecoRepository.save(enderecoFactory.enderecoDeEnderecoDTO(enderecoDTO));
        }
    }

}
