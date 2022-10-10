package fr.lernejo.guessgame;
import fr.lernejo.logger.*;

public class ComputerPlayer implements Player{
    private Logger logger = LoggerFactory.getLogger("ComputerPlayer");
    private long min;
    private long max;

    public ComputerPlayer(){
        min=Long.MIN_VALUE;
        max=Long.MAX_VALUE;
    }

    @Override
    public long askNextGuess() {
        logger.log(String.valueOf((this.min+this.max)/2));
        return (this.min+this.max)/2;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater){
            //logger.log("lower");
            this.max=(this.min+this.max)/2;
        }
        else {
            //logger.log("greater");
            this.min=(this.min+this.max)/2;
        }
    }
}
