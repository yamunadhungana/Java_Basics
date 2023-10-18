package Exercises;

public class CustomerAddressTester {
    public static void main(String[] args) {
        Address address = new Address("619", "130 S front street", "Memphis", 38103);
        Customer customer =  new Customer("Serene", 6745728346L, address);
        customer.displaycustomerDetails();
    }
}
