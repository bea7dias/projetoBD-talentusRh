package br.uema.bd.talentus_rh_api.service;

import br.uema.bd.talentus_rh_api.entity.Empresa;
import br.uema.bd.talentus_rh_api.entity.Vaga;
import br.uema.bd.talentus_rh_api.exception.RecursoNaoEncontradoException;
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

    public Optional<Vaga> buscarPorId(Long id) {
        Optional<Vaga> vaga = repository.findById(id);
        if (vaga.isEmpty())
            throw new RecursoNaoEncontradoException("Vaga com ID " + id + " não encontrada.");
        return vaga;
    }

    public void deletar(Long id) {
        Vaga vaga = repository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Vaga com ID " + id + " não encontrada para exclusão."));
        repository.delete(vaga);
    }

    public Vaga atualizar(Long id, Vaga dadosNovos) {
        Vaga vagaExistente = repository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Vaga com ID " + id + " não encontrada."));

        vagaExistente.setCargo(dadosNovos.getCargo());
        vagaExistente.setDescricao(dadosNovos.getDescricao());
        vagaExistente.setStatus(dadosNovos.getStatus());
        vagaExistente.setQtdVagas(dadosNovos.getQtdVagas());
        vagaExistente.setEmpresa(dadosNovos.getEmpresa());

        return repository.save(vagaExistente);
    }
}
