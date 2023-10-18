package Exercises;

public class graduateStudent extends AbstractStudent {
    public graduateStudent(String studentName){
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
        
        if(avgScore>= 70){
            testResult = "Pass";
        }else if(avgScore <70){
            testResult = "Fail";
        }

    }

}



    
    

