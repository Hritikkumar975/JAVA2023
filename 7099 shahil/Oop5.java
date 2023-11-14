 class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

public class Oop5 {
    private Book[] books;
    private int numBooks;

    public Oop5(int capacity) {
        books = new Book[capacity];
        numBooks = 0;
    }

    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            numBooks++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void removeBook(Book book) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].equals(book)) {
                for (int j = i; j < numBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
                numBooks--;
                break;
            }
        }
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (int i = 0; i < numBooks; i++) {
            System.out.println(books[i].getTitle() + " by " + books[i].getAuthor() + " (ISBN: " + books[i].getIsbn() + ")");
        }
    }

    public static void main(String[] args) {
        Oop5 library = new Oop5(5);

        Book book1 = new Book("Pride and Prejudice", "Jane Austen", "9780141439518");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");

        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();

        library.removeBook(book2);
        System.out.println("\nBooks in the library after removing " + book2.getTitle() + ":");
        library.displayBooks();
    }
}
