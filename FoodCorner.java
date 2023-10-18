package Assignments;

public class FoodCorner {
    public static void main(String[] args) {
    String food = "NonVeg";
    int dist = 3;
    int qty =2;
    int charge = 0;    
    switch (food) {
         case "Veg":
        if (dist <=3 && dist >=1)
           {charge = 12*qty;
            System.out.println("The total charge is " + charge);}
            else if(dist>3 && dist <=6)
            {charge = (12*qty*1*dist);
                System.out.println("The total charge is " + charge);}
            else{charge = (12*qty*2*dist);
                System.out.println("The total charge is " + charge);}
            
            break;
            case "NonVeg":
            if (dist <=3 && dist >=1)
           {charge = 15*qty;
            System.out.println("The total charge is " + charge);}
            else if(dist>3 && dist <=6)
            {charge = (15*qty*1*dist);
                System.out.println("The total charge is " + charge);}
            else{charge = (15*qty*2*dist);
                System.out.println("The total charge is " + charge);}
            
            break;
    }
    }
}

    
    
