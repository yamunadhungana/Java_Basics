package Exercises;

public class SmartPhone extends Mobile{
    private String networkGeneration;
    
    public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion, String networkGeneration){
        super(name, brand, operatingSystemName, operatingSystemVersion);
        this.networkGeneration = networkGeneration;
    }
    public String getNetworkGeneration() {
        return networkGeneration;
    }
    public void setNetworkGeneration(String networkGeneration) {
        this.networkGeneration = networkGeneration;
    }
    public boolean testCompatibility(){
        boolean result = false;
        if(getOperatingSystemName().equals("Saturn")){
            switch (getNetworkGeneration()) {
            case "3G" :
                if(getOperatingSystemVersion().equals("1.1") 
                || getOperatingSystemVersion().equals("1.2") 
                || getOperatingSystemVersion().equals("1.3")){
                    result = true;
                }            
                break;
            case "4G" :
                if(getOperatingSystemVersion().equals("1.2") 
                || getOperatingSystemVersion().equals("1.3")){
                    result = true;
                }            
                break;
            case "5G" :
                if(getOperatingSystemVersion().equals("1.3")){
                    result = true;
                }            
                break;
            }
        }else if(getOperatingSystemName().equals("Gara")){
            switch (getNetworkGeneration()) {
            case "3G" :
                if(getOperatingSystemVersion().equals("EXRT.1") 
                || getOperatingSystemVersion().equals("EXRT.2") 
                || getOperatingSystemVersion().equals("EXRU.1")){
                    result = true;
                }            
                break;
            case "4G" :
                if(getOperatingSystemVersion().equals("EXRT.2") 
                || getOperatingSystemVersion().equals("EXRU.1")){
                    result = true;
                }            
                break;
            case "5G" :
                if(getOperatingSystemVersion().equals("EXRU.1")){
                    result = true;
                }            
                break;
            }

        }else{
            return false;
        }
        return result;
        
    }    
}
