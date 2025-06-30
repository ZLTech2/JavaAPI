package com.NegocioNaArea.JavaAPI.repository;

import com.NegocioNaArea.JavaAPI.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

//repository chama os metodos crud
public interface EmpresaRepository  extends JpaRepository<Empresa, String> {
}
