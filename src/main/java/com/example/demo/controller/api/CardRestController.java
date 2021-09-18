package com.example.demo.controller.api;

import com.example.demo.model.Card;
import com.example.demo.model.Denomination;
import com.example.demo.model.Suit;
import com.example.demo.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.jvm.hotspot.memory.Space;

@RequestMapping("/api/card")
@RestController
public class CardRestController {
    @Autowired
    CardService service;

    @GetMapping()
    String sayHello(){
        Card card = new Card(2, Suit.SPADE, Denomination.TEN,10,null);
        return "hello" + card;
    }

    @GetMapping("/{id}")
    Card getCardById(@PathVariable("id") int id){
        System.out.println(id);
        Card card = service.getCardById(id);
        System.out.println(card);
        return card;
    }
}
