package br.uema.bd.talentus_rh_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CandidatoExperienciaId implements Serializable {
    @Column(name = "Candidato_id")
    private Long candidatoId;

    @Column(name = "Experiencia_id")
    private Long experienciaId;
}
