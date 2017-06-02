import java.io.*;

/**
 * Name  wanghongwei
 * Date  2017/5/7
 */
public class Three {
    public static void main(String[] args) throws Exception {
        File file = new File("my.properties");
       User user = new User(10, "jack");

        FileOutputStream inputStream = new FileOutputStream(file);
        ObjectOutputStream outputStream = new ObjectOutputStream(inputStream);
        outputStream.writeObject(user);
        outputStream.close();

        FileInputStream in = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(in);
        User u=(User)objectInputStream.readObject();
        System.out.println(u);
        objectInputStream.close();


    }
}

class User implements Serializable {
    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.valueOf(age) + name;
    }
}