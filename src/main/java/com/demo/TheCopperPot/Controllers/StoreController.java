package com.demo.TheCopperPot.Controllers;

import com.demo.TheCopperPot.Models.Store;
import com.demo.TheCopperPot.Repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/demo")
public class StoreController {
    @Autowired
    private StoreRepository storeRepository;

    @PostMapping(path="/addStoreManager")
    public @ResponseBody String addNewStore (@RequestParam String name, @RequestParam String email){
        Store store = new Store();
        store.setName(name);
        store.setEmail(email);
        storeRepository.save(store);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Store> getAllStores(){
        return storeRepository.findAll();
    }
}
