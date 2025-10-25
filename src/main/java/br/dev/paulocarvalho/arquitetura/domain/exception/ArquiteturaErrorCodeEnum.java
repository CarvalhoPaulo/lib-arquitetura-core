package br.dev.paulocarvalho.arquitetura.domain.exception;

import lombok.Getter;

@Getter
public enum ArquiteturaErrorCodeEnum implements BusinessErrorCode {

    INVALID_EMAIL("ARQ001", "Email inválido."),
    INVALID_FULL_NAME("ARQ002", "Nome completo inválido. Precisa ter ao menos um nome e sobrenome."),
    INVALID_CPF("ARQ003", "CPF inválido"),
    RESOURCE_NOT_FOUND("ARQ004", "Recurso não encontrado.");

    private final String codigo;
    private final String message;
    private final int httpStatus;

    ArquiteturaErrorCodeEnum(String codigo, String message, int httpStatus) {
        this.message = message;
        this.codigo = codigo;
        this.httpStatus = httpStatus;
    }

    ArquiteturaErrorCodeEnum(String codigo, String message) {
        this.message = message;
        this.codigo = codigo;
        this.httpStatus = 400;
    }
}
