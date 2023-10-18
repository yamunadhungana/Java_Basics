package SwiftFood.Association;

import SwiftFood.Food;

public class OBill {
    private String billId;
    private String paymentMode;
    private static int counter;
    static {
        counter= 9001;
    } 
    
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        OBill.counter = counter;
    }

    public OBill(String paymentMode){
        this.paymentMode = paymentMode;
        this.billId = "B" + String.valueOf(counter);
        counter ++;
    }
    
    public boolean generateBill(Oorder oorder){
        System.out.println("Bill details \n ******************");
        System.out.println("Bill Id: "+ this.getBillId());
        System.out.println("Items Ordered: ");
        for(Food food: oorder.getOrderedFood()){
            System.out.println(food.getFoodName());
        }
        double payableAmount = calculateTotalPrice(this.getPaymentMode());
        System.out.println("Payable Amount: $"+ (int)(payableAmount*100)/100.0);
        return true;
        

    }

    private double calculateTotalPrice(String paymentMode2) {
        return 0;
    }
}
