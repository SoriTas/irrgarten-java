/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author manuel
 */
public class GameState {
    private String labyrinthv;
    private String players;
    private String monsters;
    private int currentPlayer;
    private boolean winner;
    private String log;
    
    GameState(String _labyrinthv, String _players, String _monsters, int _currentPlayer, boolean _winner, String _log){
        labyrinthv = _labyrinthv;
        players = _players;
        monsters = _monsters;
        currentPlayer = _currentPlayer;
        winner = _winner;
        log = _log;
    }
    
    public String getLabyrinthv(){
        return labyrinthv;
    }
    public String getPlayers(){
        return players;
    }
    public String getMonsters(){
        return monsters;
    }
    public int getCurrentPlayer(){
        return currentPlayer;
    }
    public boolean getWinner(){
        return winner;
    }
    public String getLog(){
        return log;
    }
}
