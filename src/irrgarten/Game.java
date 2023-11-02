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

public class Game {
    private static final int MAX_ROUNDS = 10;
    private int currentPlayerIndex;
    private String log;
    private Player currentPlayer;
    private int numPlayers;
    private ArrayList<Player> players;
    private ArrayList<Monster> monsters;
    private Labyrinth labyrinth;
    
    public Game(int nPlayers){
        
        ArrayList<Player> players = new ArrayList<Player>(nPlayers);
        
        for(int i=0; i < nPlayers; i++){
            
            char num = 'i';
            float in = Dice.randomIntelligence();
            float str = Dice.randomStrength();
            Player aux = new Player(num,in,str);
            
            players.add(aux);
            
            numPlayers++;
            
        }
        
        int start = Dice.whoStarts(nPlayers);
        
        currentPlayerIndex = start;
        
        currentPlayer = players.get(start);
        
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        
        //Hay que poner unos valores para inicializar el tablero
        labyrinth = new Labyrinth(5,7,5,7);
        
        //En teoria hay que inicializar tambien el log pero no se a que
        
        log = null;
        
        configureLabyrinth();
        
        labyrinth.spreadPlayers(players);
        
    }
    public boolean finished(){
        
        return labyrinth.haveAWInner();
        
    }
    public boolean nextStep(Directions preferredDirection){
        throw new UnsupportedOperationException();
    }
    public GameState getGameState(){
        
        boolean winner = finished();
        
        GameState estado = new GameState(labyrinth.toString(), players.toString(), monsters.toString(), currentPlayerIndex, winner, log);
        
        return estado;
        
    }
    private void configureLabyrinth(){
            
        String monName1 = "Monstruo" + 1;
            
        Monster mon1 = new Monster(monName1, Dice.randomIntelligence(), Dice.randomStrength());
            
        int row1 = 2,
            col1 = 3;
            
        labyrinth.addMonster(row1, col1, mon1);
        
        String monName2 = "Monstruo" + 2;
            
        Monster mon2 = new Monster(monName2, Dice.randomIntelligence(), Dice.randomStrength());
            
        int row2 = 4,
            col2 = 5;
            
        labyrinth.addMonster(row2, col2 , mon2);
        
        labyrinth.addBlock(Orientation.HORIZONTAL, 1, 5, 3);
        labyrinth.addBlock(Orientation.VERTICAL, 3, 3, 2);
        labyrinth.addBlock(Orientation.VERTICAL, 3, 4, 2);
    }
    private void nextPlayer(){
        
        currentPlayerIndex +=1;
        
        currentPlayerIndex = currentPlayerIndex%numPlayers;
        
        currentPlayer = players.get(currentPlayerIndex);
        
    }
    private Directions actualDirection(Directions preferredDirection){
        throw new UnsupportedOperationException();
    }
    private GameCharacter combat(Monster monster){
        throw new UnsupportedOperationException();
    }
    private void manageReward(GameCharacter winner){
        throw new UnsupportedOperationException();
    }
    private void manageResurrection(){
        
        boolean resurrect = Dice.resurrectPlayer();
        
        if(resurrect){
            
            this.currentPlayer.resurrect();
            this.logResurrected();
            
        }
        
        this.logPlayerSkipTurn();
    }
    private void logPlayerWon(){
        
        log += "The player has won the combat\n";
        
    }
    private void logMonsterWon(){
        
        log += "The monster has won the combat\n";
        
    }
    private void logResurrected(){
        
        log += "The player has resurrected\n";
        
    }
    private void logPlayerSkipTurn(){
        
        log += "The player is dead so turn skipped\n";
        
    }
    private void logPlayerNoOrders(){
        
        log += "The player has not been able to follow the introduced instructions\n";
        
    }
    private void logNoMonster(){
        
        log += "The player moved to an empty spot or was not able to move\n";
        
    }
    private void logRounds(int rounds, int max){
        
        log += rounds + " rounds from " + max + " rounds played\n";
        
    }
}   
