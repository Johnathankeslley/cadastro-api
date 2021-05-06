package com.example.cadastro.api.models.usuario.dto.requests;

import java.time.LocalDate;

public class UsuarioRequestDTO {

    private String nome;
    private String email;
    private String cpf;
    private LocalDate dataNasc;

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

}
