package com.examplehomeworkSpringbusketToStore.service;

import com.examplehomeworkSpringbusketToStore.Bag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BagServiceImpl implements BagService {
    @Autowired
    private Bag bag;

    @Override
    public List<Integer> add(List<Integer> items) {
        for(Integer id : items){
            bag.addStore(id);
        }
        return items;
    }

    @Override
    public Collection<Integer> get() {
        return bag.get();
    }


//    @Override
//    public List<Integer> addStore(Integer id) {
//        ids.add(id);
//        return id;
//    }


//    @Override
//    public List<Integer> getAll(){
//        return Collections.unmodifiableList(ids);
//    }

}
