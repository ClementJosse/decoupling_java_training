package fr.lernejo.guessgame;
import fr.lernejo.logger.*;

import java.util.Scanner;

public class HumanPlayer implements Player{
    private Logger logger = LoggerFactory.getLogger("player");
    private Scanner scanner = new Scanner(System.in);

    @Override
    public long askNextGuess() {
        return scanner.nextLong();
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater){
            logger.log("Lower");
        }
        else{
            logger.log("Greater");
        }
    }
}