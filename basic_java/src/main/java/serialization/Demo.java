package serialization;

import java.io.*;

/**
 * Created by wjk on 16/7/12.
 */
public class Demo implements Serializable {
    private static final long serialVersionUID = 7280703192543232805L;
    //    private static String name = "wangjingkun";
    User user = new User("wangjignkun", 1);

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void todo() {

    }

    public static void main(String[] args) {

        try {
            ObjectOutputStream output;
            output = new ObjectOutputStream(new FileOutputStream("name"));
            output.writeObject(new Demo());
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        序列化后重新复制
//        name = "snail";


        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("name"));
            Demo demo = (Demo) input.readObject();
            System.out.println(demo.getUser().getName()+"\n"+demo.getUser().getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
