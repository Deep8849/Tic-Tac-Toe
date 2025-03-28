package factory;

import models.BotDifficulty;
import stratergies.boatplayingstratergies.BotPlayingStrategy;
import stratergies.boatplayingstratergies.EasyBotPlayingStrategy;
import stratergies.boatplayingstratergies.HardBotPlayingStrategy;
import stratergies.boatplayingstratergies.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficulty difficulty) {
        if (difficulty.equals(BotDifficulty.EASY)) {
            return new EasyBotPlayingStrategy();
        }
        if (difficulty.equals(BotDifficulty.HARD)) {
            return new HardBotPlayingStrategy();
        }
        if (difficulty.equals(BotDifficulty.MEDIUM)) {
            return new MediumBotPlayingStrategy();
        }
        return null;
    }
}
