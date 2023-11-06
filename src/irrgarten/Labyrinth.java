/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;
import java.util.ArrayList;
/**
 *
 * @author sori
 */
public class Labyrinth {
    private static final char BLOCK_CHAR = 'X';
    private static final char EMPTY_CHAR = '-';
    private static final char COMBAT_CHAR = 'C';
    private static final char EXIT_CHAR = 'E';
    private static final char MONSTER_CHAR = 'M';
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
        
        for(int i = 0; i < nRows; i++){
            
            for(int j = 0; j < nColumns; j++){
                
                labyrinthGrid[i][j] = EMPTY_CHAR;
                
            }
            
        }
        
        labyrinthGrid[exitRow][exitCol] = EXIT_CHAR;
        
    }
    
    public int getnRows(){
        
        return nRows;
        
    }
    public int getnColumns(){
        
        return nColumns;
        
    }
    
    public void spreadPlayers(ArrayList<Player> players){
        
        for(int i = 0; i < players.size(); i++){
            Player p = players.get(i);
            int pos[] = this.randomEmptyPos();
            this.putPlayer2D(-1, -1, pos[ROW], pos[COL], p);
        }
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
        
        return labyrinthGrid.toString();
        
    }
    public void addMonster(int row,int col, Monster monster){
        if (!posOK(row,col)){
            throw new UnsupportedOperationException();
        }
        if(labyrinthGrid[row][col] == EMPTY_CHAR){
           
            labyrinthGrid[row][col] = MONSTER_CHAR;
        
            monsterGrid[row][col] = monster;
        
            monster.setPos(row, col);
            
        }
        else{
            
            System.out.println("The given position isn't empty");
            
        }
        
    }
    public Monster putPlayer(Directions direction, Player player){
        int oldRow = player.getRow();
        int oldCol = player.getCol();
        int newPos[] = this.dir2Pos(oldRow, oldCol, direction);
        Monster monster = this.putPlayer2D(oldRow, oldCol,newPos[ROW], newPos[COL], player);
        return monster;
        }
    public void addBlock(Orientation orientation, int startRow, int startColumn,int length){
        int incRow;
        int incCol;
        if (orientation == Orientation.VERTICAL){
             incRow = 1;
             incCol = 0;
        }
        else{
             incRow = 0;
             incCol = 1;
        }
        int row = startRow;
        int col = startColumn;
        while(this.posOK(row, col) && this.emptyPos(row, col) && length > 0){
            labyrinthGrid[row][col] = BLOCK_CHAR;
            length -= 1;
            row += incRow;
            col += incCol;
        }
    }
    //Preguntar al teacher
    public Directions[] validMoves(int row,int col){
        Directions output[];
        if(canStepOn(row+1,col)){
            output.add(Directions.DOWN);
        }
        if(canStepOn(row-1,col)){
            output.add(Directions.UP);
        }
        if(canStepOn(row,col+1)){
            output.add(Directions.RIGHT);
        }
        if(canStepOn(row,col-1)){
            output.add(Directions.LEFT);
        }
        return output;
    }
    private boolean posOK(int row, int col){
        
        if( row < nRows && row > 0 && col < nColumns && col > 0){
            
            return true;
        }
        else{
            
            return false;
            
        }
        
    }
    private boolean emptyPos(int row,int col){
        
        if(labyrinthGrid[row][col] == '-'){
            
            return true;
            
        }
        else{
            
            return false;
            
        }
        
    }
    private boolean monsterPos(int row,int col){
        
        if( labyrinthGrid[row][col] == MONSTER_CHAR){
            
            return true;
            
        }
        else{
            
            return false;
            
        }
    }
    private boolean exitPos(int row, int col){
        
        if( labyrinthGrid[row][col] == EXIT_CHAR){
            
            return true;
            
        }
        else{
            
            return false;
            
        }
        
    }
    private boolean combatPos(int row,int col){
        
        if( labyrinthGrid[row][col] == COMBAT_CHAR){
            
            return true;
            
        }
        else{
            
            return false;
            
        }
        
    }
    private boolean canStepOn(int row, int col){
        
        if(posOK(row,col) || emptyPos(row,col) || monsterPos(row,col) || exitPos(row,col)){   
            return true;
        }
        else{ 
            return false;
        }
    }
    private void updateOldPos(int row,int col){
        
        if(posOK(row,col)){
            
            if(labyrinthGrid[row][col] == COMBAT_CHAR){
                
                labyrinthGrid[row][col] = MONSTER_CHAR;
                
            }
            else{
                
                labyrinthGrid[row][col] = EMPTY_CHAR;
                
            }
            
        }
        
    }
    private int[] dir2Pos(int row, int col, Directions direction){
        throw new UnsupportedOperationException();
    }
    private int[] randomEmptyPos(){
        throw new UnsupportedOperationException();
    }
    private Monster putPlayer2D(int oldRow, int oldCol, int row, int col, Player player){

        Monster output = null;

        if(canStepOn(row,col)){
            if(posOK(oldRow,oldCol)){
                Player p = playerGrid[oldRow][oldCol];
                if(p == player){
                    updateOldPos(oldRow, oldCol);
                    p.setPos(oldRow, oldCol);
                }
            }
            boolean monsterPos = monsterPos(row, col);
            if(monsterPos){
                labyrinthGrid[row][col] = COMBAT_CHAR;
                output = monsterGrid[row][col];
            }
            else{
                char number = player.getNumber();
                labyrinthGrid[row][col] = number;
            }
            playerGrid[row][col] = player;
            player.setPos(row, col);
        }
        return output;
    }
 }