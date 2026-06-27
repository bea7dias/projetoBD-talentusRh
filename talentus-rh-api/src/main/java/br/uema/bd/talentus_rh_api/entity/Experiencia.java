package br.uema.bd.talentus_rh_api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "Experiencia")
@Data
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

    @ManyToMany(mappedBy = "experiencias", fetch = FetchType.LAZY)
    private List<Candidato> candidatos;
}