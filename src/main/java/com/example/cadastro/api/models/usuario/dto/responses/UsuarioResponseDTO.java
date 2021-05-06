package com.example.cadastro.api.models.usuario.dto.responses;

import com.example.cadastro.api.models.endereco.Endereco;
import com.example.cadastro.api.models.usuario.Usuario;

import java.time.LocalDate;
import java.util.List;

public class UsuarioResponseDTO {

    private String nome;
    private String email;
    private String cpf;
    private LocalDate dataNasc;
    private List<Endereco> enderecos;

    public UsuarioResponseDTO(Usuario usuario) {
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.cpf = usuario.getCpf();
        this.dataNasc = usuario.getDataNasc();
        this.enderecos = usuario.getEndereco();
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCpf() {
        return this.cpf;
    }

    public LocalDate getDataNasc() {
        return this.dataNasc;
    }

    public List<Endereco> getEnderecos() {
        return this.enderecos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

}
