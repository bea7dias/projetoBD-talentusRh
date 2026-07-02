package br.uema.bd.talentus_rh_api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.math.BigDecimal;

@Entity
@Table(name = "Entrevista")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Entrevista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_funcionario", nullable = false)
    @JsonIgnoreProperties("entrevistas")
    private Funcionario funcionario;

    @ManyToOne
    @JoinColumn(name = "id_candidatura", nullable = false)
    @JsonIgnoreProperties("entrevistas")
    private Candidatura candidatura;

    @Column(name = "data_hora", nullable = false)
    private LocalDateTime dataHora;

    @Column(precision = 5, scale = 2)
    private BigDecimal nota;

    @Column(name = "avaliacao_final", columnDefinition = "TEXT")
    private String avaliacaoFinal;

    @Column(name = "ordem_etapa")
    private Integer ordemEtapa;
}