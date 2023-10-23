/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author manuel
 */
public class Monster {
    private static final int INITIAL_HEALTH = 5;
    private String name;
    private float intelligence;
    private float strength;
    private float health;
    private int row;
    private int col;
    
    public Monster(String _name, float _intelligence, float _strength){
        
        throw new UnsupportedOperationException();
        
    }
    //Checks if the monster is dead. Return a true if health is lower or equal to zero
    public boolean dead(){
        
        return health <= 0;
        
    }
    //Return a value generated from the dice class method intensity passing the strength attribute as argument
    public float attack(){
        
        return Dice.intensity(strength);
        
    }
//EN LA PROXIMA PRACTICA
    public boolean defend(float receivedAttack){
        
        throw new UnsupportedOperationException();
        
    }
    //Refresh the position of the monster
    public void setPos(int _row, int _col){
        
        row = _row;
        col = _col;
        
    }
    //Return the a string containing the stats of the mosnter
    public String toString(){
        
        String cadena = "Name: " + name + ";Intelligence: " + intelligence + ";Strength: " + strength + ";Health: " + health +";Row: " + row + ";Col: " + col;
        return cadena;
    }
    //Decrease one unit the health of the monster
    private void gotWounded(){
        
        health--;
        
    }
    
}

