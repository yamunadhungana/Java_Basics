package Assignments;

public class ArreyAss3 {
    public static int[] findLeapYears(int year){
        int[] leapYears = new int[15];
        int i = 0;

        while(i<15){
            if((year%400==0)|| (year%4==0)&& (year%100 !=0)){
                leapYears[i] = year;
                i++;
            }
            year++;
        }
        return leapYears;
    }
    public static void main(String[] args) {
        //int year = 2000;
        int year = 1900;
        int[] leapyears;
        leapyears = findLeapYears(year);
        for(int index = 0; index<leapyears.length; index++){
            System.out.println(leapyears[index]);
        }
    }
}
