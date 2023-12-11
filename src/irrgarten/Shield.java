/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author manuel
 */
public class Shield extends CombatElement{
    public Shield(float p,int u){
        super(p,u);
    }
    public float protect(){
        return produceEffect();
    }
    @Override
    public String toString(){
        String cadena = "S" + super.toString();
        return cadena;
    }
}
