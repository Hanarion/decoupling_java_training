package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name) {
        Logger log = new CompositeLogger(new ConsoleLogger(), new FileLogger("output.txt"));
        return log;
    }
}
