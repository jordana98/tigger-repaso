package es.indra.zoo.application.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.indra.zoo.application.mappers.TiggerMapper;
import es.indra.zoo.application.services.TiggerService;
import es.indra.zoo.domain.dtos.TiggerDto;
import es.indra.zoo.domain.entities.Tigger;
import es.indra.zoo.domain.repositories.TiggerRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public final class TiggerServiceImpl implements TiggerService {

	@Autowired
    private TiggerMapper tiggerMapper;
	
	@Autowired
    private TiggerRepository tiggerRepository;
	
	@Override
	public TiggerDto create(TiggerDto input) {
		// TODO Auto-generated method stub
		Tigger entity = tiggerMapper.dtoToEntity(input);
		entity = tiggerRepository.save(entity);
		
		TiggerDto dto = tiggerMapper.entityToDto(entity);
		return dto;
	}

	@Override
	public List<TiggerDto> read() {
		// TODO Auto-generated method stub
		List<Tigger> entityList = (List<Tigger>) tiggerRepository.findAll();
		
		List<TiggerDto> dtoList= tiggerMapper.entityListToDtoList(entityList);
		
		return dtoList;
	}

	@Override
	public TiggerDto update(TiggerDto input) {
		// TODO Auto-generated method stub
		Tigger entity = tiggerRepository.findById(input.getId()).get();
		entity.setName(input.getName());
		entity.setAge(input.getAge());
		
		tiggerRepository.save(entity);
		
		TiggerDto dto = tiggerMapper.entityToDto(entity);
		
		return dto;		
	}

	@Override
	public Boolean delete(UUID id) {
		// TODO Auto-generated method stub
		tiggerRepository.deleteById(id);
		
		return true;
	}
}
