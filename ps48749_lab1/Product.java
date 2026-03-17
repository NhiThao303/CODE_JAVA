package ps48749_lab1;
public class Product {
     private String id;
    private String name;
    private double basePrice;

    // Constructor đầy đủ
    public Product(String id, String name, double basePrice) {
        setId(id);
        this.name = name;
        setBasePrice(basePrice);
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    // Setter có validate
    public void setId(String id) {
        if(id == null || id.trim().isEmpty()){
            System.out.println("ID không được rỗng");
        }else{
            this.id = id;
        }
    }

    public void setBasePrice(double basePrice) {
        if(basePrice >= 0){
            this.basePrice = basePrice;
        }else{
            System.out.println("BasePrice phải >= 0");
        }
    }

    // giá cuối cùng mặc định
    public double finalPrice(){
        return basePrice;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - BasePrice: " + basePrice;
    }
}
