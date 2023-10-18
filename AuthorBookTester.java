package Assignments;

public class AuthorBookTester {
    public static void main(String[] args) {
        Author author1 = new Author("Joshua", "joshua@email.com",'M'); 
        Book book1 = new Book("Effective Java", author1,45,15);
        book1.displayAuthorDetails();
        
    }
}
