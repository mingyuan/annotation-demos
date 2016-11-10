package cn.mingyuan;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Method[] methods = AnnotationedClass.class.getMethods();
        for (Method method : methods) {
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            for (Annotation annotation : declaredAnnotations) {
                System.out.println(annotation.toString());
                if (annotation instanceof AnAnnotation) {
                    AnAnnotation info = (AnAnnotation) annotation;
                    System.out.println(info.author());
                }

                AnAnnotation info = method.getAnnotation(AnAnnotation.class);
                if (info != null) {
                    System.out.println(info.author());
                }
            }
        }
        System.out.println("--------------------------------");

        AnAnnotation annotation = AnnotationedClass.class.getAnnotation(AnAnnotation.class);
        if(annotation!=null){
            System.out.println(String.format("methinfo -> %s",annotation.author()));
        }


        Annotation[] annotations = AnnotationedClass.class.getAnnotations();
        if(annotations!=null){
            System.out.println("annotations->"+annotations.length);
            for (Annotation annotation1 : annotations) {
                System.out.println(annotation1.toString());
            }
        }

        System.out.println("-----------------------1");

        Annotation[] annotations1 = AnAnnotation.class.getAnnotations();
        for (Annotation annotation1 : annotations1) {
            System.out.println(annotation1);
        }
    }
}
