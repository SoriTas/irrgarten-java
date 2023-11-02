/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

import java.util.*;

/**
 *
 * @author manuel
 */
public class Player {
    private static final int MAX_WEAPONS = 2;
    private static final int MAX_SHIELDS = 2;
    private static final int INITIAL_HEALTH = 10;
    private static final int HITS2LOSE = 3;
    private String name;
    private char number;
    private float intelligence;
    private float strength;
    private float health;
    private int row;
    private int col;
    private int consecutivesHits = 0;
    private ArrayList<Weapon>armas= new ArrayList<Weapon>();
    private ArrayList<Shield>escudos= new ArrayList<Shield>();
    
    public Player(char _number, float _intelligence, float _strength){
        number = _number;
        name = "Player #" + _number;
        intelligence = _intelligence;
        strength = _strength;
        
    }
     /*
    @brief Empty the weapons and shields arrays set health to the initial value and consecutive hits to 0
    */
    public void resurrect(){
        
        armas.clear();
        escudos.clear();
        health = INITIAL_HEALTH;
        consecutivesHits = 0;
    }
     /*
    @brief Return the row of the Player
    @return player row
    */
    public int getRow(){
        
        return row;
        
    }
     /*
    @brief return the col of the player
    @return player col
    */
    public int getCol(){
        
        return col;
    }
     /*
    @brief get the index number of the player
    @return index number
    */
    public char getNumber(){
        
        return number;
    }
     /*
    @brief set the pos of the player
    @param _row row of the pos
    @param _col col of the pos
    */
    public void setPos(int _row, int _col){
        
        row = _row;
        col = _col;
        
    }
     /*
    @brief return true if the player is dead
    */
    public boolean dead(){
        
        return health <= 0;
        
    }
    //Siguiente Practica
    public Directions move(Directions direction, Directions validMoves){
        
       throw new UnsupportedOperationException();
        
    }
     /*
    @brief get the attack of a player
    @return sum of strength and the addition of all the weapons in the weapon array
    */
    public double attack(){
        
        return strength + sumWeapons();
        
    }
     /*
    @brief get if the player defends the attack
    @param recievedAttack the number of attack points
    @return true if he managed to defend the attack
    */
    public boolean defend(float receivedAttack){
        
       return manageHit(receivedAttack); 
        
    }
    //Siguiente Practica
    public void receiveReward(){
        
        throw new UnsupportedOperationException();
        
    }
     /*
    @brief
    */
    public String toString(){
        
        String cadena = name + ";Strength: " + strength + ";Intelligence: " + intelligence + ";Health: " + health;
        return cadena;
    }
     /*
    @brief Create a new weapon
    @return new weapon object
    */
    public Weapon newWeapon(){
        Weapon weapon = new Weapon(Dice.weaponPower(),Dice.usesLeft());
        return weapon;
    }
    /*
    @brief Create a new shield
    @return new shield object
    */
    public Shield newShield(){
        Shield shield = new Shield(Dice.shieldPower(),Dice.usesLeft());
        return shield;
    }
    //Siguente Practica
    private void recieveWeapon(Weapon weapon){
        throw new UnsupportedOperationException();  
    }
    //Siguiente Practica
    private void recieveShields(Shield shield){
        
        for(int i = escudos.size()-1; i >= 0; i--){
            
            boolean discard = escudos.get(i).discard();
            
            if(discard){
                
                escudos.remove(escudos.get(i));
                
            }
            
        }
        int size = escudos.size();
        
        if(size < MAX_SHIELDS){
            
            escudos.add(shield);
            
        }
    }
    /*
    @brief add the power attack of the weapons in the array
    @return total weapon power
    */
    private float sumWeapons(){
        float suma = 0f;
        for (int i = 0; i < armas.size();i++){
            suma = suma + armas.get(i).attack();
        }  
        return suma;
    } 
    /*
    @brief add the power attack of the shields in the array
    @return total shield power
    */
    private float sumShields(){
        float suma = 0f;
        for (int i = 0; i < escudos.size();i++){
            suma = suma + escudos.get(i).protect();
        }  
        return suma;  
    }
    /*
    @brief Return the total points of intelligence and sumshields
    @return defensive Energy
    */
    private double defensiveEnergy(){
        return intelligence + sumShields();
    }
    //Siguiente Practica
    private boolean manageHit(float recievedAttack){
        throw new UnsupportedOperationException();  
    }
    /*
    @brief set consecutivesHits to 0 
    */
    private void resetHits(){
         consecutivesHits = 0;
    }
    /*
    @brief decrease the health parameter 
    */
    private void gotWounded(){
        health--;  
    }
    /*
    @brief Increase the consecutiveHits parameter
    */
    private void intConsecutiveHits(){
        consecutivesHits++;
    }
    
    
}
