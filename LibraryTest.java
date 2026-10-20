public class LibraryTest {
    public static void main(String[] args) {
    
    //Creation of new Library object
    Library library = new Library("Library Name");
    
    //Creation of 3 new Book objects
    Book book = new Book("The Martian", "Andy Weir", "NO234");
    Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "GA478");
    Book book3 = new Book("Computer Science Illuminated", "John Lewis", "IA491");
    
    library.addBook(book);
    library.addBook(book2);
    library.addBook(book3);

    //Creation of 2 new Member objects
    Member member = new Member("Alice Johnson", "CA3746");
    Member member2 = new Member("John Miller", "TW1092");

    library.registerMember(member);
    library.registerMember(member2);
    
    //Displaying all books and members
    library.displayBooks();
    library.displayMembers();

    //TEST: Successfully borrow an available book
    boolean test = library.borrowBook("CA3746", "GA478");
    System.out.println("Result: " + test);

    //TEST: Attempting to borrow same book for different member
    boolean test2 = library.borrowBook("TW1092", "GA478");
    System.out.println("Result: " + test2);
    
    //TEST: Successfully return a borrowed book
    boolean test3 = library.returnBook("CA3746", "GA478");
    System.out.println("Result: " + test3);
    
    //TEST: Borrow the returned book again
    boolean test4 = library.borrowBook("Tw1092", "GA478");
    System.out.println("Result: " + test4);

    //TEST: Attempt to borrow a book using an invalid ISBN
    boolean test5 = library.returnBook("TW1092", "TE428");
    System.out.println("Result: " + test5);

    //TEST: Attempt an operation using an invalid membership ID
    boolean test6 = library.borrowBook("PR0921", "NO234");
    System.out.println("Result: " + test6);

    //Display the final book availability and member borrowing records
    library.displayBooks();
    library.displayMembers();

}//end of main method
}//end of public class
