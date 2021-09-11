package com.developer.CadastroReST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.developer.CadastroReST.model.Item;
import com.developer.CadastroReST.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping
	public List<Item> returnAllItens(){
		return itemService.findItemAll();
	}
	
	@PostMapping
	public void saveItem(@RequestBody Item item) {
		itemService.saveItem(item);
	}

}
