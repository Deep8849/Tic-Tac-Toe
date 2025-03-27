package models;

public class Bot extends Player {

    private BotDifficulty difficulty;

    public Bot(String name, int id, Symbol symbol, PlayerType playerType, BotDifficulty difficulty) {
        super(name, id, symbol, playerType);
        this.difficulty = difficulty;
    }
    public BotDifficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(BotDifficulty difficulty) {
        this.difficulty = difficulty;
    }

}
