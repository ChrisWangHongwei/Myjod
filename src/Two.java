/**
 * Name  wanghongwei
 * Date  2017/5/6
 */
public class Two {
    public static int binary(int[] array,int k) {
        int min=0;
        int max=array.length-1;
        int mid=(min+max)>>1;

        while(true) {
            if(min<=max) {
              if(k>array[mid]) {
                  min=mid+1;
              }else if(k<array[mid]) {
                  max=mid-1;
              }else {
                  System.out.println("已经找到了");
                  return mid;
              }
            }else {
                System.out.println("很抱歉，没有找到");
                return -1;
            }
            mid=(min+max)>>1;
        }
    }
    public static void main(String[] args) {
        int[] a ={1,5,9,10,13,19,20,26,28,63};
       System.out.println(Two.binary(a, 100));
        System.out.println("这是我修改工程项目中的某一个文件内容，我现在要把他提交上去");
    }

   }
