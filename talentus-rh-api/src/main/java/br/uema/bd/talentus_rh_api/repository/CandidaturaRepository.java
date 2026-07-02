package br.uema.bd.talentus_rh_api.repository;


import br.uema.bd.talentus_rh_api.entity.Candidatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidaturaRepository extends JpaRepository<Candidatura, Long> {
}