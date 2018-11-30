package free4inno.concurrencylearning.annoation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 课程里用来标记【不推荐】的类或者写法
 */
@Target(ElementType.TYPE) //用于标识线程安全的类
@Retention(RetentionPolicy.SOURCE) //标识的范围
public @interface Recommand{
    String value() default "";
}
