package Exercises;

public class DigitalCamera extends Camera{
    private int memory;

	public DigitalCamera(String brand, double cost) {
        super(brand,cost);
		this.memory = 16;
	}
    
    public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
    
    public static void main(String[] args) {
        DigitalCamera camera = new DigitalCamera("Canon",100);
        System.out.println(camera.getBrand()+" "+camera.getCost()+" "+camera.getMemory());
    }
}
