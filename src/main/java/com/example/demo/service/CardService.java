package com.example.demo.service;

import com.example.demo.model.Card;
import com.example.demo.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService implements CardInterface{
    @Autowired
    CardRepository repository;

    @Override
    public Card getCardById(int id) {
        Card card = repository.getDeck().stream().filter(item->item.getId() == id)
                .findFirst().get();
        return card;
    }

}
