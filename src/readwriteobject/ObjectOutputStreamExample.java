package readwriteobject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream oos= null;
        try{
            oos= new ObjectOutputStream(new FileOutputStream("product.txt"));
            Product product=new Product(1,"IPhone 13", 3828472,"New");
            oos.writeObject(product);
            oos.flush();
            /**
             * This method is used to flush the writer, which means that this method will remove all the data present inside the writer.
             * It neither accepts any parameter nor returns any value.
             */
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            oos.close();
        }
        System.out.println("Success!");
    }
}
