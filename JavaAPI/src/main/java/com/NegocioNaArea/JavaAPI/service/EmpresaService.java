package com.NegocioNaArea.JavaAPI.service;

import com.NegocioNaArea.JavaAPI.model.Empresa;
import com.NegocioNaArea.JavaAPI.repository.EmpresaRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;


@Service
public class EmpresaService{

    // a service chama os metodos crud da repository, ele chama lá, mas fica aqui por causa da implementação
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

    // update para todos os campos
    public Empresa updateAll(String cnpj, Empresa novosDados){
        Empresa empresa = empresaRepository.findById(cnpj)
            .orElseThrow(() -> new RuntimeException("Empresa não encontrada"));
            empresa.setNomeEmpresa(novosDados.getNomeEmpresa());
            empresa.setEmailEmpresa(novosDados.getEmailEmpresa());
            empresa.setDescricaoEmpresa(novosDados.getDescricaoEmpresa());
            empresa.setTelefoneEmpresa(novosDados.getTelefoneEmpresa());
            empresa.setSenhaEmpresa(novosDados.getSenhaEmpresa());

            return empresaRepository.save(empresa);
    }

    // update para campo específico
    public Empresa update(String cnpj, Empresa novosDados){
        Empresa empresa = empresaRepository.findById(cnpj)
            .orElseThrow(()-> new RuntimeException("Empresa não encontrada"));

            // verifica quais campos não estão nulos
            if(novosDados.getNomeEmpresa() != null){
                empresa.setNomeEmpresa(novosDados.getNomeEmpresa());
            }
            if(novosDados.getEmailEmpresa() != null){
                empresa.setEmailEmpresa(novosDados.getEmailEmpresa());
            }
            if(novosDados.getDescricaoEmpresa() != null){
                empresa.setDescricaoEmpresa(novosDados.getDescricaoEmpresa());
            }
            if(novosDados.getTelefoneEmpresa() != null){
                empresa.setTelefoneEmpresa(novosDados.getTelefoneEmpresa());
            }
            if(novosDados.getSenhaEmpresa() != null){
                empresa.setSenhaEmpresa(novosDados.getSenhaEmpresa());
            }

            return empresaRepository.save(empresa);
    }

<<<<<<< HEAD
    //create 
    public Empresa create (Empresa novaEmpresa){
       return empresaRepository.save(novaEmpresa);
    }


=======
    // read que retorna todas as empresas
    public List<Empresa> getAll() {
        return empresaRepository.findAll();
    }
>>>>>>> feature/crud-read

    // read que retorna empresa pelo cnpj
    public Empresa getByCnpj(String cnpj) {
        return empresaRepository.findById(cnpj)
                .orElseThrow(() -> new RuntimeException("empresa não foi encontrada pelo cnpj: "+ cnpj));
    }
}
