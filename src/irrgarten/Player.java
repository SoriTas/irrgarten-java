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
    private ArrayList<Weapon>escudos= new ArrayList<Weapon>();
    
    public Player(char _number, float _intelligence, float _strength){
        number = _number;
        name = "Player #" + _number;
        intelligence = _intelligence;
        strength = _strength;
        
    }
    
    public void resurrect(){
        
        armas.clear();
        escudos.clear();
        health = INITIAL_HEALTH;
        consecutivesHits = 0;
    }
    
    public int getRow(){
        
        return row;
        
    }
    
    public int getCol(){
        
        return col;
    }
    
    public char getNumber(){
        
        return number;
    }
    
    public void setPos(int _row, int _col){
        
        row = _row;
        col = _col;
        
    }
    
    public boolean dead(){
        
        return health <= 0;
        
    }
    //Siguiente Practica
    public Directions move(Directions direction, Directions validMoves){
        
       throw new UnsupportedOperationException();
        
    }
    
    public double attack(){
        
        return strength + sumWeapons();
        
    }
    
    public boolean defend(float receivedAttack){
        
       return manageHit(receivedAttack); 
        
    }
    //Siguiente Practica
    public void receiveReward(){
        
        throw new UnsupportedOperationException();
        
    }
    
    public String toString(){
        
        String cadena = name + ";Strength: " + strength + ";Intelligence: " + intelligence + ";Health: " + health;
        return cadena;
    }
    //Siguente Practica
    private void recieveWeapon(Weapon weapon){
        throw new UnsupportedOperationException();  
    }
    //Siguiente Practica
    private void recieveShields(Shield shield){
        throw new UnsupportedOperationException();  
    }
    private float sumWeapons(){
        float suma = 0f;
        for (int i = 0; i < armas.size();i++){
            suma = suma + armas.get(i).attack();
        }  
        return suma;
    } 
    private float sumShields(){
        float suma = 0f;
        for (int i = 0; i < escudos.size();i++){
            suma = suma + escudos.get(i).attack();
        }  
        return suma;  
    }
    private double defensiveEnergy(){
        return intelligence + sumShields();
    }
    //Siguiente Practica
    private boolean manageHit(float recievedAttack){
        throw new UnsupportedOperationException();  
    }
    private void resetHits(){
         consecutivesHits = 0;
    }
    private void gotWounded(){
        health--;  
    }
    private void intConsecutiveHits(){
        consecutivesHits++;
    }
    
    
}
