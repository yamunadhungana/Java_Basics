package Assignments;

public class ArreyAss2 {
    public static double [] findDetails(double[] salary){
    double sum = 0;

    for(double num:salary){
        sum = sum+num;
    }
    double average = sum/salary.length;
    double numAboveAvg = 0;
    double numBelowAvg = 0;

    for (double num:salary){
        if(num>average){
            numAboveAvg++;
        }else if(num<average){
            numBelowAvg++;
        }
    }
    double[] result = {average, numAboveAvg, numBelowAvg};
    return result;
}


public static void main(String[] args) {
    double [] salary = {23500.0,25080,28760.0,19890.0};
    double [] details = findDetails(salary);
    System.out.println("Average salary: "+ details[0]);
    System.out.println("Number of salaries greater than the average salary: "+ details[1]);
    System.out.println("Number of salaries lesser than the average salary: " + details[2]);


}
}
