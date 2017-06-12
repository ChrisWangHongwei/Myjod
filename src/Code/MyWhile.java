package Code;

/**
 * Name  wanghongwei
 * Date  2017/6/11
 */
public class MyWhile {
    public static void main(String[] args) {
       // get(5);
        System.out.println((long)getAll(9));
    }
    public static  void get(int num) {
        int k=1;
        while(num>0) {
            k=k*num;
            num--;
        }
        System.out.println(k);
    }
    public static long getAll(int mun) {
        if(mun==1) {
            return mun;
        }else {
            return mun*getAll(mun-1);
        }
    }
}
