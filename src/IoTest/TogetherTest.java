package IoTest;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Name  wanghongwei
 * Date  2017/6/7
 */
public class TogetherTest {
    public static void main(String[] args) throws Exception {
        File file =new File("F:\\music");
        File newFile = new File("f:/合并后的音乐.jpg");
        File[] files = file.listFiles();
        Vector<InputStream> v = new Vector<InputStream>();
        for(File fi : files) {

                v.add(new FileInputStream(fi));

        }
        Enumeration<InputStream> elements = v.elements();
        SequenceInputStream si = new SequenceInputStream(elements);
        FileOutputStream out = new FileOutputStream(newFile);
        byte[] by = new byte[888888];
        int length =0;
        while((length=si.read(by))!=-1) {
            out.write(by,0,length);
        }
        si.close();
        out.close();
    }
}
