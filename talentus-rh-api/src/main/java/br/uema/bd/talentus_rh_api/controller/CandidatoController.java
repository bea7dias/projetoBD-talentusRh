package br.uema.bd.talentus_rh_api.controller;

import br.uema.bd.talentus_rh_api.entity.Candidato;
import br.uema.bd.talentus_rh_api.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {
    @Autowired
    private CandidatoService service;

    @PostMapping
    public ResponseEntity<Candidato> criar(@RequestBody Candidato candidato) {
        return ResponseEntity.ok(service.salvar(candidato));
    }

    @GetMapping
    public ResponseEntity<List<Candidato>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Candidato> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Candidato> atualizar(@PathVariable Long id, @RequestBody Candidato candidato) {
        candidato.setId(id);
        return ResponseEntity.ok(service.salvar(candidato));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}