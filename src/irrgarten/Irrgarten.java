/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package irrgarten;

/**
 *
 * @author manuel
 */
enum Directions { LEFT, RIGHT, UP, DOWN}

enum Orientation {VERTICAL, HORIZONTAL}

enum GameCharacter {PLAYER, MONSTER}

public class Irrgarten {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Weapon arma1 = new Weapon ((float) 1.5,5);
        Weapon arma2 = new Weapon ((float) 2.5, 3);
        
        Shield escudo1 = new Shield ((float)1.5, 5);
        Shield escudo2 = new Shield ((float)2.5, 3);
        
        for(int j = 5; j >= 0; j--){
            
            System.out.println(arma1.toString());
            System.out.println(arma2.toString());
            
            System.out.println(arma1.attack());
            System.out.println(arma2.attack());
            
            System.out.println(escudo1.toString());
            System.out.println(escudo2.toString());
            
            System.out.println(escudo1.protect());
            System.out.println(escudo2.protect());
            
            System.out.println("Desechar armas:\n");
            
            System.out.println(arma1.discard());
            System.out.println(arma2.discard());
            
            System.out.println("Desechar escudos:\n");
            
            System.out.println(escudo1.discard());
            System.out.println(escudo2.discard());
            
        }
        
        for(int i = 0; i < 100; i++){
            
            Dice.discardElement(i+1);
            
            Dice.healthReward();
            
            Dice.intensity(i+1);
            
            Dice.randomIntelligence();
            
            Dice.randomPos(i+1);
            
            Dice.randomStrength();
            
            Dice.resurrectPlayer();
            
            Dice.shieldPower();
            
            Dice.shieldsReward();
            
            Dice.usesLeft();
            
            Dice.weaponPower();
            
            Dice.weaponsReward();
            
            Dice.whoStarts(i+1);
            
            
        }

           
        
    }
    
    
}
