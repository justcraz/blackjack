package com.example.demo.model;

import com.example.demo.service.CardInterface;
import com.example.demo.service.CardService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private int id;
    private Suit suit;
    private Denomination denomination;
    private int value;
    private String image;


    @Autowired
    static
    CardService service;

    public int getId() {
        return id;
    }

    public Suit getSuitById(int id){
        int s=id/ 13;
        if(s==0) return Suit.CLUB;
        if(s==1) return Suit.HEART;
        if(s==2) return Suit.SPADE;
        if(s==3) return Suit.DIAMOND;
        return null;
    }

    public Denomination getDenominationById(int id){
        Card card = service.getCardById(id);
        Denomination denomination = card.getDenomination();
        return denomination;
    }

    public int getValueById(){
        Card card = service.getCardById(id);
        int value = card.getValue();
        return value;
    }
}
