package Exercises;

public class ArrayExercise {
    
    public static int calculateSumOfEvenNumbers(int[] nums){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                sum= sum+nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
       // int[] nums = {68,79,86,99,23,2,41,100};
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Sum of even numbers: " +calculateSumOfEvenNumbers(nums));
    }
}
