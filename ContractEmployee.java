package Assignments;

public class ContractEmployee extends EmployeeInheri{
    private double wage;
    private float hoursWorked;

    public ContractEmployee(int employeeId, String employeeName, double wage, float hoursWorked){
        super(employeeId,employeeName);
        this.setEmployeeId(employeeId);
        this.setEmployeeName(employeeName);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public void calculateSalary(){
        this.setSalary(hoursWorked*wage);
    }
    public String toString(){
        return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage: "+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
    }

}
