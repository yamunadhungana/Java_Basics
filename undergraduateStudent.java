package Exercises;

public class undergraduateStudent extends AbstractStudent{
    public undergraduateStudent(String studentName){
        super(studentName);
    }
    
    @Override
    public void generateResult(){
        int totalScore = 0;
        int avgScore;
        for(int score: this.getTestScore())
        {
            totalScore += score;
        }
        avgScore = totalScore/4;
        
        if(avgScore>= 60){
            testResult = "Pass";
        }else if(avgScore <60){
            testResult = "Fail";
        }

    }
}

    

