package readwrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteAndThenRead {
    public static void main(String[] args) throws IOException {
        try (
                FileOutputStream output = new FileOutputStream("D:\\File doc\\prj_Management.docx");
        ) {
            for (int i = 1; i <= 10; i++)
                output.write(i);
        }
        try (
            FileInputStream input=new FileInputStream("D:\\New doc\\new.docx");
        ){
            int val;
            while ((val= input.read())!=-1)
                System.out.println(val+" ");
        }
    }
}
