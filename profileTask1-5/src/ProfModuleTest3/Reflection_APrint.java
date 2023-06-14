package ProfModuleTest3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Reflection_APrint {
    public static void main(String[] args) throws Exception {
        try {
            Method m = APrinter.class.getMethod("print", int.class);
            m.invoke(new APrinter(), 5);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            System.out.println(e.getMessage());
        }
    }
}
