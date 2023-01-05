package es.indra.zoo.application.mappers;

import java.util.List;

import es.indra.zoo.domain.dtos.TiggerDto;
import es.indra.zoo.domain.entities.Tigger;

public interface TiggerMapper {
	TiggerDto entityToDto(Tigger entity);
	Tigger dtoToEntity(TiggerDto dto);
	
	List<TiggerDto> entityListToDtoList(List<Tigger> entityList);	
}
