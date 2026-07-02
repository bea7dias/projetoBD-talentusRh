package br.uema.bd.talentus_rh_api.service;

import br.uema.bd.talentus_rh_api.entity.Candidato;
import br.uema.bd.talentus_rh_api.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CandidatoService {
    @Autowired
    private CandidatoRepository repository;

    public Candidato salvar(Candidato candidato) { return repository.save(candidato); }
    public List<Candidato> listarTodos() { return repository.findAll(); }
    public Candidato buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Candidato não encontrado"));
    }
    public void deletar(Long id) { repository.deleteById(id); }
}