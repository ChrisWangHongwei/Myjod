import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Name  wanghongwei
 * Date  2017/5/30
 */
public class CopyPhoto {
    public static void main(String[] args) {
        try {
            File file = new File("F:/photo/_副本.jpg");
            File ofile = new File("d:/拷贝.mps");
            FileOutputStream out = new FileOutputStream(ofile);
            FileInputStream in = new FileInputStream(file);
            int i=0;
            byte[] mybyte = new byte[1024];
            while((i=in.read(mybyte))!=-1) {
                out.write(mybyte,0,i);
            }
            in.close();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
