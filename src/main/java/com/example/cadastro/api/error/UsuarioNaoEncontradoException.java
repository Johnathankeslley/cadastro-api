package com.example.cadastro.api.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UsuarioNaoEncontradoException extends RuntimeException{

    public UsuarioNaoEncontradoException(String msg) {
        super(msg);
    }

}
