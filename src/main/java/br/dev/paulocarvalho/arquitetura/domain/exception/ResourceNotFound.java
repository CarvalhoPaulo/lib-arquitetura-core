package br.dev.paulocarvalho.arquitetura.domain.exception;

public class ResourceNotFound extends BusinessException {
    public ResourceNotFound() {
        super(ArquiteturaErrorCodeEnum.RESOURCE_NOT_FOUND, "Recurso não encontrado");
    }
}
