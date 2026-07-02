package br.uema.bd.talentus_rh_api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Experiencia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome da experiência é obrigatório")
    @Size(max = 100, message = "O nome da experiência deve ter no máximo 100 caracteres")
    @Column(name = "nome_experiencia", nullable = false, length = 100)
    private String nomeExperiencia;

    @Size(max = 50, message = "A categoria deve ter no máximo 50 caracteres")
    @Column(length = 50)
    private String categoria;

    @Column(name = "descricao_experiencia", columnDefinition = "TEXT")
    private String descricaoExperiencia;

    @OneToMany(mappedBy = "experiencia")
    @JsonIgnore
    private List<CandidatoExperiencia> candidatos;
}