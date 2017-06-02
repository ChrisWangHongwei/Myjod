enum Gender {
    WOMEN("男"), MAN("女");
    String value;

    private Gender(String gender) {
        this.value = gender;
    }
}

/**
 * Name  wanghongwei
 * Date  2017/5/27
 */
public class EunmTest {
    public static void main(String[] args) {
        Persion p = new Persion();
        p.name = "小强";
        p.gender = Gender.MAN;
        System.out.println(p);
    }
}

class Persion {
    String name;
    Gender gender;

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", gender=" + gender.value +
                '}';
    }
}
