package SwiftFood;

public class Restaurant {
    private String name;
    private long restaurantContact;
    private String restaurantAddress;
    private float rating;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRestaurantContact() {
        return restaurantContact;
    }

    public void setRestaurantContact(long restaurantContact) {
        this.restaurantContact = restaurantContact;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Restaurant(String name, long restaurantContact, String restaurantAddress, float rating){
        this.name= name;
        this.restaurantContact = restaurantContact;
        this.restaurantAddress = restaurantAddress;
        this.rating = rating;
               
        System.out.println("Restaurant Details \n ****************************");
        System.out.println("Restaruant Name: "+ name);
        System.out.println("Restaruant Contact: "+ restaurantContact);
        System.out.println("Rstaruant Address: "+ restaurantAddress);
        System.out.println("rating: "+ rating);
    }

    // public void displayRestaurantDisplay(){
    //     {
    //         System.out.println("Restaurant Details \n ****************************");
    //         System.out.println("Restaruant Name: "+ restaruantName);
    //         System.out.println("Restaruant Contact: "+ restaruantContact);
    //         System.out.println("eRstaruant Address: "+ restaruantAddress);
    //         System.out.println("rating: "+ rating);
    //     }
    // }



    public static void main(String[] args) {
        // Restaurant rest = new Restaurant();
        // rest.restaruantName = "McDonald's";
        // rest.rating = 4.1f;
        // rest.restaruantContact = 98753725653L;
        // rest.restaruantAddress = "Sh1109, Calorina Street, Springfield";
        // rest.displayRestaurantDisplay();

         new Restaurant("McDonals's",97484628762L, "D089. St.Louis Street, springfield", 4.1f);
    }

}
