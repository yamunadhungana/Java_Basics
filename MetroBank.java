package Assignments;

public class MetroBank {
    public static void main(String[] args) {
        int Emi = 30;
        int AccNo = 1001;
        int salary = 40000;
        int balance = 250000;
        int LoanAmount = 300000;        
        String loanType = "Car";
        if(AccNo >= 1000 && AccNo <2000)
         {System.out.println("The account is valid");
            if (balance >=1000){
            System.out.println("The balance is valid");}      
        }else{System.out.println("The account and the balance is not valid");}
    
        switch (loanType) {
            case "Car":
            if(salary > 25000 && Emi < 36 && LoanAmount < 500000){
                System.out.println("The account no of "+ AccNo + 
                " is eligible for the requested loan of "+ 500000 +" and with the emi of 36" );
                break;
            }
            case "House":
            if(salary > 50000 && Emi < 60 && LoanAmount < 6000000){
                System.out.println("The account no of "+ AccNo + 
                " is eligible for the requested loan of  6000000 and with the emi of 60");
                break;
            }
            case "Business":
            if(salary > 75000 && Emi < 84 && LoanAmount < 7500000){
                System.out.println("The account no of "+ AccNo + 
                " is eligible for the requested loan of 7500000 and with the emi of 84 " );
                break;
            }
            default:
            System.out.println("Loan denied");
        
        }    

    }
}


