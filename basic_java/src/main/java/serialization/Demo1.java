package serialization;

import java.io.*;

/**
 * Created by wjk on 16/7/12.
 */
public class Demo1 {
    public static void main(String[] args) {
        try {
            User user = new User();
            user.setName("wjk");
            user.setAge(1);
            ObjectOutputStream output;
            output = new ObjectOutputStream(new FileOutputStream("user.bin"));
            output.writeObject(user);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("user.bin"));
            User user = (User) input.readObject();
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
