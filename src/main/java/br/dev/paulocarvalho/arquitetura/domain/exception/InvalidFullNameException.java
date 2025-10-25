package br.dev.paulocarvalho.arquitetura.domain.exception;

public class InvalidFullNameException extends BusinessException {
    public InvalidFullNameException() {
        super(ArquiteturaErrorCodeEnum.INVALID_FULL_NAME);
    }
}
