package es.indra.zoo.framewrok.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.indra.zoo.application.services.TiggerService;
import es.indra.zoo.domain.dtos.TiggerDto;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("tigger")
@RequiredArgsConstructor
public class TiggerController {

	@Autowired
    private TiggerService tiggerService;
	
    @PostMapping("create")
    public ResponseEntity<TiggerDto> create(@RequestBody TiggerDto input) {
        return ResponseEntity.ok(tiggerService.create(input));
    }
    
    @GetMapping("read")
    public ResponseEntity<List<TiggerDto>> read() {
        return ResponseEntity.ok(tiggerService.read());
    }
    
    @PutMapping("update")
    public ResponseEntity<TiggerDto> update(@RequestBody TiggerDto input) {
        return ResponseEntity.ok(tiggerService.update(input));
    }
    
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") UUID id) {
        return ResponseEntity.ok(tiggerService.delete(id));
    }
}
