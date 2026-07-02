package br.uema.bd.talentus_rh_api.controller;

import br.uema.bd.talentus_rh_api.entity.Candidatura;
import br.uema.bd.talentus_rh_api.service.CandidaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/candidaturas")
public class CandidaturaController {
    @Autowired
    private CandidaturaService service;

    @PostMapping
    public ResponseEntity<Candidatura> criar(@RequestBody Candidatura candidatura) {
        return ResponseEntity.ok(service.salvar(candidatura));
    }

    @GetMapping
    public ResponseEntity<List<Candidatura>> listar() {
        return ResponseEntity.ok(service.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Candidatura> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Candidatura> atualizar(@PathVariable Long id, @RequestBody Candidatura candidatura) {
        candidatura.setId(id);
        return ResponseEntity.ok(service.salvar(candidatura));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
