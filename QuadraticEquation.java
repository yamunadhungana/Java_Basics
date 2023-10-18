package Assignments;

public class QuadraticEquation {
    public static void main(String[] args) {
    int a = 1;
    int b = 4;
    int c = 6;
   // int degree = 2;
   double root;

    double descri = (b*b -(4*a*c));
        if (descri == 0)
        {
            root =((-b + descri)/2*a);
            System.out.println(root);
            
        
        } else if (descri > 0)
        {
             root =  ((-b + descri)/2*a);
             System.out.println(root);
             root = ((-b - descri)/2*a);         
            System.out.println(root);

        }else { System.out.println("The equation has no real roots");
        }
    }
    
}

