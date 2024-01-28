
public class Main {
    public static void main(String[] args) {
        LogProcessor logObject = new DebugLogProcessor(new ErrorLogProcessor(new InfoLogProcessor(null)));
        logObject.log(LogProcessor.ERROR, "exception happens");
        logObject.log(LogProcessor.DEBUG, "need to debug this");
        logObject.log(LogProcessor.INFO, "just for info");
    }
}