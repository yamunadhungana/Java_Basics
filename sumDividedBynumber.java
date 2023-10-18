package Assignments;

public class sumDividedBynumber {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        int temp = 0;
        int originalnum =num;
        while (num > 0) {
            temp = num % 10;
            sum = sum + temp;
            num = num / 10;
        }
        System.out.println("the sum of the number is: "+ sum);
        if (originalnum%sum==0){
            System.out.println("The number is divisible");
        }else{
            System.out.println("The number is not divisible");
        }
    }
}
