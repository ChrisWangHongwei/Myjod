package collection.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Name  wanghongwei
 * Date  2017/6/9
 */
public class Count {
    public static void main(String[] args) throws Exception {
        File file = new File("E:/runtime.properties");
        if(!file.exists()) {
            file.createNewFile();
        }
        Properties p = new Properties();
        p.load(new FileInputStream(file));
        String num = p.getProperty("num");
        int count=0;
        if (num!=null) {
         count = Integer.parseInt(num);
        }
        if (count==3) {
            System.out.println("次数已到，请购买正版");
            System.exit(-1);
        }
        count++;
        p.setProperty("num",count+"");
        p.store(new FileOutputStream(file),"runtime");
        System.out.println("你还剩下" + (3-count) +"次的使用机会");

    }
}
