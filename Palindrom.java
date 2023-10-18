package Assignments;

public class Palindrom {
    public static void main(String[] args) {
        
        int num = 46763;
        int temp = 0;
        int pale = num;

        while(num !=0)
        {
            temp =temp*10+ num%10;
            num = num/10;
        }
        if(pale == temp){
            System.out.println("The number "+ temp + " is palendrome");
        }else{ 
            System.out.println("The number "+ temp +" is not palendrome");
        }
    }
    
}
