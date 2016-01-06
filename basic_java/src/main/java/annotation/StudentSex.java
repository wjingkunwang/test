package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 学生性别注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface StudentSex {
    /**
     * 性别枚举
     */
    public enum Sex {GRIL, BOY};

    /**
     * 性别属性
     * @return
     */

    Sex studentSex() default Sex.BOY;
}
