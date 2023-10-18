package Assignments;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int quantity;

    Book(String name,Author author,double price,int quantity){
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayAuthorDetails(){
        System.out.println("Displaying author Details\n**********************");
        System.out.println("Author Name: "+ author.getName());
        System.out.println("Author email: " + author.getEmailId());
        System.out.print("Author gender: "+ author.getGender());

    }


}
