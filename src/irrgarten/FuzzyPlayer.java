/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

import java.util.ArrayList;

/**
 *
 * @author sori
 */
public class FuzzyPlayer extends Player{
    public FuzzyPlayer(Player other){
        super(other);
    }
    @Override
    public Directions move(Directions direction, ArrayList<Directions> validMoves ){
        return Dice.nextStep(direction, validMoves, getIntelligence());
    }
    @Override
    public float attack(){
        return sumWeapons() + Dice.intensity(getStrength());
    }
    @Override
    protected float defensiveEnergy(){
        return sumShields() + Dice.intensity(getIntelligence());
    }
    @Override
    public String toString(){
        String cadena = "FuzzyPlayer-" + super.toString();
        return cadena;
    }
}
