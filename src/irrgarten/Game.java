/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author manuel
 */
public class Game {
    private static final int MAX_ROUNDS = 10;
    private int currentPlayerIndex;
    private String log;
    
    public Game(int nPlayers){
        throw new UnsupportedOperationException();
    }
    public boolean finished(){
        throw new UnsupportedOperationException();
    }
    public boolean nextStep(Directions preferredDirection){
        throw new UnsupportedOperationException();
    }
    public GameState getGameState(){
        throw new UnsupportedOperationException();
    }
    private void configureLabyrinth(){
        throw new UnsupportedOperationException();
    }
    private void nextPlayer(){
        throw new UnsupportedOperationException();
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
        throw new UnsupportedOperationException();
    }
    private void logPlayerWon(){
        throw new UnsupportedOperationException();
    }
    private void logMonsterWon(){
        throw new UnsupportedOperationException();
    }
    private void logResurrected(){
        throw new UnsupportedOperationException();
    }
    private void logPlayerSkipTurn(){
        throw new UnsupportedOperationException();
    }
    private void logPlayerNoOrders(){
        throw new UnsupportedOperationException();
    }
    private void logNoMonster(){
        throw new UnsupportedOperationException();
    }
    private void logRounds(int rounds, int max){
        throw new UnsupportedOperationException();
    }
}   
