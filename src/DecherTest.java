/**
 * Name  wanghongwei
 * Date  2017/6/4
 */
public class DecherTest {
    public static void main(String[] args) {
       Work son = new Son(new Work());
        Work mother =new Mother(son);
        Fathers father = new Fathers(mother);
        father.workTools();
    }
}
class Work {
    public void workTools() {
        System.out.println("画板已经准备好");
    }
}
class Son extends  Work{
    Work work;
    public Son(Work work) {
        this.work=work;
    }

    @Override
    public void workTools() {
        work.workTools();
        System.out.println("准备涂料");
    }
}

class Mother extends Work {
    Work work;
    public Mother(Work work) {
        this.work=work;
    }

    @Override
    public void workTools() {
        work.workTools();
        System.out.println("准备画笔");
    }
}

class Fathers extends Work {
    Work work;
    public Fathers(Work work) {
        this.work=work;
    }

    @Override
    public void workTools() {
        work.workTools();
        System.out.println("准备画画");
    }
}