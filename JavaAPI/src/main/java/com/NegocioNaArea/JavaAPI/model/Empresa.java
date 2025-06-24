package com.NegocioNaArea.JavaAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "empresas")
public class Empresa {
    @Id
    @Column(length = 14, nullable = false, unique = true)
    private String cnpjEmpresa;

    @Column(nullable = false)
    private String nomeEmpresa;

    @Column(nullable = false)
    private String emailEmpresa;

    private String descricaoEmpresa;

    private String telefoneEmpresa;

    @Column(nullable = false)
    private String senhaEmpresa;

}
