package fr.lernejo.guessgame;
import fr.lernejo.logger.*;

public class ComputerPlayer implements Player{
    private Logger logger = LoggerFactory.getLogger("ComputerPlayer");
    private long min;
    private long max;

    public ComputerPlayer(){
        min=0;
        max=100;
    }

    @Override
    public long askNextGuess() {
        return (this.min+this.max)/2;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater){
            logger.log("lower");
            this.max=(this.min+this.max)/2;
        }
        else {
            logger.log("greater");
            this.min=(this.min+this.max)/2;
        }
    }
}
