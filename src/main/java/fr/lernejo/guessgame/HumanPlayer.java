package fr.lernejo.guessgame;

import java.util.Scanner;

public class HumanPlayer implements Player {
    @Override
    public long askNextGuess() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLong();
    }

    @Override
    public void respond(boolean lowerOrGreater) {

    }
}
