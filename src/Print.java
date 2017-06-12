import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Name  wanghongwei
 * Date  2017/6/9
 */
public class Print {
    public static void main(String[] args) throws Exception {
        File file =new File("e:/print.txt");
        PrintStream p = new PrintStream(new FileOutputStream(file,true));
        System.setOut(p);
        System.out.println("你吗的傻逼你是不是傻逼，知不知道你很重了，哈哈哈哈哈哈");

    }

}
