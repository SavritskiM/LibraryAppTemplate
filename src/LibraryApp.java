public class LibraryApp {
	private static Library library = new Library();

	public static void main(String[] args) {
		
		// Print Members
		library.members=new Member[0];
		Address address1=new Address();
		address1.city="Thornhill";
		address1.postalCode="123456";
		address1.province="ON";
		address1.street="Leslie";
		Member member1=new Member();
		member1.name="Leon";
		member1.address=address1;
		member1.birthyear=2001;
		library.addMember(member1);
		for(int i=0;i<library.members.length;i++){
			System.out.println(library.members[i].name);
		}
		
		// Print Books
		library.books = new Book[0];
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
		for(int i=0;i<library.books.length;i++){
			System.out.println(library.books[i].title);
		}
		
		// Print Address
		Address location=new Address();
		location.city="Thornhill";
		location.postalCode="123456";
		location.province="ON";
		location.street="Leslie";
		library.location=location;
		System.out.println(library.location.toString());


	}
}
