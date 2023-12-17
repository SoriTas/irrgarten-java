/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import irrgarten.Directions;
import irrgarten.GameState;
import java.util.Scanner;

/**
 *
 * @author sori
 */
public interface UI {
    public Directions nextMove();
    public void showGame(GameState gameState);
}
