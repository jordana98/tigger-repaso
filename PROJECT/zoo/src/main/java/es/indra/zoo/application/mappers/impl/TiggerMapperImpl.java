package es.indra.zoo.application.mappers.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.indra.zoo.application.mappers.TiggerMapper;
import es.indra.zoo.domain.dtos.TiggerDto;
import es.indra.zoo.domain.entities.Tigger;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public final class TiggerMapperImpl implements  TiggerMapper{

	@Autowired
	private ModelMapper mapper;
	
	@Override
	public TiggerDto entityToDto(Tigger entity) {
		// TODO Auto-generated method stub
		TiggerDto dto = mapper.map(entity, TiggerDto.class);
		//TiggerDto dto = new TiggerDto(entity.getId(), entity.getName(), entity.getAge());
		return dto;
	}

	@Override
	public Tigger dtoToEntity(TiggerDto dto) {
		// TODO Auto-generated method stub
		Tigger entity = mapper.map(dto, Tigger.class);
		//Tigger entity = new Tigger(dto.getId(), dto.getName(), dto.getAge());
		
		return entity;
	}

	@Override
	public List<TiggerDto> entityListToDtoList(List<Tigger> entityList) {
		// TODO Auto-generated method stub
		List<TiggerDto> dtoList = mapper.map(entityList, new TypeToken<List<TiggerDto>>() {}.getType());
		
		return dtoList;
	}

}
