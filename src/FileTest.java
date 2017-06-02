import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Name  wanghongwei
 * Date  2017/5/28
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("E:/aa/bb/cc");
        file.mkdirs();
        File f = new File("E:/a.text");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File fi = new File(".");
        File[] files = File.listRoots();
        System.out.println(Arrays.toString(files));
    }
}
