/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;
import java.util.Random;
/**
 *
 * @author manuel
 */
public class Dice {
   static private int MAX_USES = 5;
   static private final float MAX_INTELLIGENCE = 10.0f;
   static private final float MAX_STRENGTH = 10.0f;
   static private final float RESURRECT_PROB = 0.3f;
   static private final int WEAPONS_REWARD = 2;
   static private final int SHIELDS_REWARD = 3;
   static private final int HEALTH_REWARD = 5;
   static private final int MAX_ATTACK = 3;
   static private final int MAX_SHIELD = 2;
   static private final Random generator = new Random();
   
   static public int randomPos(int max){
       return generator.nextInt(max);
   }
   static public int whoStarts(int nPlayers){
       return generator.nextInt(nPlayers);
   }
   static public double randomIntelligence(){
       return generator.nextFloat() * MAX_INTELLIGENCE;
   }
   static public double randomStrength(){
       return generator.nextFloat() * MAX_STRENGTH;
   }
   static public boolean resurrectPlayer(){
       return (generator.nextFloat() < RESURRECT_PROB);
   }
   static public int weaponsReward(){
       return generator.nextInt(WEAPONS_REWARD + 1);
   }
   static public int shieldsReward(){
       return generator.nextInt(SHIELDS_REWARD + 1);
   }
   static public int healthReward(){
       return generator.nextInt(HEALTH_REWARD + 1);
   }
   static public float weaponPower(){
       return generator.nextInt(MAX_ATTACK + 1);
   }
   static public float shieldPower(){
       return generator.nextInt(MAX_SHIELD + 1);
   }
   static public int usesLelft(){
       return generator.nextInt(MAX_USES + 1);
   }
   static public float intensity(float competence){
       return generator.nextFloat() * (competence + 1);
   }
   static public boolean discardElement(int usesLeft){
    return (generator.nextInt(MAX_USES + 1) > usesLeft);
   }
  
   
   
}
