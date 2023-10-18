package SwiftFood.Association;

import SwiftFood.Food;

public class Oorder {
    private int orderId;
    private Food[] orderedFood;
    private double totalPrice;
    private String status; 

    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public Food[] getOrderedFood() {
        return orderedFood;
    }
    public void setOrderedFood(Food[] orderedFood) {
        this.orderedFood = orderedFood;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Oorder(){
    }
    public Oorder(int orderId, Food[] orderFoods){
        this.orderId = orderId;

    }
    // public double calculateTotalPrice(int unitPrice) {
    //     this.totalPrice = 0;
    //     for(Food f:this.orderedFood){
    //         this.totalPrice +=f.getUnitPrice();
    //     }
    //    return totalPrice;
    //    }
    public double calculateTotalPrice(String paymentMode) {
        this.totalPrice = 0;
        for(Food f:this.orderedFood){
            this.totalPrice +=f.getUnitPrice();
        }
        return totalPrice;
            
    }
    }
