package br.dev.paulocarvalho.arquitetura.domain.exception;

public class InvalidCpfException extends BusinessException {
    public InvalidCpfException() {
        super(ArquiteturaErrorCodeEnum.INVALID_CPF, "CPF inválido");
    }
}
