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
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

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

    // Update para atualizar todos os campos
    @PutMapping("/{cnpj}")
    public ResponseEntity<Empresa> updateAll(@PathVariable String cnpj, @RequestBody Empresa novosDados){
        Empresa atualizada = empresaService.updateAll(cnpj, novosDados);
        return ResponseEntity.ok(atualizada);
    }

    // Update para atualizar um campo específico
    @PatchMapping("/{cnpj}")
    public ResponseEntity<Empresa> update(@PathVariable String cnpj, @RequestBody Empresa novosDados){
        Empresa atualizada = empresaService.update(cnpj, novosDados);
        return ResponseEntity.ok(atualizada);
    }

    // fazendo um read
    @GetMapping
    public ResponseEntity<List<Empresa>> getAll(){
        List<Empresa> empresas = empresaService.getAll();
        return ResponseEntity.ok(empresas);
    }

    // faz uma busca de uma empresa especifica
    @GetMapping("/{cnpj}")
    public ResponseEntity<Empresa> getByCnpj(@PathVariable String cnpj){
        Empresa empresa = empresaService.getByCnpj(cnpj);
        return ResponseEntity.ok(empresa);
    }


}
