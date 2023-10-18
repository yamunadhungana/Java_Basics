package Exercises;
public class AddressDetails {
    public static void main(String[] args) throws Exception {
       System.out.println("My Name is Yamuna Dhungana.\nMy Designation is Java Developer");
       System.out.print("Door No: D089 \nStreet: St. Louis Street \nCity: Springfield \nZipCode: 62729 \n");
       int discount = 10;
       double totalPrice = 200;
       double priceAfterDiscount = totalPrice *(1-((double)discount/100));
       System.out.println("Customer has paid a bill of "+  priceAfterDiscount);
    }
}
