package br.uema.bd.talentus_rh_api.service;

import br.uema.bd.talentus_rh_api.entity.Experiencia;
import br.uema.bd.talentus_rh_api.repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExperienciaService {
    @Autowired
    private ExperienciaRepository repository;

    public Experiencia salvar(Experiencia experiencia) { return repository.save(experiencia); }
    public List<Experiencia> listarTodas() { return repository.findAll(); }
    public Experiencia buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Experiência não encontrada"));
    }
    public void deletar(Long id) { repository.deleteById(id); }
}