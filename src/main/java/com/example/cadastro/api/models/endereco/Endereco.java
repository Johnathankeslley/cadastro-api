package com.example.cadastro.api.models.endereco;

import com.example.cadastro.api.models.usuario.Usuario;
import com.example.cadastro.api.utils.EntidadeAbstrata;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Endereco extends EntidadeAbstrata {

    @NotBlank
    private String logradouro;

    @NotBlank
    private String numero;

    @NotBlank
    private String complemento;

    @NotBlank
    private String bairro;

    @NotBlank
    private String cidade;

    @NotBlank
    private String cep;

    @ManyToOne
    @JsonIgnore
    @NotNull
    private Usuario usuario;

    public Endereco() {
    }

    public Endereco(String logradouro, String numero, String complemento, String bairro, String cidade, String cep, Usuario usuario) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.usuario = usuario;
    }


    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public static EnderecoBuilder builder() {
        return new EnderecoBuilder();
    }

    public static class EnderecoBuilder {
        private  String logradouro;
        private  String numero;
        private  String complemento;
        private  String bairro;
        private  String cidade;
        private  String cep;
        private  Usuario usuario;

        EnderecoBuilder() {
        }

        public EnderecoBuilder logradouro(String logradouro) {
            this.logradouro = logradouro;
            return this;
        }

        public EnderecoBuilder numero(String numero) {
            this.numero = numero;
            return this;
        }

        public EnderecoBuilder complemento(String complemento) {
            this.complemento = complemento;
            return this;
        }

        public EnderecoBuilder bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public EnderecoBuilder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public EnderecoBuilder cep(String cep) {
            this.cep = cep;
            return this;
        }

        public EnderecoBuilder usuario(Usuario usuario) {
            this.usuario = usuario;
            return this;
        }

        public Endereco build() {
            return new Endereco(logradouro, numero, complemento, bairro, cidade, cep, usuario);
        }
    }
}
