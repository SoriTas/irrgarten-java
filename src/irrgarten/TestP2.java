/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package irrgarten;

/**
 *
 * @author roberto
 */
public class TestP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("----------Monstruo----------");
        System.out.println("Creo el monstruo m1 :");
        Monster m1 = new Monster ("m1", Dice.randomIntelligence(), Dice.randomStrength());
        System.out.println(m1.toString());
        System.out.println("Le paso la posicon 1, 3 :");
        m1.setPos(1, 3);
        System.out.println(m1.toString());
        System.out.println("Ataca :");
        System.out.println(m1.attack());
        m1.defend(4);
         if(m1.dead())
             System.out.println("Esta muerto");
        else
             System.out.println("NO esta muerto");
         System.out.println(m1.toString());
        System.out.println("----------------------------");
        
        System.out.println("-----------Player-----------");
        System.out.println("Creo el player p1 :");
        Player p1 = new Player ('1', Dice.randomIntelligence(), Dice.randomStrength());
        System.out.println(p1.toString());
        System.out.println("Ataca :");
        System.out.println(p1.attack());
       float ola = p1.attack();
        System.out.println(p1.toString());
        System.out.println("Defiende :");
        System.out.println(p1.defend(100));
         if(p1.dead())
             System.out.println("Esta muerto");
        else
             System.out.println("NO esta muerto");
         System.out.println(p1.toString());
        p1.resurrect();
        System.out.println(p1.toString());
        
        System.out.println("----------------------------");
        
        System.out.println("---------Labyrinth----------");
        System.out.println("Creo el laberinto l1 :");
        Labyrinth l1 = new Labyrinth (3, 3, 2, 2);
        System.out.println(l1.toString());
        System.out.println("Añado el monstruo m1 :");
        l1.addMonster(1, 1, m1);
   
       
        System.out.println(l1.toString());
        int pos[];
        for(int i = 0; i < 20; i++){
            pos= l1.randomEmptyPos();
            System.out.println("\n" + "pos: "+pos[0] +", "+ pos[1] +"\n");
            
        }
        System.out.println("----------------------------");
        
        System.out.println("------------Game------------");
        
        System.out.println("----------------------------");
    }
    
}
