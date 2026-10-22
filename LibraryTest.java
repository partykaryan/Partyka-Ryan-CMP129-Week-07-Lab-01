public class LibraryTest {
    public static void main(String[] args) {
    
    //Creation of new Library object
    Library library = new Library("CCM LIBRARY");
    
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
    System.out.println();
    System.out.print("--------REGISTERED CCM LIBRARY MEMBERS--------");
    library.displayMembers();
    
    System.out.println("----------------TEST RESULTS ==> TRUE = PASS, FALSE = FAIL----------------------");
    //TEST: Successfully borrow an available book
    boolean test = library.borrowBook("CA3746", "GA478");
    System.out.print("TEST 1 SUCCESSFULLY Borrowing a Book ==> ");
    System.out.println("Result: " + test);

    //TEST: Attempting to borrow same book for different member
    boolean test2 = library.borrowBook("TW1092", "GA478");
    System.out.print("TEST 2 UNSUCCESSFULLY Borrowing Same Book for Different Member ==> ");
    System.out.println("Result: " + test2);
    
    //TEST: Successfully return a borrowed book
    boolean test3 = library.returnBook("CA3746", "GA478");
    System.out.print("TEST 3 SUCCESSFULLY Returning a Borrowed Book ==> ");
    System.out.println("Result: " + test3);
    
    //TEST: Borrow the returned book again
    boolean test4 = library.borrowBook("TW1092", "GA478");
    System.out.print("TEST 4 SUCCESSFULLY Borrowing the Returned Book Again ==> ");
    System.out.println("Result: " + test4);

    //TEST: Attempt to borrow a book using an invalid ISBN
    boolean test5 = library.returnBook("TW1092", "TE428");
    System.out.print("TEST 5 UNSUCCESSFULLY Borrowing Book with Invalid ISBN ==> ");
    System.out.println("Result: " + test5);

    //TEST: Attempt an operation using an invalid membership ID
    boolean test6 = library.borrowBook("PR0921", "NO234");
    System.out.print("TEST 6 UNSUCCESSFULLY Borrowing Book with Invalid Membership ID ==> ");
    System.out.println("Result: " + test6);

    //Display the final book availability and member borrowing records
    library.displayBooks();
    System.out.println();
    System.out.print("--------------------------REGISTERED CCM LIBRARY MEMBERS---------------------------");
    library.displayMembers();

}//end of main method
}//end of public class
