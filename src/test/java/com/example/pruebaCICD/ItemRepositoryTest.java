package com.example.pruebaCICD;

import com.example.pruebaCICD.model.Item;
import com.example.pruebaCICD.repository.ItemRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;

    @BeforeEach
    public void setUp() {
        // Limpiar la base de datos antes de cada prueba
        itemRepository.deleteAll();
    }

    @AfterEach
    public void tearDown() {
        // Limpiar la base de datos después de cada prueba
        itemRepository.deleteAll();
    }

    @Test
    @Rollback(false) // Para que los cambios persistan en la base de datos (opcional)
    public void testSaveAndFindItem() {
        // Crear un nuevo Item
        Item item = new Item();
        item.setName("Test Item");

        // Guardar el item
        Item savedItem = itemRepository.save(item);

        // Consultar si el item existe
        boolean exists = itemRepository.existsById(savedItem.getId());

        // Afirmar que el item existe
        assertThat(exists).isTrue();
    }
}
