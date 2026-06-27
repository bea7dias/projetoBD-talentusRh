package br.uema.bd.talentus_rh_api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Entity
@Table(name = "Funcionario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    @Size(max = 100, message = "O nome deve ter no máximo 100 caracteres")
    @Column(nullable = false, length = 100)
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

    @Size(max = 20, message = "O telefone deve ter no máximo 20 caracteres")
    @Column(length = 20)
    private String telefone;

    @NotBlank(message = "O cargo é obrigatório")
    @Size(max = 50, message = "O cargo deve ter no máximo 50 caracteres")
    @Column(nullable = false, length = 50)
    private String cargo;

    @NotNull(message = "O salário é obrigatório")
    @Positive(message = "O salário deve ser um valor positivo")
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal salario;
}