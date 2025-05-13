package br.dev.paulocarvalho.arquitetura.domain.mapper;

import br.dev.paulocarvalho.arquitetura.domain.exception.BusinessException;
import br.dev.paulocarvalho.arquitetura.domain.model.Model;

import org.mapstruct.MappingTarget;
import java.util.List;

public interface AbstractModelMapper<MODEL extends Model<?>, DATA> {

    MODEL toModel(DATA data) throws BusinessException;
    DATA toData(MODEL entity) throws BusinessException;
    DATA mergeData(MODEL entity, @MappingTarget DATA data) throws BusinessException;
    List<MODEL> toModelList(List<DATA> dataList) throws BusinessException;
    List<DATA> toDataList(List<MODEL> entityList) throws BusinessException;
}
