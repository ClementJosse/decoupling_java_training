package fr.lernejo.logger;

import java.io.Console;
import java.io.File;

public class LoggerFactory {
    public static Logger getLogger(String name){
        //return new CompositeLogger(new ContextualLogger(name,new ConsoleLogger()),new FilteredLogger(new ContextualLogger(name,new FileLogger("log.txt")),message -> !message.contains("simulation")));
        return new CompositeLogger(new ContextualLogger(name, new ConsoleLogger()), new ContextualLogger(name, new FilteredLogger(new FileLogger("log.log"), message -> message.contains("simulation"))));
    }
}
