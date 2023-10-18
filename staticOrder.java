package Assignments;

import SwiftFood.Food;

public class staticOrder {
    private static int orderIdCounter;
    private int orderId;
    private Food[] orderedFoods;
    private double totalPrice;
    private String Status;
    static{
        orderIdCounter = 101;
    }

    public static int getOrderIdCounter() {
        return orderIdCounter;
    }
    public static void setOrderIdCounter(int orderIdCounter) {
        staticOrder.orderIdCounter = orderIdCounter;
    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public Food[] getOrderedFoods() {
        return orderedFoods;
    }
    public void setOrderedFoods(Food[] orderedFoods) {
        this.orderedFoods = orderedFoods;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
    public staticOrder(){}
    public staticOrder(Food[] orderFoods){
        this.orderedFoods= orderFoods;
    }
    public double calculateTotalPrice(String paymentMode) {
        this.totalPrice = 0;
        for(Food f:this.orderedFoods){
            this.totalPrice +=f.getUnitPrice();
        }
        return totalPrice;
            
    }

    
    
}
