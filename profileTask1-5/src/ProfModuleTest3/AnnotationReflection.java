package ProfModuleTest3;

import java.lang.reflect.AnnotatedElement;

public class AnnotationReflection {
    public static void writeResult(Class<Test> testClass) {
        AnnotatedElement myAnnotatedElement = Test.class;
        System.out.println("AnnotatedElement represented by myAnnotatedElement: " + myAnnotatedElement);
        System.out.println("If there is any annotation in myAnnotatedElement: " + myAnnotatedElement.isAnnotationPresent(IsLike.class));
        // System.out.println(testClass.isAnnotationPresent(IsLike.class));
        System.out.println();

        IsLike annotation = Test.class.getAnnotation(IsLike.class);
        System.out.println("passed annotation value: " + annotation.testIsCompleted());
        // myAnnotatedElement.getAnnotation(IsLike.class).testIsCompleted()
    }

    public static void main(String[] args) throws ClassNotFoundException {
        writeResult(Test.class);
    }
}
