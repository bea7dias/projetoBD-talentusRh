package br.uema.bd.talentus_rh_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "Contratacao")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contratacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_candidatura", nullable = false)
    private Candidatura candidatura;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_rescisao")
    private LocalDate dataRescisao;

    @Column(name = "dias_garantia", nullable = false)
    private Integer diasGarantia;
}