/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author sori
 */
public class WeaponCardDeck extends CardDeck<Weapon>{
    protected void addCards(){
        
        for(int i = 0; i < 2; i++){
           Weapon weapon = new Weapon(Dice.weaponPower(),Dice.usesLeft());
           addCard(weapon);
        }
        
    }
}
