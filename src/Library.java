/**
 * Library class
 */
public class Library {
	String name;
	Address location;
	Book[]books;
	Member[]members;

	/**
	 * addBook(Book) : void
	 * Creates a new array which is a copy of this.books, but, whose length is
	 * this.books.length + 1, to be able to add the new book.
	 *
	 * this.books is then replaced by the new array.
	 *
	 * @param book
	 *          A new book object to add to the books list
	 */
	public void addBook(Book e){
		Book[]newBook=new Book[books.length+1];
		for(int i=0;i<books.length;i++){
			newBook[i]=books[i];
		}
		newBook[books.length]=e;
		this.books=newBook;
	}

	/**
	 * addMember(Member) : void
	 * Creates a new array which is a copy of this.members, but, whose length is
	 * this.members.length + 1, to be able to add the new member.
	 *
	 * this.members is then replaced by the new array.
	 *
	 * @param member
	 *          A new member object to add to the members list
	 */
	public void addMember(Member e){
		Member[]newMember=new Member[members.length+1];
		for(int i=0;i<members.length;i++){
			newMember[i]=members[i];
		}
		newMember[members.length]=e;
		this.members=newMember;
	}
}
