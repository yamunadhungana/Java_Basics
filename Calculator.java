package Exercises;

public class Calculator {
    //int num1 = 12;
    //int num2 = 8;
    //int num3 = 15;
    // ParameterLess constructor 

    int num1;
    int num2;
    int num3;
    double calculator = (num1+num2+num3)/3;

    public Calculator(){
        System.out.println(" Calculator called");
    }

    
    public void displayCalculator(){
        System.out.println("-----------Average of the three numbers-------------");
        System.out.println("The average of the three number is "+ calculator);
    
    }
public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.num1 = 12;
    calculator.num2 = 8;
    calculator.num3 = 15;
    calculator.displayCalculator();

    //Calculator calculator2 = new Calculator();
}

    
}
