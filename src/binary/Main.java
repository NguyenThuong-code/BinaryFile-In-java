package binary;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Products> list=new ArrayList<>();
        list.add(new Products(1, "Beef", "mlem", 123, "New"));
        list.add(new Products(2, "Be", "mlem", 124, "New"));
        list.add(new Products(3, "Bef", "mlem", 153, "New"));
        list.add(new Products(4, "Been", "mlem", 173, "New"));
        list.add(new Products(5, "Bee", "mlem", 193, "New"));
        list.add(new Products(6, "Buff", "mlem", 123, "New"));

        ManageProduct mn= new ManageProduct();
        mn.addProduct(list);
//        mn.searchProductById(list);
        mn.writeToFile("product.txt", list);
        List<Products> prd= mn.readFileFromData("product.txt",list);
        for (Products product:prd
             ) {
            System.out.println(product);
        }
    }
}
