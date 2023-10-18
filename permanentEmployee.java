package Assignments;

public class permanentEmployee extends EmployeeInheri {
    private double basicPay;
    private double hra;
    private float experience;

    permanentEmployee(int employeeId, String employeeName, double basicPay,double hra, float experience){
        super(employeeId,employeeName);
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = experience;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

     public void calculateMonthlySalary(){
        this.experience = 0;
        double myCalcSalary = 0;
        if(this.experience <5){
           myCalcSalary = Math.round(this.basicPay+this.hra+(0.05*this.basicPay));
           setSalary(myCalcSalary);
        }else if(this.experience <10){
            myCalcSalary = Math.round(this.basicPay+this.hra+(0.07*this.basicPay));
           setSalary(myCalcSalary);
        }else if(this.experience<3){
            myCalcSalary = Math.round(this.basicPay+this.hra);
            setSalary(myCalcSalary);
        }else{            
            myCalcSalary = Math.round(this.basicPay + this.hra+(0.12*this.basicPay));
            setSalary(myCalcSalary);

        }

     }
     public String toString(){
        return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperience();
    }

}
