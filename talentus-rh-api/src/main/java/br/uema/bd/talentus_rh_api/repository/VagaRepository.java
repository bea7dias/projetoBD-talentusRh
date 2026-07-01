package br.uema.bd.talentus_rh_api.repository;

import br.uema.bd.talentus_rh_api.entity.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long> {
    // Aqui você pode adicionar métodos de busca personalizados no futuro,
    // como: Optional<Empresa> findByCnpj(String cnpj);
}
