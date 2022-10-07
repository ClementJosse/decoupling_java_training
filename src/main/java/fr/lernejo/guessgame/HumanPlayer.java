package fr.lernejo.guessgame;
import fr.lernejo.logger.*;

import java.util.Scanner;

public class HumanPlayer implements Player{
    private Logger logger = LoggerFactory.getLogger("HumanPlayer");
    private Scanner scanner = new Scanner(System.in);

    @Override
    public long askNextGuess() {
        return scanner.nextLong();
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater){
            logger.log("lower");
        }
        else{
            logger.log("greater");
        }
    }
}