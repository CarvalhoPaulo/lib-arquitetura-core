package br.dev.paulocarvalho.arquitetura.domain.exception;

import lombok.Getter;

@Getter
public enum BusinessErrorCodeEnum implements BusinessErrorCode {
    TOKEN_INVALIDO("ARQB0001", "Token inválido.");

    private final String codigo;
    private final String message;
    private final int httpStatus;

    BusinessErrorCodeEnum(String codigo, String message, int httpStatus) {
        this.message = message;
        this.codigo = codigo;
        this.httpStatus = httpStatus;
    }

    BusinessErrorCodeEnum(String codigo, String message) {
        this.message = message;
        this.codigo = codigo;
        this.httpStatus = 400;
    }
}
