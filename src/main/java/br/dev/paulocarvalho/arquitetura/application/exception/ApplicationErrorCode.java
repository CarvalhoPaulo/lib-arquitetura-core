package br.dev.paulocarvalho.arquitetura.application.exception;

public interface ApplicationErrorCode {
    String getCodigo();
    String getMessage();
    int getHttpStatus();
}
