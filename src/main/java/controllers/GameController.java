package controllers;

import exceptions.InvalidBotCountException;
import exceptions.InvalidPlayerCountException;
import models.Game;
import models.Player;
import stratergies.winningstratergies.WinningStratergy;

import java.util.List;

public class GameController {

    public Game startGame(int dimension, List<Player> players, int nextPlayerMoveIndex, List<WinningStratergy> winningStratergies) throws InvalidBotCountException, InvalidPlayerCountException {
        Game game = Game.getBuilder().setDimension(dimension).
                setPlayers(players).setNextPlayerMoveIndex(nextPlayerMoveIndex).
                setWinningStratergies(winningStratergies).build();

        return game;
    }

    public Player getWinner(){
        return null;
    }
    public void  printGame(Game game){
        game.getBoard().printBoard();

    }

    public void makeMove(Game game){
        game.makeMove();


    }
    public void undo(){

    }
}
