package com.NegocioNaArea.JavaAPI.controller;

import com.NegocioNaArea.JavaAPI.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}
