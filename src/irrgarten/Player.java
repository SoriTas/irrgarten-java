/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

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
    
}
