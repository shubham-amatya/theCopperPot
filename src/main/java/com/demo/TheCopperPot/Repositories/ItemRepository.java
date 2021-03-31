package com.demo.TheCopperPot.Repositories;

import com.demo.TheCopperPot.Models.Store;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository {
    boolean existsByItemName(String itemname);
    Store findItemByStore (String storename);
    Store findItemById (Long id);

}
