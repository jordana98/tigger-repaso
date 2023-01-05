package es.indra.zoo.domain.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.indra.zoo.domain.entities.Tigger;

@Repository
public interface TiggerRepository extends CrudRepository<Tigger, UUID>{

}
