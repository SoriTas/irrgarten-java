/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author sori
 */
public class LabyrinthCharacter {
    private String name;
    private float intelligence;
    private float strength;
    private float health;
    private int row;
    private int col;
    
    public LabyrinthCharacter(String _name, float _intelligence, float _strength, float _health){
        name = _name;
        intelligence = _intelligence;
        strength = _strength;
        health = _health;
        row = -1;
        col = -1;
    }
    public LabyrinthCharacter(LabyrinthCharacter other){
        this.name = other.name;
        this.intelligence = other.intelligence;
        this.strength = other.strength;
        this.health = other.health;
        this.row = other.row;
        this.col = other.col;
    }
    public boolean dead(){
        return health <= 0;
    }
    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
    protected float getIntelligence(){
        return intelligence;
    }
    protected float getStrength(){
        return strength;
    }
    protected float getHealth(){
        return health;
    }
    protected void setHealth(float _health){
        health = _health;
    }
    public void setPos(int _row, int _col){
        row = _row;
        col = _col;
    }
    @Override
    public String toString(){
        String cadena = "Name: " + name + "; " + "Strength: " + strength + "; " + "Intelligence: " + intelligence + "; " + "Health: " + health + "; " + "Row: " + row + "; " + "Col: " + col + "\n";
        return cadena;
    }
    protected void gotWounded(){
        health--;
    }
}
