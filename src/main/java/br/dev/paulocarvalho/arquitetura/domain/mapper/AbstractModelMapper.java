package br.dev.paulocarvalho.arquitetura.domain.mapper;

import br.dev.paulocarvalho.arquitetura.domain.model.Model;

import org.mapstruct.MappingTarget;
import java.util.List;

public interface AbstractModelMapper<MODEL extends Model<?>, DATA> {

    MODEL toModel(DATA data);
    DATA toData(MODEL entity);
    DATA mergeData(MODEL entity, @MappingTarget DATA data);
    List<MODEL> toModelList(List<DATA> dataList);
    List<DATA> toDataList(List<MODEL> entityList);
}
