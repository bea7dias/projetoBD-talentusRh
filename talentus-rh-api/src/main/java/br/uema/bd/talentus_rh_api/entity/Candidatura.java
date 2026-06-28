package br.uema.bd.talentus_rh_api.entity;

import br.uema.bd.talentus_rh_api.enums.EtapaCandidatura;
import br.uema.bd.talentus_rh_api.enums.ResultadoFinal;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "Candidatura")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Candidatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_candidato", nullable = false)
    private Candidato candidato;

    @ManyToOne
    @JoinColumn(name = "id_vaga", nullable = false)
    private Vaga vaga;

    @Column(name = "data_interesse", nullable = false)
    private LocalDate dataInteresse;

    @Enumerated(EnumType.STRING)
    @Column(name = "etapa_atual", nullable = false)
    private EtapaCandidatura etapaAtual;

    @Enumerated(EnumType.STRING)
    @Column(name = "resultado_final")
    private ResultadoFinal resultadoFinal;
}