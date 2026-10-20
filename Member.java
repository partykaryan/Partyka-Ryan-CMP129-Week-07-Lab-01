import java.util.ArrayList;

public class Member {
    
     private String name;
     private String membershipId;
     private ArrayList<Book> borrowedBooks;

     public Member(String name, String membershipId){
        this.name = name;
        this.membershipId = membershipId;
        this.borrowedBooks = new ArrayList<Book>();
     }
    
     //Getter Methods
     public String getName(){
        return name;
     }

     public String getmembershipId(){
        return membershipId;
     }

     public ArrayList<Book> getBorrowedBooks(){
        return borrowedBooks;
     }

     //Setter Methods
     public void setName(String name){
        this.name = name;
     }

     public void setMembershipId(String membershipId){
        this.membershipId = membershipId;
     }

public boolean borrowBook(Book book){
   if (book.isAvailable()){
      borrowedBooks.add(book);
      book.setAvailable(false);
      return true;
   }
   return false;
}

public boolean returnBook(Book book){
   if (borrowedBooks.contains(book)){
      borrowedBooks.remove(book);
      book.setAvailable(true);
      return true;
}
   return false;
}

public void displayInfo(){
   System.out.println();
   System.out.println(); 
}



   }//end of public class
