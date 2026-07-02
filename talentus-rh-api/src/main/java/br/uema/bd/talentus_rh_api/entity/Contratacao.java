package br.uema.bd.talentus_rh_api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Contratacao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contratacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_candidatura", nullable = false)
    @JsonIgnoreProperties("contratacao")
    private Candidatura candidatura;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_rescisao")
    private LocalDate dataRescisao;

    @Column(name = "dias_garantia", nullable = false)
    private Integer diasGarantia;
}