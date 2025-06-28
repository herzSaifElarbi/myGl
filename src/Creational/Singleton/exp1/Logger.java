package Creational.Singleton.exp1;

public class Logger {
    private static Logger logger;
    private Logger(){
        System.out.println("Logger created!");
    }
    public static Logger getLogger(){
        if(logger == null){
            logger = new Logger();
            return logger;
        }
        System.out.println("Already created!");
        return logger;
    }
    public void log(String log){
        System.out.println("logs: "+log);
    }
}
