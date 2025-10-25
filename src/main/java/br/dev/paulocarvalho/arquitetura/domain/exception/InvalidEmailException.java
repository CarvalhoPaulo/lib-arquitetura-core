package br.dev.paulocarvalho.arquitetura.domain.exception;

public class InvalidEmailException extends BusinessException {
    public InvalidEmailException() {
        super(ArquiteturaErrorCodeEnum.INVALID_EMAIL, "Email inválido");
    }
}
