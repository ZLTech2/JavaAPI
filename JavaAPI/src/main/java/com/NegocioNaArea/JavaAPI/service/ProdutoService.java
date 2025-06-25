package com.NegocioNaArea.JavaAPI.service;

import com.NegocioNaArea.JavaAPI.model.Produto;
import com.NegocioNaArea.JavaAPI.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    //implementando os métodos do CRUD

    public Optional<Produto> findById(Long id){
         return produtoRepository.findById(id);
    }

    public void delete(Long id) {
         Produto produto = produtoRepository.findById(id)
                   .orElseThrow(() -> new RuntimeException("Empresa não encontrada"));
         produtoRepository.delete(produto);
    }

}
