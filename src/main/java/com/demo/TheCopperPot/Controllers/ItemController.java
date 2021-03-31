package com.demo.TheCopperPot.Controllers;

import com.demo.TheCopperPot.Models.Item;
import com.demo.TheCopperPot.Models.Store;
import com.demo.TheCopperPot.Repositories.ItemRepository;
import com.demo.TheCopperPot.Repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

@RestController
@RequestMapping(path="/items")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;
    private Item item;

    @PostMapping(path="/addItem")
   public Boolean addItem(@RequestBody Map<String, String> body) throws NoSuchAlgorithmException, ValidationException {
        String itemname = body.get("itemname");
        if(itemRepository.existsByItemName(itemname)){
            throw new ValidationException("Item already exists");
        }
        Double itemprice = body.get(item.getItemPrice());

        String discountpercentage = body.get("discountpercentage");

    }
}
