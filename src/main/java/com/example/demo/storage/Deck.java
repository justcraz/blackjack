package com.example.demo.storage;

import com.example.demo.model.Card;
import com.example.demo.model.Denomination;
import com.example.demo.model.Suit;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@Data
public class Deck {
    private List<Card> deck = new ArrayList<>(
            Arrays.asList(
                    new Card (Suit.CLUB , Denomination.TWO , 2, "/image/C2.png"),
                    new Card (Suit.CLUB , Denomination.THREE , 3, "/image/C3.png"),
                    new Card (Suit.CLUB , Denomination.FOUR , 4, "/image/C4.png"),
                    new Card (Suit.CLUB , Denomination.FIVE , 5, "/image/C5.png"),
                    new Card (Suit.CLUB , Denomination.SIX , 6, "/image/C6.png"),
                    new Card (Suit.CLUB , Denomination.SEVEN , 7, "/image/C7.png"),
                    new Card (Suit.CLUB , Denomination.EIGHT , 8, "/image/C8.png"),
                    new Card (Suit.CLUB , Denomination.NINE , 9, "/image/C9.png"),
                    new Card (Suit.CLUB , Denomination.TEN , 10, "/image/C10.png"),
                    new Card (Suit.CLUB , Denomination.JACK , 2, "/image/CJ.png"),
                    new Card (Suit.CLUB , Denomination.QUEEN , 3, "/image/CQ.png"),
                    new Card (Suit.CLUB , Denomination.KING , 4, "/image/CK.png"),
                    new Card (Suit.CLUB , Denomination.ACE , 11, "/image/CA.png"),
                    new Card (Suit.HEART , Denomination.TWO , 2, "/image/H2.png"),
                    new Card (Suit.HEART , Denomination.THREE , 3, "/image/H3.png"),
                    new Card (Suit.HEART , Denomination.FOUR , 4, "/image/H4.png"),
                    new Card (Suit.HEART , Denomination.FIVE , 5, "/image/H5.png"),
                    new Card (Suit.HEART , Denomination.SIX , 6, "/image/H6.png"),
                    new Card (Suit.HEART , Denomination.SEVEN , 7, "/image/H7.png"),
                    new Card (Suit.HEART , Denomination.EIGHT , 8, "/image/H8.png"),
                    new Card (Suit.HEART , Denomination.NINE , 9, "/image/H9.png"),
                    new Card (Suit.HEART , Denomination.TEN , 10, "/image/H10.png"),
                    new Card (Suit.HEART , Denomination.JACK , 2, "/image/HJ.png"),
                    new Card (Suit.HEART , Denomination.QUEEN , 3, "/image/HQ.png"),
                    new Card (Suit.HEART , Denomination.KING , 4, "/image/HK.png"),
                    new Card (Suit.HEART , Denomination.ACE , 11, "/image/HA.png"),
                    new Card (Suit.SPADE , Denomination.TWO , 2, "/image/P2.png"),
                    new Card (Suit.SPADE , Denomination.THREE , 3, "/image/P3.png"),
                    new Card (Suit.SPADE , Denomination.FOUR , 4, "/image/P4.png"),
                    new Card (Suit.SPADE , Denomination.FIVE , 5, "/image/P5.png"),
                    new Card (Suit.SPADE , Denomination.SIX , 6, "/image/P6.png"),
                    new Card (Suit.SPADE , Denomination.SEVEN , 7, "/image/P7.png"),
                    new Card (Suit.SPADE , Denomination.EIGHT , 8, "/image/P8.png"),
                    new Card (Suit.SPADE , Denomination.NINE , 9, "/image/P9.png"),
                    new Card (Suit.SPADE , Denomination.TEN , 10, "/image/P10.png"),
                    new Card (Suit.SPADE , Denomination.JACK , 2, "/image/PJ.png"),
                    new Card (Suit.SPADE , Denomination.QUEEN , 3, "/image/PQ.png"),
                    new Card (Suit.SPADE , Denomination.KING , 4, "/image/PK.png"),
                    new Card (Suit.SPADE , Denomination.ACE , 11, "/image/PA.png"),
                    new Card (Suit.DIAMOND , Denomination.TWO , 2, "/image/T2.png"),
                    new Card (Suit.DIAMOND , Denomination.THREE , 3, "/image/T3.png"),
                    new Card (Suit.DIAMOND , Denomination.FOUR , 4, "/image/T4.png"),
                    new Card (Suit.DIAMOND , Denomination.FIVE , 5, "/image/T5.png"),
                    new Card (Suit.DIAMOND , Denomination.SIX , 6, "/image/T6.png"),
                    new Card (Suit.DIAMOND , Denomination.SEVEN , 7, "/image/T7.png"),
                    new Card (Suit.DIAMOND , Denomination.EIGHT , 8, "/image/T8.png"),
                    new Card (Suit.DIAMOND , Denomination.NINE , 9, "/image/T9.png"),
                    new Card (Suit.DIAMOND , Denomination.TEN , 10, "/image/T10.png"),
                    new Card (Suit.DIAMOND , Denomination.JACK , 2, "/image/TJ.png"),
                    new Card (Suit.DIAMOND , Denomination.QUEEN , 3, "/image/TQ.png"),
                    new Card (Suit.DIAMOND , Denomination.KING , 4, "/image/TK.png"),
                    new Card (Suit.DIAMOND , Denomination.ACE , 11, "/image/TA.png")
            )
    );
}
