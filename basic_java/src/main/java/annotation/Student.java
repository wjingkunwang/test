package annotation;

/**
 * 使用注解
 */
public class Student {
    @StudentName("ximing")
    private String name;
    @StudentSex(studentSex = StudentSex.Sex.GRIL)
    private String sex;
    @School(name = "北大", id = 1)
    private String school;
}
