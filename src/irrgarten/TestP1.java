/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author sori
 */
public class TestP1 {
    
    public static void main(){
        
        Weapon arma1 = new Weapon ((float) 1.5,5);
        Weapon arma2 = new Weapon ((float) 2.5, 3);
        
        Shield escudo1 = new Shield ((float)1.5, 5);
        Shield escudo2 = new Shield ((float)2.5, 3);
        
        for(int j = 5; j >= 0; j--){
            
            System.out.println(arma1.toString());
            System.out.println(arma2.toString());
            
            System.out.println(arma1.attack());
            arma2.attack();
            
            escudo1.toString();
            escudo2.toString();
            
            escudo1.protect();
            escudo2.protect();
            
            System.out.println("Desechar armas:\n");
            
            arma1.discard();
            arma2.discard();
            
            System.out.println("Desechar escudos:\n");
            
            escudo1.discard();
            escudo2.discard();
            
        }
        
       /* for(int i = 0; i < 100; i++){
            
            Dice.discardElement(i+1);
            
            Dice.healthReward();
            
            Dice.intensity(i+1);
            
            Dice.randomIntelligence();
            
            Dice.randomPos(i+1);
            
            Dice.randomStrength();
            
            Dice.resurrectPlayer();
            
            Dice.shieldPower();
            
            Dice.shieldsReward();
            
            Dice.usesLelft();
            
            Dice.weaponPower();
            
            Dice.weaponsReward();
            
            Dice.whoStarts(i+1);
            
            
        }

            */
    }
}
