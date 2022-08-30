package readwrite;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) throws IOException {


            InputStream is = new FileInputStream("C:/Users/Administrator/IdeaProjects/Binary File In Java/src/read/CodeGym.txt");
            int i= -1;
            while ((i=is.read())!=-1){
                System.out.println((char) i);
            }
            is.close();

    }
}
