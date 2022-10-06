package fr.lernejo.guessgame;

import fr.lernejo.logger.*;


public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        //TODO implement me
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        //TODO implement me
        this.numberToGuess = numberToGuess;
        loopUntilPlayerSucceed();
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        //TODO implement me
        logger.log("Guess number ?");
        long userInput = player.askNextGuess();
        if(userInput==this.numberToGuess){
            logger.log("You found the number");
            return true;
        }
        else{
            player.respond(userInput>this.numberToGuess);
            return false;
        }

    }

    public void loopUntilPlayerSucceed() {
        //TODO implement me
        while(!nextRound()){

        }
    }
}
