package Exercises;

public class FinalStudent {
    private final int STIPEND = 100;
    private int studentId;
    private int aggregateMarks;
    
    public int getSTIPEND() {
        return STIPEND;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public int getAggregateMarks() {
        return aggregateMarks;
    }
    public void setAggregateMarks(int aggregateMarks) {
        this.aggregateMarks = aggregateMarks;
    }

    public double calculateTotalStipend(){
        double totalSti = 0;
        if(this.aggregateMarks>= 85 && this.aggregateMarks < 90){
            totalSti = this.STIPEND + 10;
        }else if(this.aggregateMarks>=90 && this.aggregateMarks <95){
            totalSti = this.STIPEND + 15;
        }else if(this.aggregateMarks>=95 && this.aggregateMarks <=90){
            totalSti = this.STIPEND + 20;
        }else{
            totalSti = this.STIPEND;
        }
        return totalSti;
    }

    public static void main(String[] args) {
        FinalStudent student1 = new FinalStudent();
		student1.setStudentId(1212);
		student1.setAggregateMarks(93);

		double totalStipend = student1.calculateTotalStipend();
		System.out.println("The final stipend of " + student1.getStudentId()+" is $" + totalStipend);

		FinalStudent student2 = new FinalStudent();
		student2.setStudentId(1222);
		student2.setAggregateMarks(84);

		totalStipend = student2.calculateTotalStipend();
		System.out.println("The final stipend of " + student2.getStudentId()+" is $" + totalStipend);
	}
    
}
