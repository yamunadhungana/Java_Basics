package Exercises;

public class Customer {
    private String customerId;
    private String customerName;
    private long customerNumber;
    private Address address;

    Customer(){
    }

    Customer(String customerId, String customerName, long customerNumber,Address address){
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerNumber = customerNumber;
        this.address = address;
    }
    Customer(String customerName, long customerNumber,Address address){
        this.customerName = customerName;
        this.customerNumber = customerNumber;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public long getCustomerNumber() {
        return customerNumber;
    }
    public void setCustomerNumber(long customerNumber) {
        this.customerNumber = customerNumber;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public double payBill(double totalPrice){
        totalPrice = 0;
        int perunit = 30;
        int quantity = 3;
        totalPrice = perunit*quantity;
        return totalPrice;
    }
    public void displaycustomerDetails(){
        System.out.println("Customer Id: " + customerId);
		System.out.println("Customer Name: " + customerName);
        System.out.println("Customer contact number: " + customerNumber);
        System.out.println("Customer Address: " + address.getCity());
       // ,address.getStreet()+address.getCity()+address.getZipCode());
        //System.out.println("Total Price: " + totalPrice);
        

    }
    
}
