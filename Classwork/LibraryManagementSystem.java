package Classwork;

public class LibraryManagementSystem {

    // Book entity (SRP)
    static class Book {
        private String title;
        private boolean issued;

        public Book(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public boolean isIssued() {
            return issued;
        }

        public void setIssued(boolean issued) {
            this.issued = issued;
        }
    }

    // repository class (SRP)
    static class BookRepository {
        private Book[] books = new Book[10];
        private int count = 0;

        public void addBook(Book book) {
            books[count++] = book;
        }

        public Book findBookByTitle(String title) {
            for (int i = 0; i < count; i++) {
                if (books[i].getTitle().equalsIgnoreCase(title)) {
                    return books[i];
                }
            }
            return null;
        }
    }

    // OCP + LSP

    interface Notification {
        void send(String message);
    }

    static class EmailNotification implements Notification {
        @Override
        public void send(String message) {
            System.out.println("Email: " + message);
        }
    }

    static class SMSNotification implements Notification {
        @Override
        public void send(String message) {
            System.out.println("SMS: " + message);
        }
    }

    // ISP

    interface Searchable {
        Book search (String title);
    }

    interface Borrowable {
        void issue(Book book);
        void returnBook(Book book);
    }

    // DIP
    static class LibraryService implements Searchable, Borrowable {
        private BookRepository repository;
        private Notification notification;

        public LibraryService(BookRepository repository, Notification notification) {
            this.repository = repository;
            this.notification = notification;
        }

        @Override
        public Book search(String title) {
            return repository.findBookByTitle(title);
        }

        @Override
        public void issue(Book book) {
            if (book != null && !book.isIssued()) {
                book.setIssued(true);
                notification.send(book.getTitle() + " issued successfully.");
            }
        }

        @Override
        public void returnBook(Book book) {
            if (book != null && book.isIssued()) {
                book.setIssued(false);
                notification.send(book.getTitle() + " returned successfully.");
            }
        }
    }

        // Main Method

        public static void main(String[] args) {

            BookRepository repository = new BookRepository();

            repository.addBook(new Book("Java Programming"));
            repository.addBook(new Book("Python Basics"));

            Notification notification = new EmailNotification();

            LibraryService service = new LibraryService(repository, notification);

            Book book = service.search("Java Programming");

            service.issue(book);
            service.returnBook(book);
        }

}