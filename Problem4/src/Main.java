import java.util.Arrays;
import java.util.logging.*;
public class Main {
    private static final Logger LOGGER =
            Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        LOGGER.log(Level.FINE,"I'm logging: {0}", Arrays.toString(args));
        try{
            randomAlgo();
        }catch (IllegalStateException e){
            LOGGER.log(Level.SEVERE,"Exception caught",e);
            System.exit(2);
        }
        LOGGER.fine("Finished successfully");
    }
    private static void randomAlgo(){
        double randomNumber = Math.random();
        LOGGER.log(Level.FINE,"Generated random number: {0}", randomNumber);
        if (randomNumber < 0.5){
            throw new IllegalStateException("Invalid phase of the Moon");
        }
    }
    private static void configureLogging(){
        Logger allLogger = Logger.getLogger("org.stepic.java.logging.ClassA");
        allLogger.setLevel(Level.INFO);
        Logger warningLogger = Logger.getLogger("org.stepic.java.logging.ClassB");
        warningLogger.setLevel(Level.WARNING);
        Logger otherLogs = Logger.getLogger("org.stepic.java");
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new XMLFormatter());
        otherLogs.addHandler(handler);
        otherLogs.setUseParentHandlers(false);
    }
}