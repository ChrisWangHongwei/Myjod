import java.io.File;
import java.util.Arrays;

/**
 * Name  wanghongwei
 * Date  2017/5/12
 */
public class Fore {
    public static void main(String[] args) {
//        String s ="hellow java";
//        System.out.println(s+ s.length());
//        s = s.replace("java","ja");
//        System.out.println(s+ s.length());
//          int[] i ={1,2,3,4,5};
//        System.out.println(Arrays.toString(i));
//        System.out.println(System.getenv("path"));
        for(File file:File.listRoots()) {
            System.out.println(file);
        }

    }
}
