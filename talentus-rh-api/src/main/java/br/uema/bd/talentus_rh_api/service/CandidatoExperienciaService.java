package br.uema.bd.talentus_rh_api.service;

import br.uema.bd.talentus_rh_api.entity.CandidatoExperiencia;
import br.uema.bd.talentus_rh_api.entity.CandidatoExperienciaId;
import br.uema.bd.talentus_rh_api.repository.CandidatoExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CandidatoExperienciaService {
    @Autowired
    private CandidatoExperienciaRepository repository;

    public CandidatoExperiencia vincular(CandidatoExperiencia rel) { return repository.save(rel); }
    public List<CandidatoExperiencia> listarTodos() { return repository.findAll(); }
    public void desvincular(Long candidatoId, Long experienciaId) {
        repository.deleteById(new CandidatoExperienciaId(candidatoId, experienciaId));
    }
}
