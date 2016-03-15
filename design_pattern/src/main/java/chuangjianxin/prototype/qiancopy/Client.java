package chuangjianxin.prototype.qiancopy;

/**
 * Created by wjk on 16/3/15.
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Teacher teacher = new Teacher("snail");
        StudentSh student1  =new StudentSh("wjk",teacher);
        StudentSh student2 = (StudentSh) student1.deepClone();
        student2.getTeacher().setName("snail改变");
        System.out.println(student1.getTeacher().getName());
        System.out.println(student2.getTeacher().getName());
     }
}
