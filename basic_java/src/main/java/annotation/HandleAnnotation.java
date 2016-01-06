package annotation;

import java.lang.reflect.Field;

/**
 * 读取注解信息
 */
public class HandleAnnotation {
    public static void getStudentInfo(Class<?> clazz){
        String strStudentName = "学生名称: ";
        String strStudentSex = "学生性别: ";
        String strStudentSchool = "学生所在学校: ";

        Field[]  fields  = clazz.getDeclaredFields();

        for(Field field : fields){
            if(field.isAnnotationPresent(StudentName.class)){
                StudentName studentName =  field.getAnnotation(StudentName.class);
                strStudentName = strStudentName + studentName.value();
                System.out.println(strStudentName);
            }else if(field.isAnnotationPresent(StudentSex.class)){
                StudentSex studentSex =  field.getAnnotation(StudentSex.class);
                strStudentSex = strStudentSex + studentSex.studentSex().toString();
                System.out.println(strStudentSex);
            }else if(field.isAnnotationPresent(School.class)){
                School school = field.getAnnotation(School.class);
                strStudentSchool = strStudentSchool + "学校名称: " + school.name().toString() +
                        "排名: " + school.id();
                System.out.println(strStudentSchool);
            }
        }

    }

    public static void main(String[] args) {
        HandleAnnotation.getStudentInfo(Student.class);
    }
}
