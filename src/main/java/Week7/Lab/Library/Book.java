package Week7.Lab.Library;

import java.util.*;

record Book(String bookTitle,String author,int year,boolean status) {
}
class LibraryCatalog{
    private List<Book> books;

    public LibraryCatalog(){
        this.books=new ArrayList<>();
    }
    public List<Book> getBooks(){
        return this.books;
    }
    public Optional<Book> checkAvailability(String searchedBook){
        return books.stream()
                .filter(book -> book.bookTitle().equals(searchedBook))
                .filter(book -> book.status())
                .findFirst();
    }
    public Optional<Book> specificAuthor(String author){
        return books.stream()
                .filter(book -> book.author().equals(author) && book.status())
                .findFirst();
    }

    public void updateAvailability(String bookTitle,boolean status){
        books.stream()
                .filter(book->book.bookTitle().equals(bookTitle))
                .findFirst()
                .ifPresent(book -> {

                    books.set(books.indexOf(book),new Book(book.bookTitle(), book.author(), book.year(), status));

                });
    }

    public void addBook(Book book) {
        books.add(book);
    }
}

class Main{
    public static void main(String[] args) {
        LibraryCatalog libraryCatalog = new LibraryCatalog();

        libraryCatalog.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", 1951, true));
        libraryCatalog.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960, false));
        libraryCatalog.addBook(new Book("1984", "George Orwell", 1949, true));
        libraryCatalog.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, true));

        Optional<Book> bookByTitle = libraryCatalog.checkAvailability("1984");
        bookByTitle.ifPresentOrElse(
                book -> System.out.println("Book is available: " + book.bookTitle()),
                () -> System.out.println("Book not found.")
        );

        Optional<Book> availableBookByAuthor = libraryCatalog.specificAuthor("George Orwell");
        availableBookByAuthor.ifPresentOrElse(
                book -> System.out.println("Available book by George Orwell: " + book),
                () -> System.out.println("No available book by George Orwell.")
        );
        System.out.println();

        libraryCatalog.updateAvailability("The Great Gatsby", true);
        System.out.println("Availability status updated.");
        System.out.println();

        System.out.println("Updated Book List:");
        libraryCatalog.getBooks().forEach(System.out::println);

    }
}