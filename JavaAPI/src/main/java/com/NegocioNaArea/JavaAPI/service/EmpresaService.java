package com.NegocioNaArea.JavaAPI.service;

import com.NegocioNaArea.JavaAPI.model.Empresa;
import com.NegocioNaArea.JavaAPI.repository.EmpresaRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
public class EmpresaService{

    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }
    //métodos crud a serem implementados

    public Optional<Empresa> findById(String cnpj){
        return empresaRepository.findById(cnpj);
    }

    public void delete(String cnpj) {
        Empresa empresa = empresaRepository.findById(cnpj)
                .orElseThrow(() -> new RuntimeException("Empresa não encontrada"));
        empresaRepository.delete(empresa);
    }

    public Empresa update (String cnpj, Empresa novosDados){
        Empresa empresa = empresaRepository.findById(cnpj)
            .orElseThrow(() -> new RuntimeException("Empresa não encontrada"));
            empresa.setNomeEmpresa(novosDados.getNomeEmpresa());
            empresa.setEmailEmpresa(novosDados.getEmailEmpresa());
            empresa.setDescricaoEmpresa(novosDados.getDescricaoEmpresa());
            empresa.setTelefoneEmpresa(novosDados.getTelefoneEmpresa());
            empresa.setSenhaEmpresa(novosDados.getSenhaEmpresa());

            return empresaRepository.save(empresa);
    }



}
