package readwriteobject;

import java.io.*;

public class TestDataStream {
    public static void main(String[] args) throws IOException {
        /**
         * DataInputStream và DataOutputStream đọc và ghi các giá trị kiểu nguyên thủy của Java
         * DataInputStream đọc dữ liệu từ luồng đầu vào thành các giá trị kiểu nguyên thủy thích hợp hoặc chuỗi.
         * DataOutputStream chuyển đổi các giá trị kiểu nguyên thủy hoặc chuỗi thành các byte và xuất các byte thành một luồng đầu ra.
         */
        try (
            DataOutputStream output =new DataOutputStream(new FileOutputStream("temp.dat"));
        ){
            output.writeUTF("thuong");
            output.writeDouble(85.5);
            output.writeUTF("Jim");
            output.writeDouble(185.5);
            output.writeUTF("George");
            output.writeDouble(105.25);
        }
try
        (DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));)
        {
            System.out.println(input.readUTF()+" "+ input.readDouble());
            System.out.println(input.readUTF()+" "+ input.readDouble());
            System.out.println(input.readUTF()+" "+ input.readDouble());
        }
    }
}
