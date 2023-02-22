package com.bsms.Businessservicemanagementsystem.controllers;

import com.bsms.Businessservicemanagementsystem.Items.ItemRepository;
import com.bsms.Businessservicemanagementsystem.Items.Item;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class ItemController {

    private final ItemRepository repository;
    
    ItemController(ItemRepository repository){
        this.repository = repository;
    }

    //Get the list of all the items
    @GetMapping("/items")
    List<Item> all() {
        return repository.findAll();
    }

    //Add a new item to the list
    @PostMapping("/items")
    Item newItem(@RequestBody Item newItem){
        return repository.save(newItem);
    }

    //Get A Item with Item's ID from the list
    @GetMapping("/items/{id}")

    Item one(@PathVariable Long id){
        return repository.findById(id).orElseThrow();
    }

    //Update an Item
    @PutMapping("items/{id}")
    Item updatedItem(@RequestBody Item newItem, @PathVariable long id){

        return repository.findById(id)
        .map(item -> {
                item.setUserName(newItem.getUserName());
                item.setItemName(newItem.getItemName());
                item.setItemPrice(newItem.getItemPrice());
                return repository.save(item);
            }
        ).orElseGet(()->{
            newItem.setId(id);
            return repository.save(newItem);
        });
    }

    //Delete an Item
    @DeleteMapping("/items/{id}")
    void deleteItem(@PathVariable long id){
        repository.deleteById(id);
    }


}
