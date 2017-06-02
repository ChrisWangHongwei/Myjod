import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Name  wanghongwei
 * Date  2017/5/30
 */
public class CTest {
    public static void main(String[] args) {
        try {
            File file = new File("d:/a.txt");
            FileOutputStream out = new FileOutputStream(file);
            String  s="adbdjdj4545";
            byte[] bytes = s.getBytes();
            out.write(bytes);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

