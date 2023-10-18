package Assignments;

public class OfficeStaff extends Faculty{
    private String designation ;

    public OfficeStaff(String name, float basicSalary, String designation){
        super(name,basicSalary);
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public double calculateSalary(){
        double Cs = super.calculateSalary();
        //switch(this.designation){
            if(this.designation.equals("Accountant"))
            return Cs + 10000.0;
             
            else if(this.designation.equals("Clerk"))
            return Cs + 7000.0;
            
            else if(this.designation.equals("Peon"))
            return Cs + 4500.0;  
                   
            else return Cs;
            
        
       
    }
        
}
