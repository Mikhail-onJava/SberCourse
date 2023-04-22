package ProfModulTest3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // область применения
@Retention(RetentionPolicy.RUNTIME) // жизненный цикл
public @interface IsLike {
 boolean testIsCompleted() default false;
}

@IsLike(testIsCompleted = true)
class Test {
}

