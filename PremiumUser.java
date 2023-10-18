package Exercises;

public class PremiumUser extends User {
    private int rewardPoints;

    PremiumUser(int id, String userName, String emailId, double walletBalance){
        super(id,userName, emailId,walletBalance);
    }
    public int getRewardPoints() {
        return rewardPoints;
    }
    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    @Override
    public boolean makePayment(double billAmount){
        
        if(super.makePayment(billAmount)){
            this.rewardPoints += billAmount * 0.1;
            return true;
        }else{
            return false;
        }
    }

    

}


