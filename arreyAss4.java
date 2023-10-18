package Assignments;

public class arreyAss4 {
    public static int[] findNumbers(int num1,int num2){
        int[] numbers = new int[6];
        int num = 10;
        int i = 0;

        if(num1<=num2){
            while(num<= num2){
                int sumOfDigits = 0;
                int inputNumber = num;
                int temp;

                while(inputNumber >0){
                    temp = inputNumber % 10;
                    sumOfDigits +=temp;
                    inputNumber /=10;
                }
                if(sumOfDigits%3 == 0 && num%5 ==0){
                    numbers[i] = num;
                    i++;
                }
                num++;
            }
        }
        return numbers;
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 =30;
        int[] numbers = findNumbers(num1, num2);
        if(numbers[0] ==0){
            System.out.println("There is no such number");
        }else {
            for(int index = 0; index <= numbers.length -1; index++){
                if(numbers[index]==0){
                    break;
                }
                System.out.println(numbers[index]);
            }
        }
 
    }
}
