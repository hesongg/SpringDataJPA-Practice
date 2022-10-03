package study.datajpa.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import study.datajpa.repository.ItemRepository;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemTest {

    @Autowired
    ItemRepository itemRepository;

    @Test
    void test() {
        Item item = new Item("A");
        itemRepository.save(item);
    }
}