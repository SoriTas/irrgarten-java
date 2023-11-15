/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package irrgarten;
import UI.TextUI;
import controller.Controller;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class TestP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       
        
      Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido al divertidísimo juego Irrgarten: \n");
        System.out.println("Selecciona el número de jugadores: \n");
        
        
        //Introduce un numero
         //int nplayers=in.nextInt();
         System.out.println("Elegiste jugar con: ");
        // System.out.println(nplayers);
         System.out.println(" jugadores. Ahora toca jugar. ");
     
        Game game = new Game (1);
        TextUI view = new TextUI();
        
        Controller Controlador = new Controller(game, view);
        
        Controlador.play();
    }
}
