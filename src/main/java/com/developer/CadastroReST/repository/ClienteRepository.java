package com.developer.CadastroReST.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developer.CadastroReST.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
