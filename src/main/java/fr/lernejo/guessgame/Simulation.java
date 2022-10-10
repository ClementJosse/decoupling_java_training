package fr.lernejo.guessgame;
import java.util.Date;
import fr.lernejo.logger.*;

import java.text.SimpleDateFormat;

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

    public void loopUntilPlayerSucceed(long maxIteration) {
        //TODO implement me
        long startTime=System.currentTimeMillis();
        int i =0;
        while(!nextRound()&&i<maxIteration){
            i++;
        }
        String originalFormat = new SimpleDateFormat("mm:ss.SSS").format(System.currentTimeMillis()-startTime);
        if(i==maxIteration){
            logger.log("You did not found the number");
        }
        logger.log(originalFormat);
    }
}
