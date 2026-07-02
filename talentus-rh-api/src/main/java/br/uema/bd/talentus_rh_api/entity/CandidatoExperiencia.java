package br.uema.bd.talentus_rh_api.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @JoinColumn(name="id_candidato")
    @JsonBackReference
    private Candidato candidato;

    @ManyToOne
    @MapsId("experienciaId")
    @JoinColumn(name="id_experiencia")
    private Experiencia experiencia;
}