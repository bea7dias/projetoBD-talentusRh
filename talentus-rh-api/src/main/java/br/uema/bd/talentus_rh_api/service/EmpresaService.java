package br.uema.bd.talentus_rh_api.service;

import br.uema.bd.talentus_rh_api.entity.Empresa;
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

    public Optional<Empresa> buscarPorId(Long id) {return repository.findById(id);}

    public void deletar(Long id){repository.deleteById(id);}
}