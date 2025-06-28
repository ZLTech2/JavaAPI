package com.NegocioNaArea.JavaAPI.controller;

import com.NegocioNaArea.JavaAPI.model.Empresa;
import com.NegocioNaArea.JavaAPI.service.EmpresaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresas")
//para testar precisa colocar a URL http://localhost:8080/empresas/(nome do método)
public class EmpresaController {

    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }


    //métodos
    @DeleteMapping("/{cnpj}")
    public ResponseEntity<Void> delete(@PathVariable String cnpj){
        empresaService.delete(cnpj);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{cnpj}")
    public ResponseEntity<Empresa> update(@PathVariable String cnpj, @RequestBody Empresa novosDados){
        Empresa atualizada = empresaService.update(cnpj, novosDados);
        return ResponseEntity.ok(atualizada);
    }

    @PatchMapping("/{cnpj}")
    public ResponseEntity<Empresa> updateCampos(@PathVariable String cnpj, @RequestBody Empresa novosDados){
        Empresa atualizada = empresaService.update(cnpj, novosDados);
        return ResponseEntity.ok(atualizada);
    }
}
