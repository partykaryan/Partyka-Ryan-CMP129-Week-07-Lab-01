public class Book {
    
 private String title;
 private String author;
 private String isbn;
 private boolean available;


//Constructor that receives the title, author, and ISBN
public Book(String title, String author, String isbn){
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.available = true;
}

//Getter Methods
public String getTitle(){
    return title;
}

public String getAuthor(){
    return author;
}

public String getIsbn(){
    return isbn;
}

public boolean isAvailable(){
    return available;
}

//Setter Methods
public void setTitle(String title){
    this.title = title;
}

public void setAuthor(String author){
    this.author = author;
}

public void setIsbn(String isbn){
    this.isbn = isbn;
}

public void setAvailable(boolean available){
    this.available = available;
}

//Display Info Method
public void displayInfo(){
    System.out.println("Title: '" + title + "', Author: " + author + ", ISBN: " + 
    isbn + ", Available: " + available);
}

}//end of public class
