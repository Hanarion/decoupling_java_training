package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private long numberToGuess;

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        long nbr = this.player.askNextGuess();
        if (nbr < this.numberToGuess)
            logger.log("plus grand");
        if (nbr > this.numberToGuess)
            logger.log("plus petit");
        return nbr == this.numberToGuess;
    }

    public void loopUntilPlayerSucceed() {
        logger.log("Devinez le nombre entre 0 et 100");
        while (!nextRound()) ;
        logger.log("Félicitations tu as trouvé !");
    }
}
