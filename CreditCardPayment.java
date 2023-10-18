package Assignments;

public class CreditCardPayment extends Payment {
    private static int counter=1000 ;   

    public static int getCounter() {
        return counter;
    }
    public static void setCounter(int counter) {
        CreditCardPayment.counter = counter;
    }
    CreditCardPayment(int customerId){
    super(customerId); 
    //counter =1000;
    counter++;  
    setPaymentId("C"+String.valueOf(CreditCardPayment.counter));
         
    }

    @Override
    public double payBill(double amount){
        serviceTaxPercentage =0 ;        
        if(amount <=500){
            serviceTaxPercentage = 3f;
            
        }else if(amount>500 && amount <=1000){
            serviceTaxPercentage = 5f;
            
        }else if(amount >1000){
            serviceTaxPercentage = 6f;
            
        }
        double totalbill = (amount + amount*(serviceTaxPercentage/100));
        return totalbill;

    } 
}
