package Exercises;

public abstract class AbstractStudent {
    private String studentName;
    private int[] testScore;
    protected String testResult;

    public AbstractStudent(String studentName){
        this.studentName = studentName;
        testScore = new int [4];
    }
    public abstract void generateResult();

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public int[] getTestScore() {
        return testScore;
    }
    public void setTestScore(int[] testScore) {
        this.testScore = testScore;
    }
    public String getTestResult() {
        return testResult;
    }
    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    public void setTestScore(int testNumber, int testScore){
        this.testScore[testNumber]= testScore;
    }
    
    

}
