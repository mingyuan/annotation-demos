package cn.mingyuan;

/**
 * @author jiangmingyuan@myhaowai.com
 * @version 2016/11/9 17:49
 * @since jdk1.8
 */
@AnAnnotation(description = "helloworld")
public class AnnotationedClass {
    @AnAnnotation(author = "huige", description = "test description", revision = 2)
    public void test() {

    }
}
