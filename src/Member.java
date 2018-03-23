/**
 * Member class
 */
public class Member {

    String name;
    int birthyear;
    Address address = new Address();
    

    /**
     * getAge() : int
     * Instance method to calculate the member's age.
     * @return
     *          returns the member's age as an int.
     */
    private int getAge(){
     int age;
     age = 2018 - birthyear;
     return age;
    }




    /**
     * readBook(Book) : void
     * Will "read" a book give to the member.
     * "Reading" consists of printing out any appropriate message
     * containing the title of the book.
     *
     * @param book
     *          The book to read.
     */
    private void int readBook(book){
     System.out.println("you are reading: " + book.title);
        
    }



}
