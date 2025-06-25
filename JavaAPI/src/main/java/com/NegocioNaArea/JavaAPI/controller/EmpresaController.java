package com.NegocioNaArea.JavaAPI.controller;

import com.NegocioNaArea.JavaAPI.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresaController {
    @Autowired
    private EmpresaService empresaService;

    //métodos
    @DeleteMapping("/{cnpj}")
    //responseEntity representa as respostas HTTP
    public ResponseEntity<Void> deletarPorCnpj(@PathVariable String cnpj) {
        empresaService.deletarPorCnpj(cnpj);
        return ResponseEntity.noContent().build(); // retorna 204 No Content
    }
}
