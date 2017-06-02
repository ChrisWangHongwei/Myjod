import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Name  wanghongwei
 * Date  2017/5/30
 */
public class FileIn {
   /* public static void main(String[] args) {
        try {
            byte[] b = new byte[1024];
            int i = 0;
            File file = new File("d:/wanghongwei.txt/good.text");
            if(!(file.exists())) {
                file.mkdirs();
            }
            FileInputStream in = new FileInputStream(file);
            while ((i = in.read(b)) != -1) {
                System.out.println(new String(b,0,i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
   public static void main(String[] args) {
       File file = new File("d:/b.text");
       try {
           file.createNewFile();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
}
