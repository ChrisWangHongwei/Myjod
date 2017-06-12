package thead;

/**
 * Name  wanghongwei
 * Date  2017/6/12
 */
public class SaleTichet {
    public static void main(String[] args) {
         Sale sale1 = new Sale("窗口1");
        Sale sale2 = new Sale("窗口2");
        Sale sale3 = new Sale("窗口3");
        sale1.start();
        sale2.start();
        sale3.start();
        sale3.setPriority(8);
        sale2.setPriority(5);
        sale1.setPriority(3);

    }

}
class Sale extends Thread {
    static int ticket=50;
    public Sale(String name) {
        super(name);
    }
    @Override
    public void run() {
        while(true) {
            synchronized ("fuck") {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖了" + ticket + "号票");
                    ticket--;
                } else {
                    System.out.println("票卖完了");
                    break;
                }
            }
        }
    }
}