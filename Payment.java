package Assignments;

abstract public class Payment {
    private int customerId;
    protected String paymentId;
    protected double serviceTaxPercentage;

    public Payment(int customerId){
        this.customerId = customerId;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    public double getServiceTaxPercentage() {
        return serviceTaxPercentage;
    }
    public void setServiceTaxPercentage(double serviceTaxPercentage) {
        this.serviceTaxPercentage = serviceTaxPercentage;
    } 
    
    
    public abstract double payBill(double amount);
}
