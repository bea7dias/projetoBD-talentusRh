package br.uema.bd.talentus_rh_api.entity;

import br.uema.bd.talentus_rh_api.enums.VagaStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Vaga")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_empresa", nullable = false)
    @JsonIgnoreProperties("vagas")
    private Empresa empresa;

    @Column(nullable = false, length = 60)
    private String cargo;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private VagaStatus status;

    @Column(name = "qtd_vagas")
    private Integer qtdVagas = 1;
}