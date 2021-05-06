package com.example.cadastro.api.models.viacep;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ViaCep {

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("logradouro")
    private String logradouro;

    @JsonProperty("complemento")
    private String complemento;

    @JsonProperty("bairro")
    private String bairro;

    @JsonProperty("localidade")
    private String localidade;

    public ViaCep() {
    }

    public String getCep() {
        return this.cep;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getLocalidade() {
        return this.localidade;
    }

    @JsonProperty("cep")
    public void setCep(String cep) {
        this.cep = cep;
    }

    @JsonProperty("logradouro")
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @JsonProperty("complemento")
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @JsonProperty("bairro")
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @JsonProperty("localidade")
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ViaCep)) return false;
        final ViaCep other = (ViaCep) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$cep = this.getCep();
        final Object other$cep = other.getCep();
        if (this$cep == null ? other$cep != null : !this$cep.equals(other$cep)) return false;
        final Object this$logradouro = this.getLogradouro();
        final Object other$logradouro = other.getLogradouro();
        if (this$logradouro == null ? other$logradouro != null : !this$logradouro.equals(other$logradouro))
            return false;
        final Object this$complemento = this.getComplemento();
        final Object other$complemento = other.getComplemento();
        if (this$complemento == null ? other$complemento != null : !this$complemento.equals(other$complemento))
            return false;
        final Object this$bairro = this.getBairro();
        final Object other$bairro = other.getBairro();
        if (this$bairro == null ? other$bairro != null : !this$bairro.equals(other$bairro)) return false;
        final Object this$localidade = this.getLocalidade();
        final Object other$localidade = other.getLocalidade();
        if (this$localidade == null ? other$localidade != null : !this$localidade.equals(other$localidade))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ViaCep;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $cep = this.getCep();
        result = result * PRIME + ($cep == null ? 43 : $cep.hashCode());
        final Object $logradouro = this.getLogradouro();
        result = result * PRIME + ($logradouro == null ? 43 : $logradouro.hashCode());
        final Object $complemento = this.getComplemento();
        result = result * PRIME + ($complemento == null ? 43 : $complemento.hashCode());
        final Object $bairro = this.getBairro();
        result = result * PRIME + ($bairro == null ? 43 : $bairro.hashCode());
        final Object $localidade = this.getLocalidade();
        result = result * PRIME + ($localidade == null ? 43 : $localidade.hashCode());
        return result;
    }

    public String toString() {
        return "ViaCep(cep=" + this.getCep() + ", logradouro=" + this.getLogradouro() + ", complemento=" + this.getComplemento() + ", bairro=" + this.getBairro() + ", localidade=" + this.getLocalidade() + ")";
    }
}
