import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 * Name  wanghongwei
 * Date  2017/5/30
 */
public class WhileRead {
    public static void main(String[] args) {
        try {
            File file = new File("d:/a.txt");
            FileInputStream in = new FileInputStream(file);
            int i =0;
            /*while((i=in.read())!=-1) {
                System.out.println((char)i);
            }*/
            byte[] b = new byte[1024];
            while(in.read(b)!=-1){
                System.out.println(Arrays.toString(b));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
