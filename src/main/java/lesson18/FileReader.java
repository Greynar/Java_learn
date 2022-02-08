package lesson18;

import lombok.SneakyThrows;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.concurrent.atomic.AtomicInteger;

public class FileReader {

    private static final String FILE_LOCATION = "/homework18.txt";

    @SneakyThrows
    public static void main(String[] args) {
        System.out.println("Парсинг файла на строки:");
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(FileReader.class.getResourceAsStream(FILE_LOCATION), StandardCharsets.UTF_8))) {
            final String extension = FilenameUtils.getExtension(FILE_LOCATION);
            AtomicInteger fileIndex = new AtomicInteger();
            bufferedReader.lines().filter(StringUtils::isNotBlank).forEach(line -> writeToFile(extension, fileIndex, line));
        }
    }

    @SneakyThrows
    private static Path writeToFile(String extension, AtomicInteger fileIndex, String line) {
        Path path = Paths.get("E:\\Java", "string" + fileIndex.incrementAndGet() + "." + extension);
        System.out.println("Парсинг в файл " + path.getFileName());
        return Files.writeString(path, line, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    }
}
