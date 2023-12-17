/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import irrgarten.*;
import UI.*;
import controller.Controller;

/**
 *
 * @author sori
 */
public class MainGUI {
    public static void main(String[] args) throws InterruptedException {
        GraphicUI vista = new GraphicUI();
        Game game = new Game(2);
        Controller controller = new Controller(game,vista);
        controller.play();        
    }

}
