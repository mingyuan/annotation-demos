package cn.mingyuan;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author jiangmingyuan@myhaowai.com
 * @version 2016/11/9 17:47
 * @since jdk1.8
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface AnAnnotation {
    public String author() default "mingyuan";

    public String description();

    public int revision() default 1;
}
