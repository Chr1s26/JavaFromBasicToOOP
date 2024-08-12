
import java.lang.reflect.*;
import java.util.concurrent.*;
import java.util.*;
import java.time.*;

class MetaSingleton {
    private static MetaSingleton instance;

    private MetaSingleton() {}

    public static MetaSingleton getInstance() {
        if (instance == null) {
            instance = new MetaSingleton();
        }
        return instance;
    }
}

class Logger {
    private List<String> log = new ArrayList<>();

    private Logger() {}

    private static class LoggerHolder {
        private static final Logger INSTANCE = new Logger();
    }

    public static Logger getInstance() {
        return LoggerHolder.INSTANCE;
    }

    public void logMessage(String message) {
        String timestamp = LocalDateTime.now().toString();
        log.add(timestamp + " - " + message);
    }

    public void showLog() {
        log.forEach(System.out::println);
    }
}

class Worker implements Callable<String> {
    private int id;

    public Worker(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        Logger logger = Logger.getInstance();
        logger.logMessage("Worker " + id + " started.");
        Thread.sleep(new Random().nextInt(2000));
        logger.logMessage("Worker " + id + " finished.");
        return "Worker " + id + " result";
    }
}

public class api {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        List<Future<String>> futures = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            futures.add(executor.submit(new Worker(i)));
        }

        for (Future<String> future : futures) {
            System.out.println(future.get());
        }

        executor.shutdown();

        Logger logger = Logger.getInstance();
        logger.showLog();
    }
}
