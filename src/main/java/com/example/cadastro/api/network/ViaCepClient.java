package com.example.cadastro.api.network;

import com.example.cadastro.api.models.viacep.ViaCep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viaCep", url = "https://viacep.com.br/ws/")
public interface ViaCepClient {

    @GetMapping("{cep}/json")
    ViaCep viaCep(@PathVariable("cep") String cep);

}
