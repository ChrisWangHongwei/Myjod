package Code;

import java.io.File;

/**
 * Name  wanghongwei
 * Date  2017/6/11
 */
public class ListFile {
    public static void main(String[] args) {
         list(new File("f:/联系人"),"|--");
    }
    public static void list(File file,String space) {
      //  File file = new File("f:/联系人");
        if(!file.exists()) {
            return;
        }
        for(File f:file.listFiles()) {
            if(f.isFile()) {
                System.out.print(f.getName());
            }else if(f.isDirectory()) {
                System.out.println(space+f.getName());
                list(f,"| " +space);
            }
        }
    }
}
