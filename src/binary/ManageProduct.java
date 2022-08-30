package binary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageProduct {


    public void addProduct (List<Products> products){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ID: " );
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name:");
        String name= sc.nextLine();
        System.out.println("Enter Brand:");
        String brand=sc.nextLine();
        System.out.println("Enter Price: ");
        double price=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Describe:");
        String des= sc.nextLine();

        Products pr= new Products(id,name,brand,price,des);
        products.add(pr);
    }
    public void searchProductById(List<Products> products){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Id product want to Find:");
        int id=sc.nextInt();
        for (int i=0;i<products.size();i++){
            Products pr= products.get(i);
            if (pr.getId()==id){
                System.out.println(products.get(i));
            }
        }
    }
    public  void writeToFile(String path, List<Products> products){
        try{
            FileOutputStream fos =new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public  List<Products> readFileFromData(String path,List<Products> products){

        try {
            FileInputStream fis=new FileInputStream(path);
            ObjectInputStream ois=new ObjectInputStream(fis);
            products= (List<Products>) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return products;
    }
}
