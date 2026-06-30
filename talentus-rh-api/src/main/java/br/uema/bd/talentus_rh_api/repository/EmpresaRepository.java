package br.uema.bd.talentus_rh_api.repository;

import br.uema.bd.talentus_rh_api.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    // Aqui você pode adicionar métodos de busca personalizados no futuro,
    // como: Optional<Empresa> findByCnpj(String cnpj);
}