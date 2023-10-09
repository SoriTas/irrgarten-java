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
        
        throw new UnsupportedOperationException();
        
    }
    
    public void resurrect(){
        
        throw new UnsupportedOperationException();
        
    }
    
    public int getRow(){
        
        throw new UnsupportedOperationException();
        
    }
    
    public int getCol(){
        
        throw new UnsupportedOperationException();
        
    }
    
    public char getNumber(){
        
        throw new UnsupportedOperationException();    
    }
    
    public void setPos(int _row, int _col){
        
        throw new UnsupportedOperationException();
        
    }
    
    public boolean dead(){
        
        throw new UnsupportedOperationException();
        
    }
    
    public Directions move(Directions direction, Directions validMoves){
        
       throw new UnsupportedOperationException();
        
    }
    
    public float attack(){
        
        throw new UnsupportedOperationException();
        
    }
    
    public boolean defend(float receivedAttack){
        
       throw new UnsupportedOperationException(); 
        
    }
    
    public void receiveReward(){
        
        throw new UnsupportedOperationException();
        
    }
    
    public String toString(){
        
        throw new UnsupportedOperationException();
        
    }
    private void recieveWeapon(Weapon weapon){
        throw new UnsupportedOperationException();  
    }
    
    private void recieveShields(Shield shield){
        throw new UnsupportedOperationException();  
    }
    private float sumWeapons(){
        throw new UnsupportedOperationException();  
    } 
    private float sumShields(){
        throw new UnsupportedOperationException();  
    }
    private float defensiveEnergy(){
        throw new UnsupportedOperationException();  
    }
    private boolean manageHit(float recievedAttack){
        throw new UnsupportedOperationException();  
    }
    private void resetHits(){
        throw new UnsupportedOperationException();  
    }
    private void gotWounded(){
        throw new UnsupportedOperationException();  
    }
    private void intConsecutiveHits(){
        throw new UnsupportedOperationException();  
    }
    
    
}
