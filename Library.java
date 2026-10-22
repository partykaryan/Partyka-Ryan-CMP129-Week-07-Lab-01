import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books;
    private ArrayList<Member> members;

//Library Constructor 
public Library(String name){
    this.name = name;
    this.books = new ArrayList<Book>();
    this.members = new ArrayList<Member>();
}

//Method for adding a book
public void addBook(Book book){
    books.add(book);
}

//Method for registering a member
public void registerMember(Member member){
    members.add(member);
}

//Return methods
public Book findBookByIsbn(String isbn){
    for (Book b : books){
        if (b.getIsbn().equals(isbn)){
            return b;
        }
    }
return null;
}

public Member findMemberById(String membershipId){
 
    for (Member m : members){
    if(m.getmembershipId().equals(membershipId)){
        return m;
    }
} 
return null;
}

public boolean borrowBook(String membershipId, String isbn){
    Member member = findMemberById(membershipId);
    Book book = findBookByIsbn(isbn);

    if (member != null && book != null){
        return member.borrowBook(book);
    }

    return false;
}

public boolean returnBook(String membershipId, String isbn){
    Member member = findMemberById(membershipId);
    Book book = findBookByIsbn(isbn);

    if(member!= null && book != null){
        return member.returnBook(book);
    }
    
    return false;
}

//Method for displaying books
public void displayBooks(){
    System.out.println();
    System.out.println("---------------------------" + name + " BOOK INFORMATION---------------------------------");
    for (Book b : books){
        b.displayInfo();
    }
}

//Method for displaying Members
public void displayMembers(){
    System.out.println();
    for (Member m : members){
        m.displayInfo();
    }
}

}//end of public class
