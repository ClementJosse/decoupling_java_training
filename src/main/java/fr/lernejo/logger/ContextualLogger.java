package fr.lernejo.logger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContextualLogger implements Logger{
    DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    String callerClass;
    @Override
    public void log(String message) {
        //A compléter
        delegateLogger= new Logger;
        delegateLogger.log(LocalDateTime.now().format(formatter) + " " + callerClass + " " + message);
    }
    public ContextualLogger(String callerClass,Logger logger){
        this.callerClass=callerClass;
    }

}
