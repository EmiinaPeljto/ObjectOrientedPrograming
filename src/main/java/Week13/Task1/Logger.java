package Week13.Task1;

class Logger {
    private static Logger instance;

    private Logger(){}

    public static Logger getInstance(){
        synchronized (Logger.class){
            if (instance==null){
                instance=new Logger();
            }
        }
        return instance;
    }

    public void log(String message){
        System.out.println("LOG: "+message);
    }
    public void logInfo(String message){
        System.out.println("INFO: "+ message);
    }
    public void logWarning(String message){
        System.out.println("WARNING: "+message);
    }
    public void logError(String message){
        System.out.println("ERROR: "+message);
    }
}

class Main{
    public static void main(String[] args) {
        Logger logger=Logger.getInstance();

        logger.log("Application started");
        logger.logInfo("This is an informational message");
        logger.logWarning("Warning: Something might be going wrong");
        logger.logError("Error: Something went terribly wrong");


        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("Another log entry");

        System.out.println("logger == anotherLogger: " + (logger == anotherLogger));
    }
}

