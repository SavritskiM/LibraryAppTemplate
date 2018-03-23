
public class LibraryApp {
    private static Library library = new Library();

    public static void main(String[] args) {
    Book book1 = new Book();
    book1.title = "To kill a Mockingbird ";
    book1.author = "tom jeff";
    book1.pages =new String[] {"1", "2", "4", "5"};

    Book book2 = new Book();
    book2.title = "Jeff";
    book2.author = "Jeff jeff";
    book2.pages =new String[] {"1", "2", "4", "5"};
    library.addBook(book1);
    library.addBook(book2);

    
    }
}