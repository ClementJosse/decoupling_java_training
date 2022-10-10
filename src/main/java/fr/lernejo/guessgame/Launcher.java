package fr.lernejo.guessgame;
import java.security.SecureRandom;

public class Launcher {
    public static void main(String args[]){

        SecureRandom random = new SecureRandom();
        // long randomNumber = random.nextLong(); // génère un nombre entre Long.MIN_VALUE et Long.MAX_VALUE
        long randomNumber = random.nextInt(100); // génère un nombre entre 0 (inclus) et 100 (exclus)

        if(args[0].equals("-interactive")){
            HumanPlayer humanPlayer = new HumanPlayer();
            Simulation simulation=new Simulation(humanPlayer);
            simulation.initialize(randomNumber);
            simulation.loopUntilPlayerSucceed(Long.MAX_VALUE);
        }
        else if(args[0].equals("-auto")){
            ComputerPlayer computerPlayer = new ComputerPlayer();
            Simulation simulation=new Simulation(computerPlayer);
            simulation.initialize(Long.parseLong(args[1]));
            simulation.loopUntilPlayerSucceed(1000);
        }
        else{
                System.out.println("The program needs a parameter (-auto or -interactive).");
        }

    }
}
