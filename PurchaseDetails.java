package Exercises;

public class PurchaseDetails implements Tax{
    private String purchaseId;
    private String paymentType;
    private double taxPercentage;

    PurchaseDetails(String purchaseId, String paymentType){
        this.purchaseId = purchaseId;
        this.paymentType = paymentType;
    }
    public String getPurchaseId() {
        return purchaseId;
    }
    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }
    public String getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    public double getTaxPercentage() {
        return taxPercentage;
    }
    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    @Override
    public double calculateTax(double price){
        taxPercentage = 4;
        if(this.paymentType.equals("Debit Card")){
            this.taxPercentage = 2;
        }else if(this.paymentType.equals("Credit Card")){
            this.taxPercentage = 3;
        }else{
            this.taxPercentage = 0;
        }
        return Math.round(price*(1 + (this.taxPercentage/100.0))*100.0)/100.0;        
        }        
    }    

