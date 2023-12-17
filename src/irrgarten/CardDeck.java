/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author sori
 */
public abstract class CardDeck<T> {
    private ArrayList<T> cardDeck;
    
    public CardDeck(){
        cardDeck = new ArrayList<T>();
    }
    protected abstract void addCards();
    protected void addCard(T card){
        cardDeck.add(card);
    }
    public T nextCard(){
        if(cardDeck.size() == 0 || cardDeck.get(0) == null){
            addCards();
            Collections.shuffle(cardDeck);
        }
        
        T card = cardDeck.get(0);
        
        cardDeck.remove(0);
        
        return card;
    }
}
