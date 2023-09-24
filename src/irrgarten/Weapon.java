/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author manuel
 */
public class Weapon {
    private float power;
    private int uses;
    public Weapon(float p,int u){
        power = p;
        uses = u;
    }
    public float attack(){
        if (uses > 0){
            return power;
        }
        else{
            return 0;
        }
    }
    public String toString(){
        String cadena = "W[" + power + "," + uses + "]";
        return cadena;
    }
    public boolean discard(){
       return Dice.discardElement(uses);
    }
}
