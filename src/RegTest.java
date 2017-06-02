import java.util.Arrays;

/**
 * Name  wanghongwei
 * Date  2017/5/27
 */
public class RegTest {
    public static void main(String[] args) {
        String a ="1  2  3      0     9    j   i ";
        String reg="\\s+";
        String[] split = a.split(reg);
        System.out.println(Arrays.toString(split));
    }
}
