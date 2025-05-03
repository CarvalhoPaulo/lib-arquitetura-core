package br.dev.paulocarvalho.arquitetura.domain.exception;

public interface BusinessErrorCode {
    String getCodigo();
    String getMessage();
    int getHttpStatus();
}
