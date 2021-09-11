package com.developer.CadastroReST.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.developer.CadastroReST.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
