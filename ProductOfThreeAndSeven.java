package Assignments;

public class ProductOfThreeAndSeven {
    public static void main(String[] args) {
        
        int a = 2;
        int b = 6;
        int c = 7;
        if (a !=7 &&b!=7 && c!=7)
        {
            int m = (a*b*c);
            System.out.println("The multiple of numbers " + m);

        }
        else
        {
            if(a==7)
            {
                System.out.println(b*c);
            }
            else if(b==7)
            {
                System.out.println(c);
            }
            else
            {
                System.out.println(-1);
            }

        }


    }
    
}
