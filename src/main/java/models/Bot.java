package models;

import factory.BotPlayingStrategyFactory;
import stratergies.boatplayingstratergies.BotPlayingStrategy;

public class Bot extends Player {

    private BotDifficulty difficulty;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(String name, int id, Symbol symbol, PlayerType playerType, BotDifficulty difficulty) {
        super(name, id, symbol, playerType);
        this.difficulty = difficulty;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(difficulty);
    }
    public BotDifficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(BotDifficulty difficulty) {

        this.difficulty = difficulty;
    }

    @Override
    public Move makeMove(Board board) {
        Move move = botPlayingStrategy.makeMove(board);
        //bcz in the strategy this feild was null;
        move.setPlayer(this);
        return move;
    }

}
