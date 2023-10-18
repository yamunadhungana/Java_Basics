package Assignments;

public class Faculty {
    private String name;
    private float basicSalary;
    private float bonousPercentage;
    private float carAllowancePercentage;

    public Faculty(String name, float basicSalary){
        this.name = name;
        this.basicSalary = basicSalary;
        basicSalary = 4f;
        carAllowancePercentage = 2.5f;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }
    public float getBonousPercentage() {
        return bonousPercentage;
    }
    public void setBonousPercentage(float bonousPercentage) {
        this.bonousPercentage = bonousPercentage;
    }
    public float getCarAllowancePercentage() {
        return carAllowancePercentage;
    }
    public void setCarAllowancePercentage(float carAllowancePercentage) {
        this.carAllowancePercentage = carAllowancePercentage;
    }
    public double  calculateSalary(){
        //double totalSalary = this.basicSalary + (this.basicSalary*this.bonousPercentage) + (this.basicSalary*this.carAllowancePercentage);
        return this.basicSalary*(1+this.bonousPercentage+this.carAllowancePercentage);
    }
    
}
