package com.examplehomeworkSpringbusketToStore.controller;


import com.examplehomeworkSpringbusketToStore.service.BagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class BagController {
    @Autowired
    private BagService bagService;

    @GetMapping("/add")
    public List<Integer> add(@RequestParam List<Integer> items) {
        return bagService.add(items);
    }

    @GetMapping
    public Collection<Integer> get() {
        return bagService.get();
    }


}
