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
    private Monster[][] monsterGrid;
    private char[][] labyrinthGrid;
    private Player[][] playerGrid;
    
    public Labyrinth(int _nRows, int _nCols, int _exitRows, int _exitCol){
        monsterGrid = new Monster[_nRows][_nCols];
        labyrinthGrid = new char[_nRows][_nCols];
        playerGrid = new Player[_nRows][_nCols];
        nRows = _nRows;
        nColumns = _nCols;
        exitRow = _exitRows;
        exitCol = _exitCol;
    }//Siguiente Practica
    public void spreadPlayers(ArrayList<Player> players){
        
        throw new UnsupportedOperationException();
    }
    public boolean haveAWInner(){
        if(playerGrid[exitRow][exitCol] != null){
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        throw new UnsupportedOperationException();
    }
    public void addMonster(int row,int col, Monster monster){
        if (labyrinthGrid[row][col] != EMPTY_CHAR){
            throw new UnsupportedOperationException();
        }
        monsterGrid[row][col] = monster;
    }
    public Monster putPlayer(Directions direction, Player player){
        throw new UnsupportedOperationException();
    }
    public void addBlock(Orientation orientation, int startRow, int startColumn,int length){
        throw new UnsupportedOperationException();
    }
    public Directions[] validMoves(int row,int col){
        throw new UnsupportedOperationException();
    }
    private boolean posOK(int row, int col){
        throw new UnsupportedOperationException();
    }
    private boolean emptyPos(int row,int col){
        throw new UnsupportedOperationException();
    }
    private boolean monsterPos(int row,int col){
        throw new UnsupportedOperationException();
    }
    private boolean combatPos(int row,int col){
        throw new UnsupportedOperationException();
    }
    private boolean canStepOn(int row, int col){
        throw new UnsupportedOperationException();
    }
    private void updateOldPos(int row,int col){
        throw new UnsupportedOperationException();
    }
    private int[] dir2Pos(int row, int col, Directions direction){
        throw new UnsupportedOperationException();
    }
    private int[] randomEmptyPos(){
        throw new UnsupportedOperationException();
    }
    private Monster putPlayer2D(int oldRow, int row, int col, Player player){
        throw new UnsupportedOperationException();
    }
}
