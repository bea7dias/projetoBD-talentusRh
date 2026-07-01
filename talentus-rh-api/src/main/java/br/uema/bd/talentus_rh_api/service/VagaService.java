package br.uema.bd.talentus_rh_api.service;

import br.uema.bd.talentus_rh_api.entity.Vaga;
import br.uema.bd.talentus_rh_api.repository.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VagaService {
    @Autowired
    private VagaRepository repository;

    public Vaga salvar(Vaga vaga) {return repository.save(vaga);}

    public List<Vaga> listarTodas() {return repository.findAll();}

    public Optional<Vaga> buscarPorId(Long id) {return repository.findById(id);}

    public void deletar(Long id) {repository.deleteById(id);}

}
