package SwiftFood.Association;

public class CabServiceProvider {
    private String cabServiceName;
    private int totCabs;

    public String getCabServiceName() {
        return cabServiceName;
    }

    public void setCabServiceName(String cabServiceName) {
        this.cabServiceName = cabServiceName;
    }

    public int getTotCabs() {
        return totCabs;
    }

    public void setTotCabs(int totCabs) {
        this.totCabs = totCabs;
    }
    CabServiceProvider(String cabServiceName, int totalCabs)
    {
        this.cabServiceName = cabServiceName;
        this.totCabs = totalCabs; 
    }
   public double calculateRewardPrice(Driver driver){
        double bonous = 0;
        double avgRating = driver.getAverageRating(); 
        if(this.cabServiceName.equals("Halo")){  
            if(avgRating >=4.5 && avgRating <= 5){
                bonous = 10*avgRating;
                return Math.round((bonous*100.0)/100.0);
            }else if(avgRating >=4 && avgRating < 4.5){
                bonous = 5*avgRating;
               return Math.round((bonous*100.0)/100.0);
            }
        else{ 
                if(avgRating >=4.5 && avgRating <= 5){
                    bonous = 8*avgRating;
                   return Math.round((bonous*100.0)/100.0);
                }else if(avgRating >=4 && avgRating < 4.5){
                    bonous = 3*avgRating;
                   return Math.round((bonous*100.0)/100.0);
                }
            }
            return Math.round((bonous*100.0)/100.0);
        }
        return avgRating;
    
    }
        
}
