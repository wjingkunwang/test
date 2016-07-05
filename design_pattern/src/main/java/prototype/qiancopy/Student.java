package prototype.qiancopy;

/**
 * Created by wjk on 16/3/15.
 */

import lombok.Data;

@Data
public class Student implements Cloneable{
    private String studentName;
    private Teacher teacher;

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    public Student(String studentName, Teacher teacher) {
        this.studentName = studentName;
        this.teacher = teacher;
    }

}
