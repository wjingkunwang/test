package chuangjianxin.prototype.qiancopy;

import lombok.Data;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by wjk on 16/3/15.
 */
@Data
public class StudentSh {

    private String studentName;
    private Teacher teacher;

    public StudentSh(String studentName, Teacher teacher) {
        this.studentName = studentName;
        this.teacher = teacher;
    }

    public Object deepClone() {//将对象写到流里
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(this);//从流里读出来
            ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bi);
            return (oi.readObject());
        } catch (Exception e) {
            return null;
        }
    }

}
