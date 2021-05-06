package com.example.cadastro.api.error.handler;

import com.example.cadastro.api.error.ExceptionFilters;
import com.example.cadastro.api.error.UsuarioNaoEncontradoException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.util.Date;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(UsuarioNaoEncontradoException.class)
    public ResponseEntity<ExceptionFilters> usuarioNaoEncontrado(UsuarioNaoEncontradoException usuarioNaoEncontradoException) {
        ExceptionFilters notFound = ExceptionFilters.ExceptionFiltersBuilder.newBuilder()
                .titulo("Usuario não encontrado")
                .timeStamp(new Date().getTime())
                .detalhes(usuarioNaoEncontradoException.getMessage())
                .devMsg(usuarioNaoEncontradoException.getClass().getName())
                .status(HttpStatus.BAD_REQUEST.value())
                .build();
        return new ResponseEntity<>(notFound, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ExceptionFilters> constantViolation(ConstraintViolationException constraintViolationException) {
        ExceptionFilters constraintViolation = ExceptionFilters.ExceptionFiltersBuilder.newBuilder()
                .titulo("Argumentos invalidos")
                .timeStamp(new Date().getTime())
                .devMsg(constraintViolationException.getClass().getName())
                .status(HttpStatus.BAD_REQUEST.value())
                .build();
        return new ResponseEntity<>(constraintViolation, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ExceptionFilters> dataIntegrityViolation(DataIntegrityViolationException dataIntegrityViolationException) {
        ExceptionFilters integrityViolation = ExceptionFilters.ExceptionFiltersBuilder.newBuilder()
                .titulo("Violação de constante!")
                .timeStamp(new Date().getTime())
                .detalhes("Não é possível salvar um email ou cpf já existente!")
                .devMsg(dataIntegrityViolationException.getClass().getName())
                .status(HttpStatus.BAD_REQUEST.value())
                .build();
        return new ResponseEntity<>(integrityViolation, HttpStatus.BAD_REQUEST);
    }

}
