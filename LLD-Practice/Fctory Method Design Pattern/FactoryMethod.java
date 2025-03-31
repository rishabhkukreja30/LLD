interface ILogger {
    void log();
}

class DebugLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("DEBUG Logger");
    }
}

class InfoLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("INFO Logger");
    }
}

class ErrorLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("ERROR Logger");
    }
}

interface LoggerFactory {
    ILogger createLogger();
}

class DebugLoggerFactory implements LoggerFactory {
    @Override
    public ILogger createLogger() {
        return new DebugLogger();
    }
}

class InfoLoggerFactory implements LoggerFactory {
    @Override
    public ILogger createLogger() {
        return new InfoLogger();
    }
}

class ErrorLoggerFactory implements LoggerFactory {
    @Override
    public ILogger createLogger() {
        return new ErrorLogger();
    }
}


public class FactoryMethod {

    public static void main(String[] args) {
     
        LoggerFactory debubLoggerFactory = new DebugLoggerFactory();
        LoggerFactory infolLoggerFactory = new InfoLoggerFactory();
        LoggerFactory errorLoggerFactory = new ErrorLoggerFactory();
    
        ILogger debugLogger = debubLoggerFactory.createLogger();
        ILogger infoLogger = infolLoggerFactory.createLogger();
        ILogger errorLogger = errorLoggerFactory.createLogger();
    
        debugLogger.log();
        infoLogger.log();
        errorLogger.log();
    }
 
}
