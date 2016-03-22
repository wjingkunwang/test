package chuangjianxin.prototype.qiancopy;

import lombok.Data;

import java.io.*;

/**
 * Created by wjk on 16/3/15.
 */
@Data
public class StudentSh implements Serializable {
    private static final long UID = 6948989635489677685L;
    private String studentName;
    private Teacher teacher;

    public StudentSh(String studentName, Teacher teacher) {
        this.studentName = studentName;
        this.teacher = teacher;
    }

    public Object deepClone() {
        try {
            //将对象写到流里
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(this);
            //从流里读出来
            ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bi);
            return (oi.readObject());
        } catch (Exception e) {
            return null;
        }
    }

}
