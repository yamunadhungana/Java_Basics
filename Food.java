package SwiftFood;

public class Food {
private String foodName;
private String cuisine;
private String foodType;
private int quantityAvailable;
private double unitPrice;


public String getFoodName() {
    return foodName;
}
public void setFoodName(String foodName) {
    this.foodName = foodName;
}
public String getCuisine() {
    return cuisine;
}
public void setCuisine(String cuisine) {
    this.cuisine = cuisine;
}
public String getFoodType() {
    return foodType;
}
public void setFoodType(String foodType) {
    this.foodType = foodType;
}
public int getQuantityAvailable() {
    return quantityAvailable;
}
public void setQuantityAvailable(int quantityAvailable) {
    this.quantityAvailable = quantityAvailable;
}
public double getUnitPrice() {
    return unitPrice;
}
public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
}
public void DisplayFoodDetails(){
    System.out.println("The name of the food is: "+ foodName);
    System.out.println("The name of the cuisine is: "+ cuisine);
    System.out.println("The name of the foodType is: "+ foodType);
    System.out.println("The quantityAvailable of food is: "+ quantityAvailable);
    System.out.println("The unitPrice for food is: "+ unitPrice);
    System.out.println();
}
public static void main(String[] args) {
    
    Food food = new Food();
    food.foodName = "Mo:Mo";
    food.cuisine = "Nepali";
    food.foodType = "Vegeterian";
    food.quantityAvailable = 3;
    food.unitPrice = 250;

    food.DisplayFoodDetails();
}

}
