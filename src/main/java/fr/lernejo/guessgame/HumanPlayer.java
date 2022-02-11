package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player {


    @Override
    public long askNextGuess() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLong();
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        Logger logger = LoggerFactory.getLogger("HumanPlayer");
        if (lowerOrGreater) {
            logger.log("plus grand");
        } else {
            logger.log("plus petit");
        }
    }
}
