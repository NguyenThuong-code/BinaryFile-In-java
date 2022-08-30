package readwrite;

import java.io.IOException;
import java.io.InputStream;

public class ReadByConsole {
    public static void main(String[] args) throws IOException {
        InputStream is=System.in;
        while (true){
            System.out.println("Enter a character: ");
            int ch= is.read();
            if (ch=='q'){
                System.out.println("Finished!");
                break;
            }
            is.skip(2);
            System.out.println("Character will get it: " +(char) ch);
        }
    }
}
