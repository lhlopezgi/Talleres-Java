package C24B5;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogginJava {


    private static final Logger log = Logger.getLogger(LogginJava.class.getName());

    public static void main(String[] args) {

        log.setLevel(Level.ALL);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        log.addHandler(consoleHandler);

        log.severe("severo");
        log.warning("warning");
        log.info("info");
        log.fine("fine");

    }


    }

