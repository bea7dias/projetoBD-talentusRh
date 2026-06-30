package br.uema.bd.talentus_rh_api.service;

import br.uema.bd.talentus_rh_api.entity.Empresa;
import br.uema.bd.talentus_rh_api.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

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
}