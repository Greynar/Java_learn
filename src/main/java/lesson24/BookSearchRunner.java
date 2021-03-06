package lesson24;

import lesson24.dto.AuthorAndBook;
import lesson24.jdbc.BookDb;

import java.util.List;
import java.util.Scanner;

public class BookSearchRunner {

    private static final String EXIT_PHRASE = "выход";

    public static void main(String[] args) {
        System.out.println("Введите наименование искомой книги или имя автора");
        System.out.printf("или введите %s для завершения работы программы:\n", EXIT_PHRASE);
        final Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            final String text = scanner.nextLine();
            if (EXIT_PHRASE.equalsIgnoreCase(text)){
                return;
            }
            final List<AuthorAndBook> authorAndBooks = BookDb.searchByTitleOrAuthorName(text);
            System.out.println("Подходящие книги с информацией об авторе:");
            for (AuthorAndBook book: authorAndBooks) {
                System.out.println(book);
            }
        }
    }
}