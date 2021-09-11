package com.developer.CadastroReST.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developer.CadastroReST.model.Item;
import com.developer.CadastroReST.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> findItemAll(){
		return itemRepository.findAll();
	}
	
	public Item saveItem(Item item) {
		return itemRepository.save(item);
	}
	
	public void deleteItem(Long idItem) {
		itemRepository.deleteById(idItem);
	}
}
