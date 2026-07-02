package br.uema.bd.talentus_rh_api.controller;

import br.uema.bd.talentus_rh_api.entity.CandidatoExperiencia;
import br.uema.bd.talentus_rh_api.service.CandidatoExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/candidato-experiencias")
public class CandidatoExperienciaController {
    @Autowired
    private CandidatoExperienciaService service;

    @PostMapping
    public ResponseEntity<CandidatoExperiencia> criarVinculo(@RequestBody CandidatoExperiencia vinculo) {
        return ResponseEntity.ok(service.vincular(vinculo));
    }

    @GetMapping
    public ResponseEntity<List<CandidatoExperiencia>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @DeleteMapping("/{candidatoId}/{experienciaId}")
    public ResponseEntity<Void> deletarVinculo(@PathVariable Long candidatoId, @PathVariable Long experienciaId) {
        service.desvincular(candidatoId, experienciaId);
        return ResponseEntity.noContent().build();
    }
}
