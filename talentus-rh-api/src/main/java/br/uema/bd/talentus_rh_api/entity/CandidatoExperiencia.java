package br.uema.bd.talentus_rh_api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Candidato_Experiencia")
@Data
public class CandidatoExperiencia {
    @EmbeddedId
    private CandidatoExperienciaId id;

    @ManyToOne
    @MapsId("candidatoId")
    @JoinColumn(name = "Candidato_id")
    private Candidato candidato;

    @ManyToOne
    @MapsId("experienciaId")
    @JoinColumn(name = "Experiencia_id")
    private Experiencia experiencia; // Certifique-se de que a entidade Experiencia existe
}