package lesson16;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@RequiredArgsConstructor
public class Logger implements Runnable{

    private static final String FORMAT_TEXT = "%s %s %s %s";
    private static final DateTimeFormatter DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");


    private final LogLevel level;
    private final String fileName;
    private final long currentTimeMil = System.currentTimeMillis();
    private int counter = 1;

    @Override
    public void run(){
        System.out.println("Поток " + Thread.currentThread().getName() + " начал свою работу");
        while (System.currentTimeMillis() <= currentTimeMil + 60 * 1000) {
            try(FileWriter fw = new FileWriter(fileName, true)) {
                fw.write(generatedString());
                Thread.sleep(new Random().nextInt(5000));
            } catch (IOException | InterruptedException exception) {
                exception.printStackTrace();
                break;
            }
        }
    }

    private String generatedString() {
        LocalDateTime now = LocalDateTime.now();
        return String.format(FORMAT_TEXT, DATE_TIME_FORMAT.format(now), level, Thread.currentThread().getName(), "Запись добавлена автоматически, log #" + counter++ + "\n");
    }

    @SneakyThrows
    public static void startAndJoin(Thread thread) {
        thread.start();
        thread.join();
    }
}
