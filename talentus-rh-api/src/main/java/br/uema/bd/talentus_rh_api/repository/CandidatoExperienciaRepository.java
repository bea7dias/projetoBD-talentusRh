package br.uema.bd.talentus_rh_api.repository;

import br.uema.bd.talentus_rh_api.entity.CandidatoExperiencia;
import br.uema.bd.talentus_rh_api.entity.CandidatoExperienciaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoExperienciaRepository extends JpaRepository<CandidatoExperiencia, CandidatoExperienciaId> {
}
