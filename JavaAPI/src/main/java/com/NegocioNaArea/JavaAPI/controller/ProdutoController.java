package com.NegocioNaArea.JavaAPI.controller;

import com.NegocioNaArea.JavaAPI.model.Produto;
import com.NegocioNaArea.JavaAPI.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
//para testar precisa colocar a URL http://localhost:8080/produtos/(nome do método)
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    //métodos
    @DeleteMapping("/{id}")
    //PathVariable pega o uma parte da URL, o final dela
    public ResponseEntity<Void> delete(@PathVariable Long id){
        produtoService.delete(id);

        return ResponseEntity.noContent().build();
    }

    // atualização completa de todos os campos
    @PutMapping("/{id}")
    public ResponseEntity<Produto> updateAll(@PathVariable Long id, @RequestBody Produto novosDados){
        Produto atualizado = produtoService.updateAll(id, novosDados);
        return ResponseEntity.ok(atualizado);
    }
    // atualização com apenas um campo a escolha
    @PatchMapping("/{id}")
    public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto novosDados){
        Produto atualizado = produtoService.update(id, novosDados);
        return ResponseEntity.ok(atualizado);
    }

    // read retorna todos os produtos
    @GetMapping
    public ResponseEntity<List<Produto>> getAll(){
        List<Produto> produtos = produtoService.getAll();
        return ResponseEntity.ok(produtos);
    }

    // read retorna produtos pelo o ID
    @GetMapping("/{id}")
    public ResponseEntity<Produto> getById(@PathVariable Long id) {
        Produto produto = produtoService.getById(id);
        return ResponseEntity.ok(produto);
    }

}
