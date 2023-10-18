package Assignments;

public class ChickAndRabbit {
    public static void main(String[] args) {
        int head = 150;
        int legs = 500;
        int rabbitCount = 0;
        int chickenCount = 0;
        rabbitCount = (legs-2*head)/2;
        chickenCount = (head- rabbitCount);
        if(rabbitCount%2 == 0){
            System.out.println("Chicken count is"+chickenCount);
        }
            else {System.out.println("Some error occures");}

        }
    }
 

