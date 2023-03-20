package com.bsms.Businessservicemanagementsystem.Item;

import java.util.List;

// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service  //@Component is the same
public class ItemService {
    public List<Item> getItem(){
        return List.of(
            new Item(
                1,
                "Apple",
                10,
                "BKApple",
                3.5
            )
        );
    }
}
