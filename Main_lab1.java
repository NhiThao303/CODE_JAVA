package ps48749_lab1;
import java.util.ArrayList;
public class Main_lab1 {
   public static void main(String[]args){
       ArrayList<Product> list = new ArrayList<>();

        list.add(new Product("P01","Mouse",200));
        list.add(new Product("P02","Keyboard",500));
        list.add(new Product("P03","Monitor",2000));
        list.add(new ImportedProduct("P04","Laptop",15000,0.1,500));
        list.add(new ImportedProduct("P05","Headphone",800,0.05,100));

        System.out.println("Danh sach san pham:");

        for(Product p : list){
            System.out.println(p + " | Final Price: " + p.finalPrice());
        }

        Product max = list.get(0);

        for(Product p : list){
            if(p.finalPrice() > max.finalPrice()){
                max = p;
            }
        }

        System.out.println("\nSan pham co gia cao nhat:");
        System.out.println(max + " | Final Price: " + max.finalPrice());
    }
}

