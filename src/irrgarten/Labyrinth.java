/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;
import java.util.ArrayList;
/**
 *
 * @author manuel
 */
public class Labyrinth {
    private static final char BLOCK_CHAR = 'X';
    private static final char EMPTY_CHAR = '-';
    private static final char COMBAT_CHAR = 'C';
    private static final char EXIT_CHAR = 'E';
    private static final int ROW = 0;
    private static final int COL = 1;
    private  int nRows;
    private int nColumns;
    private int exitRow;
    private int exitCol;
    private ArrayList<MonsterSquare> monsterSquare;
    private ArrayList<LabyrinthSquare> labyrinthSquare;
    private Arraylist<PlayerSquare> playerSquare;
}
