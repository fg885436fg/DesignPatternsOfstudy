import decorator.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class test {

    public static void main(String[] args) throws Exception {
        int c;
        InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
        while ((c = in.read()) >= 0) {
            System.out.print((char) c);
        }
        in.close();
    }

}
