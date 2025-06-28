package com.NegocioNaArea.JavaAPI.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeProduto;

    private String descricaoProduto;

    private Double preco;

    @Column(nullable = false)
    private LocalDateTime dataPostagem = LocalDateTime.now();

    @Column(nullable = false)
    private String contatoEmpresa;

    public String getContatoEmpresa() {
        return contatoEmpresa;
    }

    public void setContatoEmpresa(String contatoEmpresa) {
        this.contatoEmpresa = contatoEmpresa;
    }

    public LocalDateTime getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(LocalDateTime dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
