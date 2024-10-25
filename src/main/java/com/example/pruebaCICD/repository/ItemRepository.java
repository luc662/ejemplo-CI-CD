package com.example.pruebaCICD.repository;

import com.example.pruebaCICD.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
