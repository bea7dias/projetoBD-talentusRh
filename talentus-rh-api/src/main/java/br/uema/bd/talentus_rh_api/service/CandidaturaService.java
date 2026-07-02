package br.uema.bd.talentus_rh_api.service;


import br.uema.bd.talentus_rh_api.entity.Candidatura;
import br.uema.bd.talentus_rh_api.repository.CandidaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CandidaturaService {
    @Autowired
    private CandidaturaRepository repository;

    public Candidatura salvar(Candidatura candidatura) { return repository.save(candidatura); }
    public List<Candidatura> listarTodas() { return repository.findAll(); }
    public Candidatura buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Candidatura não encontrada"));
    }
    public void deletar(Long id) { repository.deleteById(id); }
}
