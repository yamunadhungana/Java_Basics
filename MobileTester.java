package Exercises;

public class MobileTester {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("KriezaA8", "Quasar", "Gara", "EXRT.1", "4G");
		if(smartPhone.testCompatibility())
		    System.out.println("The mobile OS is compatible with the network generation!");
		else
		    System.out.println("The mobile OS is not compatible with the network generation!");
		
    }
}
