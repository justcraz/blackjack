package com.example.demo.service;

import com.example.demo.storage.Deck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    Deck originalDeck;

}
