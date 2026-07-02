package br.uema.bd.talentus_rh_api.controller;

import br.uema.bd.talentus_rh_api.entity.Experiencia;
import br.uema.bd.talentus_rh_api.service.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/experiencias")
public class ExperienciaController {
    @Autowired
    private ExperienciaService service;

    @PostMapping
    public ResponseEntity<Experiencia> criar(@RequestBody Experiencia experiencia) {
        return ResponseEntity.ok(service.salvar(experiencia));
    }

    @GetMapping
    public ResponseEntity<List<Experiencia>> listar() {
        return ResponseEntity.ok(service.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Experiencia> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Experiencia> atualizar(@PathVariable Long id, @RequestBody Experiencia experiencia) {
        experiencia.setId(id);
        return ResponseEntity.ok(service.salvar(experiencia));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}