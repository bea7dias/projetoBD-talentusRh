package br.uema.bd.talentus_rh_api.service;

import br.uema.bd.talentus_rh_api.entity.Empresa;
import br.uema.bd.talentus_rh_api.exception.RecursoNaoEncontradoException;
import br.uema.bd.talentus_rh_api.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository repository;

    public Empresa salvar(Empresa empresa) {
        return repository.save(empresa);
    }

    public List<Empresa> listarTodas() {
        return repository.findAll();
    }

    public Optional<Empresa> buscarPorId(Long id) {
        Optional<Empresa> empresa = repository.findById(id);
        if (empresa.isEmpty())
            throw new RecursoNaoEncontradoException("Empresa com ID " + id + " não encontrada.");
        return empresa;
    }

    public void deletar(Long id) {
        Empresa empresa = repository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Empresa com ID " + id + " não encontrada para exclusão."));

        repository.delete(empresa);
    }
    public Empresa atualizar(Long id, Empresa dadosNovos) {
        Empresa empresaExistente = repository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Empresa com ID " + id + " não encontrada para atualização."));

        empresaExistente.setNome(dadosNovos.getNome());
        empresaExistente.setCnpj(dadosNovos.getCnpj());
        empresaExistente.setEmail(dadosNovos.getEmail());
        empresaExistente.setTelefone(dadosNovos.getTelefone());
        empresaExistente.setEndereco(dadosNovos.getEndereco());
        return repository.save(empresaExistente);
    }

}