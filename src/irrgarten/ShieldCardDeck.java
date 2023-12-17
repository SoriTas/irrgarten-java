/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author sori
 */
public class ShieldCardDeck extends CardDeck<Shield>{
    protected void addCards(){
        
        for(int i = 0; i < 2; i++){
           Shield shield = new Shield(Dice.shieldPower(),Dice.usesLeft());
           addCard(shield);
        }
        
    }
}
