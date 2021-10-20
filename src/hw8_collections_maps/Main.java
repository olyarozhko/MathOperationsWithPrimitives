package hw8_collections_maps;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.takeBook(LocalDate.parse("2018-05-05"), "Don Quixote");
        library.takeBook(LocalDate.parse("2019-10-29"), "The Great Gatsby");
        library.takeBook(LocalDate.parse("2021-01-17"), "The Adventures of Huckleberry Finn");
        library.takeBook(LocalDate.parse("2021-06-15"), "The Lord of the Rings");
        library.takeBook(LocalDate.parse("2017-12-09"), "Crime and Punishment");
        library.takeBook(LocalDate.parse("2017-04-25"), "Harry Potter");

        System.out.println(library);

        System.out.println("Search book: " + library.searchBookByDate("05-05-18"));
        System.out.println("Search book: " + library.searchBookByDate("06-05-18"));
        System.out.println("Book list: " + library.bookList());
        System.out.println("Date range: " + library.dateRange());

    }
}


class Library {
    private final Map<LocalDate, String> libraryReport;
    private final DateTimeFormatter format;

    Library() {
        this.libraryReport = new HashMap<>();
        this.format = DateTimeFormatter.ofPattern("dd-MM-yy");
    }

    Library(Map<LocalDate, String> libraryReport, String format) {
        this.libraryReport = libraryReport;
        this.format = DateTimeFormatter.ofPattern(format);
    }

    public void takeBook(LocalDate date, String bookName) {
        this.libraryReport.put(date, bookName);
    }

    public String searchBookByDate(String date) {
        if (this.libraryReport.get(LocalDate.parse(date, format)) == null) {
            return "There are no books for this date";
        } else return this.libraryReport.get(LocalDate.parse(date, format));
    }

    public Collection<String> bookList() {
        return libraryReport.values();
    }

    public LocalDate minDate() {
        return libraryReport.keySet().stream().min(LocalDate::compareTo).get();
    }

    public LocalDate maxDate() {
        return libraryReport.keySet().stream().max(LocalDate::compareTo).get();
    }

    public String dateRange() {
        return minDate() + " to " + maxDate();
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryReport=" + libraryReport +
                '}';
    }
}
