package br.uema.bd.talentus_rh_api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "Empresa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O CNPJ é obrigatório")
    @Pattern(regexp = "\\d{14}", message = "O CNPJ deve conter exatamente 14 dígitos numéricos")
    @Column(nullable = false, unique = true, length = 14)
    private String cnpj;

    @NotBlank(message = "O nome da empresa é obrigatório")
    @Size(max = 50, message = "O nome deve ter no máximo 50 caracteres")
    @Column(nullable = false, length = 50)
    private String nome;

    @Size(max = 20, message = "O telefone deve ter no máximo 20 caracteres")
    @Column(length = 20)
    private String telefone;

    @NotBlank(message = "O email é obrigatório")
    @Email(message = "Formato de email inválido")
    @Size(max = 100, message = "O email deve ter no máximo 100 caracteres")
    @Column(nullable = false, length = 100)
    private String email;

    @Column(columnDefinition = "TEXT")
    private String endereco;


}