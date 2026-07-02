package br.uema.bd.talentus_rh_api.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "Candidato")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    @Size(max = 110, message = "O nome deve ter no máximo 110 caracteres")
    @Column(nullable = false, length = 110)
    private String nome;

    @NotBlank(message = "O CPF é obrigatório")
    @Pattern(regexp = "\\d{11}", message = "O CPF deve conter exatamente 11 dígitos numéricos")
    @Column(nullable = false, unique = true, length = 11)
    private String cpf;

    @NotBlank(message = "O email é obrigatório")
    @Email(message = "Formato de email inválido")
    @Size(max = 100, message = "O email deve ter no máximo 100 caracteres")
    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @NotBlank(message = "O telefone é obrigatório")
    @Size(max = 20, message = "O telefone deve ter no máximo 20 caracteres")
    @Column(nullable = false, length = 20)
    private String telefone;

    @PositiveOrZero(message = "A pretensão salarial não pode ser negativa")
    @Column(name = "pretensao_salarial", precision = 10, scale = 2)
    private BigDecimal pretensaoSalarial;

    @OneToMany(mappedBy = "candidato",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JsonManagedReference
    private List<CandidatoExperiencia> experiencias;
}