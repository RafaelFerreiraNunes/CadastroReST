package com.developer.CadastroReST.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developer.CadastroReST.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
