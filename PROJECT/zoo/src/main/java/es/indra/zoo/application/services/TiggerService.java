package es.indra.zoo.application.services;

import java.util.List;
import java.util.UUID;

import es.indra.zoo.domain.dtos.TiggerDto;

public interface TiggerService {
	TiggerDto create(TiggerDto dto);
	List<TiggerDto> read();
	TiggerDto update(TiggerDto dto);
	Boolean delete(UUID id);
}
