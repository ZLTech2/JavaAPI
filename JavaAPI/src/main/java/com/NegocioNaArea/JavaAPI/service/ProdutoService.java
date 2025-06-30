package com.NegocioNaArea.JavaAPI.service;

import com.NegocioNaArea.JavaAPI.model.Produto;
import com.NegocioNaArea.JavaAPI.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public Produto updateAll(Long id, Produto novosDados){
        Produto produto = produtoRepository.findById(id)
            .orElseThrow(()-> new RuntimeException("Produto não encontrado"));
            produto.setNomeProduto(novosDados.getNomeProduto());
            produto.setDescricaoProduto(novosDados.getDescricaoProduto());
            produto.setPreco(novosDados.getPreco());
            produto.setContatoEmpresa(novosDados.getContatoEmpresa());
            produto.setDataPostagem(novosDados.getDataPostagem());

            return produtoRepository.save(produto);
    }

    public Produto update(Long id, Produto novosDados){
        Produto produto = produtoRepository.findById(id)
            .orElseThrow(()-> new RuntimeException("Produto não encontrado"));
            if(novosDados.getNomeProduto() !=null){
                produto.setNomeProduto(novosDados.getNomeProduto());
            }
            if(novosDados.getDescricaoProduto() !=null){
                produto.setDescricaoProduto(novosDados.getDescricaoProduto());
            }
            if(novosDados.getPreco() !=null){
                produto.setPreco(novosDados.getPreco());
            }
            if(novosDados.getContatoEmpresa() !=null){
                produto.setContatoEmpresa(novosDados.getContatoEmpresa());
            }
            if(novosDados.getDataPostagem() !=null){
                produto.setDataPostagem(novosDados.getDataPostagem());
            }

            return produtoRepository.save(produto);
    }

    //read retorna todos os produtos
    public List<Produto> getAll() {
        return produtoRepository.findAll();

    }

    // read retorna um produto pelo ID
    public Produto getById(Long  id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com ID: "+ id));
    }

}
