package lists;
import java.util.List;
public class ListsEx04 {
    public static void main(String[] args) {
        var books = List.of(
                new Book("Death on the Nile", "Agatha Christie", "Detective"),
                new Book("Murder on the Orient Express", "Agatha Christie", "Detective"),
                new Book("The Raven", "Edgar Allan Poe", "Poem")
                );

        countBooks(books, "Agatha Christie", "Detective"); // 2
    }

    public static void countBooks(List<Book> books, String author, String genre) {
        var count = 0;
        for (var book : books) {
            if (book.getAuthorName() == author && book.getGenre() == genre) {
                count++;
            }
        }
        System.out.println(count);;
    }
}

final class Book {

    private String title;
    private String authorName;
    private String genre;

    public Book(String title, String authorName, String genre) {
        this.title = title;
        this.authorName = authorName;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getGenre() {
        return genre;
    }
}

