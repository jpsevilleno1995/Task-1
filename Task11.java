class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price; // Fixed: Added space between private and double

    // Constructor to initialize all attributes
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    // Custom toString() method matching the example output format
    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: $" + price;
    }
}

public class Task11 {
    public static void main(String[] args) {
        // Instantiate three Book objects with different values
        Book book1 = new Book("Java Programming", "John Smith", 2021, 30.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 20.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 40.99);

        // Print out the details of each book using toString()
        System.out.println("Book 1:");
        System.out.println(book1);
        System.out.println(); // Blank line for spacing

        System.out.println("Book 2:");
        System.out.println(book2);
        System.out.println(); // Blank line for spacing

        System.out.println("Book 3:");
        System.out.println(book3);
    }
}