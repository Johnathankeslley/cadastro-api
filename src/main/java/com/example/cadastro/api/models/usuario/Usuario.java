package com.example.cadastro.api.models.usuario;

import com.example.cadastro.api.models.endereco.Endereco;
import com.example.cadastro.api.models.usuario.dto.requests.UsuarioRequestDTO;
import com.example.cadastro.api.utils.EntidadeAbstrata;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Usuario extends EntidadeAbstrata {

    @NotBlank
    private String nome;

    @NotBlank
    @Column(unique = true)
    private String email;

    @NotBlank
    @Column(unique = true)
    private String cpf;

    @NotNull
    private LocalDate dataNasc;

    @JsonIgnore
    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private List<Endereco> endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public Usuario(UsuarioRequestDTO usuarioRequestDTO) {
        this.nome = usuarioRequestDTO.getNome();
        this.email = usuarioRequestDTO.getEmail();
        this.cpf = usuarioRequestDTO.getCpf();
        this.dataNasc = usuarioRequestDTO.getDataNasc();
    }

    public Usuario() {
    }

}
