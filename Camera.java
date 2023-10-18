package Exercises;

public class Camera {
    private String brand;
    private double cost;

	public Camera() {
		this.brand = "Nikon";
	}
    public Camera(String brand, double cost) {
        this.setBrand(brand);
		this.setCost(cost);;
	}
    
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}


