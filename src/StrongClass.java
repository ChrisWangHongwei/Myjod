/**
 * Name  wanghongwei
 * Date  2017/6/3
 */
public class StrongClass extends Father {
    public void set() {
        super.get();
    }

    public static void main(String[] args) {
        StrongClass s = new StrongClass();
        s.set();
    }
}
class Father {
    public void get() {
        System.out.println("father is way");
    }
}
