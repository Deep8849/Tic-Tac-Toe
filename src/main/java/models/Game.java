package models;

import exceptions.InvalidBotCountException;
import exceptions.InvalidPlayerCountException;
import stratergies.winningstrategies.WinningStratergy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    List<Move> moves;
    private Board board;
    private GameSate gameSate;
    private int nextPlayerMoveIndex;
    private Player winner;
    List<WinningStratergy> winningStratergies;

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<WinningStratergy> getWinningStratergies() {
        return winningStratergies;
    }

    public void setWinningStratergies(List<WinningStratergy> winningStratergies) {
        this.winningStratergies = winningStratergies;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public GameSate getGameSate() {
        return gameSate;
    }

    public void setGameSate(GameSate gameSate) {
        this.gameSate = gameSate;
    }

    public int getNextPlayerMoveIndex() {
        return nextPlayerMoveIndex;
    }

    public void setNextPlayerMoveIndex(int nextPlayerMoveIndex) {
        this.nextPlayerMoveIndex = nextPlayerMoveIndex;
    }

    private Game(int dimension, List<Player> players,int nextPlayerMoveIndex, List<WinningStratergy> winningStrategies){
        this.players = players;
        this.moves = new ArrayList<>();
        this.board = new Board(dimension);
        this.winner = null;
        this.gameSate = GameSate.IN_PROGRESS;
        this.nextPlayerMoveIndex = nextPlayerMoveIndex;
        this.winningStratergies = winningStrategies;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        private int dimension;
        private List<Player> players;
        private int nextPlayerMoveIndex;
        List<WinningStratergy> winningStratergies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setNextPlayerMoveIndex(int nextPlayerMoveIndex) {
            this.nextPlayerMoveIndex = nextPlayerMoveIndex;
            return this;
        }

        public Builder setWinningStratergies(List<WinningStratergy> winningStratergies) {
            this.winningStratergies = winningStratergies;
            return this;
        }

        public void checkBotCount() throws InvalidBotCountException {
            int botCount = 0;
            for (Player player : players) {
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }
            if(botCount > 1){
                throw new InvalidBotCountException("bot count should not be more than one");
            }

        }

        public void checkPlayerCount() throws InvalidPlayerCountException {
            int playerCount = players.size();
            if(playerCount != dimension-1){
                throw new InvalidPlayerCountException("player count should not be more than dimension");
            }
        }

        public void validate() throws InvalidBotCountException, InvalidPlayerCountException {
            checkBotCount();
            checkPlayerCount();
        }

        public Game build() throws InvalidPlayerCountException, InvalidBotCountException {
            validate();

            return new Game (dimension, players, nextPlayerMoveIndex, winningStratergies);
        }

    }
}
