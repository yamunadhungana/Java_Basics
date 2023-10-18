package Exercises;

public class PointMethodOverloading {
    private double xCoordinate;
    private double yCoordinate;

    PointMethodOverloading(double xCoordinate, double yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    public double getxCoordinate() {
        return xCoordinate;
    }
    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }
    public double getyCoordinate() {
        return yCoordinate;
    }
    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
    public double calculateDistance(){
        return calculateDistance(new PointMethodOverloading(0,0)); 
    }

    public double calculateDistance(PointMethodOverloading point){
        double x = Math.abs(this.xCoordinate - point.xCoordinate);
        double y = Math.abs(this.yCoordinate - point.yCoordinate);
        //double distance = ((x*x)+(y*y));        
        return Math.round(Math.sqrt((x*x)+(y*y))*100.0)/100.0;
    }

    public static void main(String[] args) {
        PointMethodOverloading point1 = new PointMethodOverloading(3.5, 1.5);
        PointMethodOverloading point2 = new PointMethodOverloading(6, 4);
                                
        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));
    }
        
}
