package Interface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Client
{
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("t.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("文件找不到");
        }
    }
}

