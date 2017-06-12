package Code;

import java.io.*;
import java.util.Arrays;

/**
 * Name  wanghongwei
 * Date  2017/6/10
 */
public class Encoding {
    public static void main(String[] args) throws Exception {
        /*byte[] b ={-42,-48};
        FileOutputStream out = new FileOutputStream("e:/code.txt");
        out.write(b);
        out.close();
        System.out.println(Arrays.toString(b));
        String s1="中国";
        byte[] bytes = s1.getBytes("utf8");
        String s = new String(bytes);
        System.out.println(s);*/
       /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line =null;
        while((line=reader.readLine())!=" ") {
            System.out.println(line);
        }*/
        FileWriter out =new FileWriter("ddd.txt");
        String i ="fuck you";
        out.write(String.valueOf(i.getBytes()));

    }

}
