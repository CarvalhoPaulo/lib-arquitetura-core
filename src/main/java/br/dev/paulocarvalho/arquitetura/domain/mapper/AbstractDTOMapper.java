package br.dev.paulocarvalho.arquitetura.domain.mapper;

import br.dev.paulocarvalho.arquitetura.domain.exception.BusinessException;

import java.util.List;

public interface AbstractDTOMapper<MODEL, DTO> {

    MODEL toModel(DTO data) throws BusinessException;
    DTO toDTO(MODEL entity) throws BusinessException;
    List<MODEL> toModelList(List<DTO> dataList) throws BusinessException;
    List<DTO> toDTOList(List<MODEL> entityList) throws BusinessException;

}
