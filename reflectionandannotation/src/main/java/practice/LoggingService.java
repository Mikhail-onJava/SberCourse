package practice;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class LoggingService {
    
    public static void log(Class<?> cls, String methodName) {
//        try {
//            Method method = cls.getDeclaredMethod(methodName);
//            if(method.isAnnotationPresent(ToBeLogged.class)) {
//                ToBeLogged toBeLogged = method.getAnnotation(ToBeLogged.class);
//                switch (toBeLogged.logLevel()) {
//                    case INFO -> System.out.println("INFO Logging method: " + method.getName() + "at time: " + LocalDateTime.now());
//                    case DEBUG -> System.out.println("DEBUG Logging method: " + method.getName() + "at time: " + LocalDateTime.now());
//                }
//            }
//        }
//        catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
        for(Method method : cls.getMethods()) {

            if(method.getName().equals(methodName)) {
                if(method.isAnnotationPresent(ToBeLogged.class)) {
                    ToBeLogged toBeLogged = method.getAnnotation(ToBeLogged.class);
                    switch (toBeLogged.logLevel()) {
                        case INFO -> System.out.println("INFO Logging method: " + method.getName() + "at time: " + LocalDateTime.now());
                        case DEBUG -> System.out.println("DEBUG Logging method: " + method.getName() + "at time: " + LocalDateTime.now());
                    }
                }
            }
        }
    }
}
