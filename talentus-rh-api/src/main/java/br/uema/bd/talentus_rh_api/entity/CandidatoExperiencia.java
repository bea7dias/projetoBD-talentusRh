package br.uema.bd.talentus_rh_api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Candidato_Experiencia")
@Getter
@Setter
public class CandidatoExperiencia {
    @EmbeddedId
    private CandidatoExperienciaId id;

    @ManyToOne
    @MapsId("candidatoId")
    @JoinColumn(name = "Candidato_id")
    @JsonIgnore
    private Candidato candidato;

    @ManyToOne
    @MapsId("experienciaId")
    @JoinColumn(name = "Experiencia_id")
    @JsonIgnore
    private Experiencia experiencia; // Certifique-se de que a entidade Experiencia existe
}