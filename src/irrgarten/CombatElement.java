/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author sori
 */
public abstract class CombatElement {
    private float effect;
    private int uses;
    
    public CombatElement(float _effect, int _uses){
        effect = _effect;
        uses = _uses;
    }
    protected float produceEffect(){
        if(uses < 0){
            uses--;
            return effect;
        }
        else{
            return 0;
        }
    }
    public boolean discard(){
        return Dice.discardElement(uses);
    }
    @Override
    public String toString(){
        return "[" + this.effect + this.uses + "]"; 
    }
}
