package Assignments;

public class DebitCardPayment extends Payment {
    private static int counter = 1000;
    private double discountPercentage;
    

    public DebitCardPayment(int customerId){
        super(customerId); 
        counter++;
        setPaymentId("D"+String.valueOf(DebitCardPayment.counter));
          
    }
    public static int getCounter() {
        return counter;
    }
    public static void setCounter(int counter) {
        DebitCardPayment.counter = counter;
    }
    public double getDiscountPercentage() {
        return discountPercentage;
    }
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
        
    }
    @Override
    public double payBill(double amount){
        serviceTaxPercentage =0 ;        
        if(amount <=500){
            serviceTaxPercentage = 2.5f;
            discountPercentage = 1;
        }else if(amount>500 && amount <=1000){
            serviceTaxPercentage = 4f;
            discountPercentage = 2;
        }else if(amount >1000){
            serviceTaxPercentage = 5f;
            discountPercentage = 3;
        }
        double totalbill = (amount + amount*(serviceTaxPercentage/100)- amount*(discountPercentage/100));
        return totalbill;

    } 

}
