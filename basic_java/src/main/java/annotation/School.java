package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 学校注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface School {
    /**
     * 学校名称
     */
    public String name() default "";

    /**
     * 学校排名
     * @return
     */
    public int id() default -1;
}
