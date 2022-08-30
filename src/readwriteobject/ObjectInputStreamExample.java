package readwriteobject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois= null;
        try {
            ois=new ObjectInputStream(new FileInputStream("product.txt"));
            Product pr=(Product) ois.readObject();
            System.out.println(pr);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            ois.close();
        }
    }
}
