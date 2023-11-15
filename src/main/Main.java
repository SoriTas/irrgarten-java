/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import irrgarten.*;

/**
 *
 * @author sori
 */
public class Main {
    
    public static void main(String args[]){
      
        Game partida = new Game(7);
        
        GameState estado = partida.getGameState();
        
        System.out.println(estado.getLabyrinthv());
        System.out.println(estado.getPlayers());
        System.out.println(estado.getMonsters());
        System.out.println(estado.getCurrentPlayer());
        System.out.println(estado.getWinner());
        System.out.println(estado.getLog());
        
        
        
    }
    
}
