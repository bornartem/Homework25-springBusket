package com.examplehomeworkSpringbusketToStore.service;
import java.util.Collection;
import java.util.List;

public interface BagService {


    List<Integer> add(List<Integer> items);

    Collection<Integer> get();
}
