package br.uema.bd.talentus_rh_api.controller;

import br.uema.bd.talentus_rh_api.entity.Empresa;
import br.uema.bd.talentus_rh_api.service.EmpresaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaService service;

    //POST - Criar uma empresa
    @PostMapping
    public ResponseEntity<Empresa> criar(@RequestBody @Valid Empresa empresa) {
        Empresa novaEmpresa = service.salvar(empresa);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaEmpresa);
    }

    //GET - Listar todas as empresas
    @GetMapping
    public ResponseEntity<List<Empresa>> listar() {
        return ResponseEntity.ok(service.listarTodas());
    }

    // GET: Buscar a empresa pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Empresa> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // PUT: Atualizar as informações da empresa
    @PutMapping("/{id}")
    public ResponseEntity<Empresa> atualizar(@PathVariable Long id, @RequestBody @Valid Empresa empresa) {
        if (service.buscarPorId(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        empresa.setId(id);
        return ResponseEntity.ok(service.salvar(empresa));
    }

    // DELETE: Deletar uma empresa
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (service.buscarPorId(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}


