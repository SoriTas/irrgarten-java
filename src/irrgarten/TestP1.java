/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author pedro
 */
public class TestP1{
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    
       Weapon arma1 = new Weapon ((float)1.2, 5); 
       Weapon arma2 = new Weapon ((float)1.3, 4);
       Weapon arma3 = new Weapon ((float)6.2, 6);
       
       
       
       Shield escudo1= new Shield ((float)3.2,1);
       Shield escudo2= new Shield ((float)4.2,2);
       Shield escudo3= new Shield ((float)5.2,3);

     
       System.out.println(escudo1.toString());
       boolean Ayuda=false;
       
    GameState Jugada = new GameState ("Pachuru","Paquirrin","El feo",1,Ayuda,"Ronda 1");
       


        for (int i = 0; i<100; i++){
           // System.out.println(Dice.resurrectPlayer());
            
          //  System.out.println(Dice.intensity(i+1));
            
            System.out.println(Dice.usesLeft());
            
            //System.out.println(Dice.shieldsReward());
            
            //System.out.println(Dice.whoStarts(1));
            
            //System.out.println(Dice.randomPos(i+1));
            
            //System.out.println( Dice.healthReward());
            
            //System.out.println(Dice.weaponPower());
            
            //System.out.println(Dice.weaponReward());
            
            //System.out.println(Dice.randomStrength());
            
            System.out.println(Dice.shieldPower());
            
            //System.out.println(Dice.randomIntelligence());
            
            System.out.println(Dice.discardElement(5));
             System.out.println(Dice.discardElement(3));
              System.out.println(Dice.discardElement(2));
               System.out.println(Dice.discardElement(4)); System.out.println(Dice.discardElement(5));
               
               
 
            }
                
                
                

    System.out.println("help");
    System.out.println("hedalp");
    System.out.println("help");
    }
    
    
}   
    

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    