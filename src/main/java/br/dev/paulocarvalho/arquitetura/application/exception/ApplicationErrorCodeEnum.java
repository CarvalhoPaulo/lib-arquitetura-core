package br.dev.paulocarvalho.arquitetura.application.exception;

import lombok.Getter;

@Getter
public enum ApplicationErrorCodeEnum implements ApplicationErrorCode {
    ERRO_INTERNO("ARQA0001", "Erro interno.", 500),
    RECURSO_NAO_ENCONTRADO("ARQA0002", "Recurso não encontrado.");

    private final String codigo;
    private final String message;
    private final int httpStatus;

    ApplicationErrorCodeEnum(String codigo, String message, int httpStatus) {
        this.message = message;
        this.codigo = codigo;
        this.httpStatus = httpStatus;
    }

    ApplicationErrorCodeEnum(String codigo, String message) {
        this.message = message;
        this.codigo = codigo;
        this.httpStatus = 400;
    }
}
