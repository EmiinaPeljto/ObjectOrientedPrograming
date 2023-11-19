package Week7.Lab.Logger;

interface Logger{
    void logMessage(String message);
}
record RecordLogger(String loggerName) implements Logger{
    @Override
    public void logMessage(String message){
        System.out.println(message+": "+this.loggerName);
    }
}

class ClassLogger implements Logger{
    private String loggerName;
    public ClassLogger(String loggerName){
        this.loggerName=loggerName;
    }

    public String getLoggerName(){
        return this.loggerName;
    }

    public void logMessage(String message){
        System.out.println( message+": "+this.loggerName);
    }
}
class Main {
    public static void main(String[] args) {
        RecordLogger rl=new RecordLogger("Emina");
        ClassLogger cl=new ClassLogger("Emina2");
        Logger loggerInterface=(String message)-> System.out.println(message+": "+rl.loggerName());
        Logger loggerInterface2=(String message)-> System.out.println(message+": "+cl.getLoggerName());
        loggerInterface.logMessage("Emina, you are successfully logged in. ");
        loggerInterface2.logMessage("Emina2, you are successfully logged in");
    }
}
