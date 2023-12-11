/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author manuel
 */
public class Monster extends LabyrinthCharacter {
    private static final int INITIAL_HEALTH = 5;
        
    public Monster(String _name, float _intelligence, float _strength){
        
        super(_name, _intelligence, _strength, INITIAL_HEALTH);
        
    }
    /*
    @brief Return a value generated from the dice class method intensity passing the strength attribute as argument
    */
    public float attack(){
        
        return Dice.intensity(getStrength());
        
    }
    public boolean defend(float receivedAttack){
        
        boolean isDead = this.dead();
        
    if  (!isDead){
        float defensiveEnergy = Dice.intensity(getIntelligence());
        if(defensiveEnergy < receivedAttack){
            this.gotWounded();
            isDead = this.dead();
        }
        
    }
    return isDead;
        
    }
}

