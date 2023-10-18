package SwiftFood;

public class ordered {
   private int orderId;
   private String orderedFood;
   private double totalPrice;
   private String Status;

   public int getOrderId() {
   return orderId;
}
public void setOrderId(int orderId) {
    this.orderId = orderId;
}
public String getOrderedFood() {
    return orderedFood;
}
public void setOrderedFood(String orderedFood) {
    this.orderedFood = orderedFood;
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

    public ordered (){
        Status = "Ordered";
        System.out.println("Status of order 1: "+ Status);
        System.out.println("Status of order 2: "+ Status);
    }

    public ordered(int orderId, String orderedFoods, String Status){
        this.orderId = orderId;
        this.orderedFood = orderedFoods;
        this.Status = Status;
        System.out.println("Order Id: "+ orderId);
        System.out.println("Ordered Food: "+ orderedFood);
        System.out.println("Ordered Status: "+ Status);
    }

    

       public double calculateTotalPrice(int unitPrice) {
        totalPrice = (unitPrice)*(1-0.05);
        return totalPrice;
       }

        // public void displayOrderDetails()
        // {
        //     System.out.println("----------------Order Details----------------");
        //     System.out.println("Order Id: "+ orderId);
        //     System.out.println("Ordered Food: "+ orderedFood);
        //     System.out.println("Ordered Status: "+ Status);
        //     System.out.println("Total Price: "+ totalPrice);
        // }
    
    

public static void main(String[] args) {
    // ordered or = new ordered();
    // or.orderId = 101;
    // or.orderedFood = " Spinach Alfrado Pasta";
    // or.Status = "ordered";
    // or.calculateTotalPrice(37);
    // or.displayOrderDetails();
    new ordered();
    new ordered(101, "Garlic Sharmp", "Ordered");

}
}
