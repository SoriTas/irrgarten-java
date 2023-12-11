/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

import java.util.*;

/**
 *
 * @author sori
 */
public class Player extends LabyrinthCharacter{
    private static final int MAX_WEAPONS = 2;
    private static final int MAX_SHIELDS = 2;
    private static final int INITIAL_HEALTH = 10;
    private static final int HITS2LOSE = 3;
    private char number;
    private int consecutivesHits = 0;
    private ArrayList<Weapon>weapons= new ArrayList<Weapon>();
    private ArrayList<Shield>shields= new ArrayList<Shield>();
    
    public Player(char _number, float _intelligence, float _strength){
        super("Player #" +_number, _intelligence, _strength, INITIAL_HEALTH);
        number = _number;
    }
    public Player(Player other){
        super(other);
        number = other.number;
    }
     /*
    @brief Empty the weapons and shields arrays set health to the initial value and consecutive hits to 0
    */
    public void resurrect(){
        
        weapons.clear();
        shields.clear();
        setHealth(INITIAL_HEALTH);
        consecutivesHits = 0;
    }
     /*
    @brief get the index number of the player
    @return index number
    */
    public char getNumber(){
        
        return number;
    }
    //Preguntar al teacher
    public Directions move(Directions direction, ArrayList <Directions> validMoves){
        
       int size = validMoves.size();
       boolean contained = validMoves.contains(direction);
       
       if(size > 0 && !contained){
           Directions firstElement = validMoves.get(0);
           return firstElement;
       }
       else 
           return direction;
        
    }
     /*
    @brief get the attack of a player
    @return sum of strength and the addition of all the weapons in the weapon array
    */
    public float attack(){
        
        return getStrength() + sumWeapons();
        
    }
     /*
    @brief get if the player defends the attack
    @param recievedAttack the number of attack points
    @return true if he managed to defend the attack
    */
    public boolean defend(float receivedAttack){
        
        return this.manageHit(receivedAttack);
        
    }
    //Siguiente Practica
    public void receiveReward(){
        
        int wReward = Dice.weaponsReward();
        int sReward = Dice.shieldsReward();
        for(int i = 1; i <= wReward; i++){
            Weapon wnew = this.newWeapon();
            this.recieveWeapon(wnew);
        }
        for(int i = 1; i <= wReward; i++){
            Shield snew = this.newShield();
            this.recieveShield(snew);
        }
        int extraHealth = Dice.healthReward();
        setHealth(getHealth()+extraHealth);
        
    }
     /*
    @brief
    */
    @Override
    public String toString(){
        
        String cadena = super.toString();
        for(int i = 0; i < weapons.size(); i++){
            
            cadena = cadena + weapons.get(i).toString();
            
        }
        
        cadena = cadena + "; Shields: ";
        
        for(int i = 0; i < shields.size(); i++){
            
            cadena = cadena + shields.get(i).toString();
            
        }
        
        cadena = cadena + "\n";
        
        return cadena;
    }
     /*
    @brief Create a new weapon
    @return new weapon object
    */
    private Weapon newWeapon(){
        Weapon weapon = new Weapon(Dice.weaponPower(),Dice.usesLeft());
        return weapon;
    }
    /*
    @brief Create a new shield
    @return new shield object
    */
    private Shield newShield(){
        Shield shield = new Shield(Dice.shieldPower(),Dice.usesLeft());
        return shield;
    }
    //Siguente Practica
    private void recieveWeapon(Weapon weapon){
            for(int i = weapons.size()-1; i >= 0; i--){
            
            boolean discard = weapons.get(i).discard();
            
            if(discard){
                
                weapons.remove(weapons.get(i));
                
            }
            
        }
        int size = weapons.size();
        
        if(size < MAX_SHIELDS){
            
            weapons.add(weapon);
            
        }
    }
    //Siguiente Practica
    private void recieveShield(Shield shield){
        
        for(int i = shields.size()-1; i >= 0; i--){
            
            boolean discard = shields.get(i).discard();
            
            if(discard){
                
                shields.remove(shields.get(i));
                
            }
            
        }
        int size = shields.size();
        
        if(size < MAX_SHIELDS){
            
            shields.add(shield);
            
        }
    }
    /*
    @brief add the power attack of the weapons in the array
    @return total weapon power
    */
    protected float sumWeapons(){
        float suma = 0f;
        for (int i = 0; i < weapons.size();i++){
            suma = suma + weapons.get(i).attack();
        }  
        return suma;
    } 
    /*
    @brief add the power attack of the shields in the array
    @return total shield power
    */
    protected float sumShields(){
        float suma = 0f;
        for (int i = 0; i < shields.size();i++){
            suma = suma + shields.get(i).protect();
        }  
        return suma;  
    }
    /*
    @brief Return the total points of intelligence and sumshields
    @return defensive Energy
    */
    protected float defensiveEnergy(){
        return getIntelligence() + sumShields();
    }
    //Siguiente Practica
    private boolean manageHit(float recievedAttack){
        float defense = this.defensiveEnergy();
        if(defense < recievedAttack){
            this.gotWounded();
            this.intConsecutiveHits();
        }
        else
            this.resetHits();
        boolean lose;
        if(this.consecutivesHits == HITS2LOSE || this.dead()){
            this.resetHits();
            return lose = true;
        }
        else
            return lose = false;
    }
    /*
    @brief set consecutivesHits to 0 
    */
    private void resetHits(){
         consecutivesHits = 0;
    }
    /*
    @brief Increase the consecutiveHits parameter
    */
    private void intConsecutiveHits(){
        consecutivesHits++;
    }
    
    
}
