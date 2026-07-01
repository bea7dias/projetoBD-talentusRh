package br.uema.bd.talentus_rh_api.controller;


import br.uema.bd.talentus_rh_api.entity.Vaga;
import br.uema.bd.talentus_rh_api.service.VagaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vagas")
public class VagaController {
    @Autowired
    private VagaService service;

    // POST: Criar uma vaga
    @PostMapping
    public ResponseEntity<Vaga> criar(@RequestBody @Valid Vaga vaga) {
        Vaga novaVaga = service.salvar(vaga);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaVaga);
    }

    // GET: Listar todas as vagas
    @GetMapping
    public ResponseEntity<List<Vaga>> listar() {
        return ResponseEntity.ok(service.listarTodas());
    }
}
