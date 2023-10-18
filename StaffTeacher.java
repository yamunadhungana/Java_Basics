package Assignments;

public class StaffTeacher extends Faculty {
    private String qualification;

    public StaffTeacher(String name, float basicSalary, String qualification){
        super(name, basicSalary);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public double calculateSalary(){
        double Cs = super.calculateSalary();
        //switch(this.qualification){
            if(this.qualification.equals("Doctoral"))
                return Cs + 20000.0;
            
            else if(this.qualification.equals("Masters"))
                return Cs + 18000.0;
            
            else if(this.qualification.equals("Bachelor"))
                return Cs + 15500.0;
           
            else if(this.qualification.equals( "Associate"))
                return Cs + 10000.0;
            
            else return Cs;   
        
    }
}
