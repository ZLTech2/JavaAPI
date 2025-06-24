package com.NegocioNaArea.JavaAPI.repository;

import com.NegocioNaArea.JavaAPI.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository  extends JpaRepository<Empresa, String> {
}
