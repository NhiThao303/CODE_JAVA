package ps48749_lab1;
public class ImportedProduct extends Product{
     private double importTaxRate;
    private double shippingFee;
    public ImportedProduct(String id, String name, double basePrice, double importTaxRate, double shippingFee) {
        super(id, name, basePrice);
        if(importTaxRate >= 0 && importTaxRate <= 1){
            this.importTaxRate = importTaxRate;
        }
        if(shippingFee >= 0){
            this.shippingFee = shippingFee;
        }
    }
  @Override
    public double finalPrice() {
        return getBasePrice() + getBasePrice()*importTaxRate + shippingFee;
    }
@Override
    public String toString() {
        return super.toString() +
                " - ImportTaxRate: " + importTaxRate +
                " - ShippingFee: " + shippingFee;
    }
}

   
    

