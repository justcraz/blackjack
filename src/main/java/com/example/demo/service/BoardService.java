package com.example.demo.service;

import com.example.demo.model.Board;
import com.example.demo.model.Card;
import com.example.demo.storage.Deck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class BoardService {

    @Autowired
    Deck originalDeck;

    Board board = new Board();

    @PostConstruct
    void init(){
        createNewGame();
    }

    public int getGamerScore(){
        int score = 0;
        for (int i = 0; i < board.getGamerCards().size(); i++) {
            score += board.getGamerCards().get(i).getValue();
        }
        return score;
    }

    public int getComputerScore(){
        return board.getDealerCards().stream()
                .mapToInt(Card::getValue).sum();
    }

    public void shufflerDeck(){
        Collections.shuffle(board.getDeck());
    }

    public String createMessage(){
        board.setMessage("player score " + this.getGamerScore()
                + " dealer score " + this.getComputerScore()
                + " " +  board.isTurn() + " turn "
                + (getBoard().getDeck().size()-1));
        return board.getMessage();
    }

    public Board getBoard() {
        return board;
    }

    public void createNewGame(){
        this.board = new Board();
        board.setDealerCards(new ArrayList<>());
        board.setGamerCards(new ArrayList<>());
        board.setDeck(originalDeck.getDeck());
        board.setTurn(true);
        createMessage();
    }

    public void giveCardToGamer(){
        int lasIndex = getBoard().getDeck().size()-1;
        if(this.getBoard().isTurn()){
            if(lasIndex<0 || board.getMessage().equals("Game Over")){
                board.setMessage("Game Over");
            }else{
                Card card = this.getBoard().getDeck().get(lasIndex);
                board.getGamerCards().add(card);
                board.getDeck().remove(lasIndex);
                createMessage();
                if(getGamerScore()>21){
                    board.setMessage("Game Over");
                }
            }
        }
    }

    public void giveCardToComputer() {
        for (int i = 0; i < 3; i++) {
            int lastIndex = getBoard().getDeck().size()-1;
            Card card = this.getBoard().getDeck().get(lastIndex);
            board.getDeck().remove(lastIndex);
            board.getDealerCards().add(card);
        }

    }
}
