package com.example.pruebaCICD.service;

import com.example.pruebaCICD.model.Item;
import com.example.pruebaCICD.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Item addItem(Item item) {
        return itemRepository.save(item);
    }
}
