package SwiftFood.Association;

import SwiftFood.Food;

public class billAndOrderTester {
    public static void main(String[] args) {
        Food food1 = new Food();
            food1.setFoodName("Hamburger");
            food1.setFoodType("Non-Veg");
            food1.setCuisine("American");
            food1.setUnitPrice(3.8);
            food1.setQuantityAvailable(20);
            
            Food food2 = new Food();
            food2.setFoodName("Baked Apple Pie");
            food2.setFoodType("Veg");
            food2.setCuisine("American");
            food2.setUnitPrice(20);
            food2.setQuantityAvailable(25);
            
            Food orderedFoods[]= new Food[] {food1,food2};
            Oorder order = new Oorder(101, orderedFoods);
            OBill bill = new OBill("PayPal");
            bill.generateBill(order);
    }
}
