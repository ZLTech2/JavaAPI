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

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
@Service
public class EmpresaService{
    @Autowired
    private EmpresaRepository empresaRepository;

    //métodos crud a serem implementados

    public void deletarPorCnpj(String cnpj){
        empresaRepository.deleteById(cnpj);
    }


}
