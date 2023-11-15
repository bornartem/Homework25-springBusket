package com.examplehomeworkSpringbusketToStore;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Repository
@SessionScope
public class Bag {

    private final List<Integer> bagList = new ArrayList<>();

    public List<Integer> addStore(Integer items) {
        bagList.add(items);
        return bagList;
    }

    public Collection<Integer> get(){
        return new ArrayList<>(bagList);
    }
}
