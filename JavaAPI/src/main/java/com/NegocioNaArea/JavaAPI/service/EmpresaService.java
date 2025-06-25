package com.NegocioNaArea.JavaAPI.service;

import com.NegocioNaArea.JavaAPI.model.Empresa;
import com.NegocioNaArea.JavaAPI.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
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



}
