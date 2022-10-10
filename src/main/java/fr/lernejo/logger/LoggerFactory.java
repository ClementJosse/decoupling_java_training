package fr.lernejo.logger;

import java.io.File;

public class LoggerFactory {
    public static Logger getLogger(String name){
        return new ContextualLogger(name,new FileLogger("log.txt"));

    }
}
