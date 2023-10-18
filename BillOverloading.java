package Assignments;

public class BillOverloading {
    private int itemId;
    private String brandName;
    private String itemType;
    private int size;    

    public int getItemId() {
        return itemId;
    }
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public String getItemType() {
        return itemType;
    }
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public double findPrice(int itemId){
        switch(itemId){
            case 1001:
                return 25;            
            case 1002:
                return 20;            
            case 1003:
                return 23;            
            case 1004:
                return 18;
            default:
                return 0;
        }  

    }
    public double findPrice(String brandName, String itemType, int size){
        double price = 0;
        if(brandName.equals("Puma")){
            if(itemType.equals("T-Shirt")){
                if((size == 34) || (size == 36)){
                    price = 25;
                }
            else if(itemType.equals("Skirt")){
                 if((size ==38) || (size == 40)){
                    price = 20;
                }
            }
        }        
        }else{
            if(itemType.equals("T-shirt")){
                if((size == 34) || (size == 36)){
                    price = 23;
                }
            else if(itemType.equals("T-shirt")){
                if((size ==38) || (size == 40)){
                    price = 18;
                }
            }
        }    
    }        
        return price;  
     
}   

    public static void main(String[] args) {
        BillOverloading bill = new BillOverloading();
		
		double price = bill.findPrice(1001);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The Item Id is invalid");
		
		price = bill.findPrice("Reebok","T-shirt",34);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The values are not valid");
	}
    
}
