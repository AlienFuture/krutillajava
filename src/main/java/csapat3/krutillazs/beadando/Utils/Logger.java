package csapat3.krutillazs.beadando.Utils;

import java.io.File;

import csapat3.krutillazs.beadando.Enums.LogType;

public class Logger {
    private static Logger instance = null;
    private static final String LOG_FILE_NAME = "logs/log.txt";
    private Logger() {

    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public static void log(String message, LogType logType) {
        File logFolder = new File("logs");
        if (!logFolder.exists()) {
            logFolder.mkdir();
        }

        File file = new File(LOG_FILE_NAME);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                System.out.println("Error while creating log file");
            }
        }

        try {
            String currentDate = java.time.LocalDate.now().toString();
            java.io.FileWriter fileWriter = new java.io.FileWriter(file, true);
            fileWriter.write("[" + currentDate + "] " + logType.toString() + ": " + message + "\n");
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Error while writing to log file");
        }
    }
}
