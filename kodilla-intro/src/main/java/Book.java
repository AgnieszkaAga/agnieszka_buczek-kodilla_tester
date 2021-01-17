public class Book {
     static String author;
     static String title;

    public static Book of(String author, String title) {
        Book myBook = new Book();
        myBook.author = author;
        myBook.title = title;
        return myBook;
    }
}

