package br.uema.bd.talentus_rh_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Entity
@Table(name = "Entrevista")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Entrevista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_funcionario", nullable = false)
    private Funcionario funcionario;

    @ManyToOne
    @JoinColumn(name = "id_candidatura", nullable = false)
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