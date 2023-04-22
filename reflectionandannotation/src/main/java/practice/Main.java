package practice;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    
    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass();
        simpleClass.publicInteger = 1;
        try {
//            setDefaultValue(SimpleClass.class, simpleClass);
//            setDefaultValueFromAnnotation(SimpleClass.class, simpleClass);
            invokeMethodWithAnnotation(SimpleClass.class, simpleClass);
        }
        catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
//        setDefaultFieldValuesFromAnnotation(SimpleClass.class, simpleClass);
        
        SomeClassWithMethods someClassWithMethods = new SomeClassWithMethods();
        LoggingService.log(SomeClassWithMethods.class, "foo");
        someClassWithMethods.foo(1);
        
        LoggingService.log(SomeClassWithMethods.class, "bar");
        someClassWithMethods.bar(1);
        
        LoggingService.log(SomeClassWithMethods.class, "baz");
        someClassWithMethods.baz(1);
    }
    
    //Задача 1
    //Вывести список всех приватных полей и методов класса
    public static List<String> firstExample(Class<?> cls) {
        List<String> privateList = new ArrayList<>();
        List<Field> fields = getAllPrivateFields(cls);
        List<Method> methods = getAllPrivateMethods(cls);
        
        for (Field field : fields) {
            privateList.add(field.getName());
        }
        
        for (Method method : methods) {
            privateList.add(method.getName());
        }


//        privateList.addAll(getAllPrivateFields(cls).stream().map(Field::getName).toList());
//        privateList.addAll(getAllPrivateMethods(cls).stream().map(Method::getName).toList());
        
        return privateList;
    }
    
    private static List<Field> getAllPrivateFields(Class<?> cls) {
        List<Field> privateFields = new ArrayList<>();
        
        for (Field field : cls.getDeclaredFields()) {
            if (Modifier.isPrivate(field.getModifiers())) {
                privateFields.add(field);
            }
        }
        
        return privateFields;
    }
    
    private static List<Method> getAllPrivateMethods(Class<?> cls) {
        List<Method> privateMethods = new ArrayList<>();
        
        for (Method method : cls.getDeclaredMethods()) {
            if (Modifier.isPrivate(method.getModifiers())) {
                privateMethods.add(method);
            }
        }
        
        return privateMethods;
    }
    
    //Задача 2
//    Поиск количества схожих названий полей в двух классах,
//    если схожих полей больше половины от количества полей в классе с наибольшим кол-вом полей,
    public static void compareFields(Class<?> firstClass, Class<?> secondClass) {
        Set<String> firstClassFields = new HashSet<>();
        for (Field field : firstClass.getDeclaredFields()) {
            firstClassFields.add(field.getName());
        }

//        Set<String> firstClassFieldsStream = Arrays
//              .stream(firstClass.getDeclaredFields())
//              .map(Field::getName)
//              .collect(Collectors.toSet());
//
//        Set<String> secondClassFieldsStream = Arrays
//              .stream(secondClass.getDeclaredFields())
//              .map(Field::getName)
//              .collect(Collectors.toSet());
        
        Set<String> secondClassFields = new HashSet<>();
        for (Field field : secondClass.getDeclaredFields()) {
            secondClassFields.add(field.getName());
        }
        
        Set<String> maxFieldsSet = firstClassFields;
        Set<String> minFieldsSet = secondClassFields;
        
        if (secondClass.getDeclaredFields().length > maxFieldsSet.size()) {
            maxFieldsSet = secondClassFields;
            minFieldsSet = firstClassFields;
        }
        
        int countFields = maxFieldsSet.size();
        maxFieldsSet.removeAll(minFieldsSet);
        if (maxFieldsSet.size() < countFields / 2) {
            System.out.println("Классы содержат много схожих полей");
        }
    }
    
    //Задача 3
//    Метод который устанавливает дефолтное значение всем полям класса
//    если значения не указаны (для разных типов: String, Integer, Date)
    public static void setDefaultValue(Class<?> cls, Object object) throws IllegalAccessException {
        for (Field field : getAllFields(cls)) {
            if (Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(true);
            }
            
            if (field.get(object) == null) {
                if (field.getType() == String.class) {
                    field.set(object, "defaultValue");
                }
                if (field.getType() == Integer.class) {
                    field.set(object, 0);
                }
                if (field.getType() == Date.class) {
                    field.set(object, new Date());
                }
            }
        }
    }
    
    public static List<Field> getAllFields(Class<?> cls) {
        return List.of(cls.getDeclaredFields());
    }
    
    //Задача 4
//    Установить значение указанное в аннотации для поля помеченного этой аннотацией
    public static void setDefaultValueFromAnnotation(Class<?> cls, Object object) throws IllegalAccessException {
        for (Field field : getAllFields(cls)) {
            if (!field.isAnnotationPresent(SetValue.class)) {
                continue;
            }
            
            SetValue setValue = field.getAnnotation(SetValue.class);
            if (Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(true);
            }
            
            field.set(object, setValue.value());
            
        }
        
        
    }

//    public static void setDefaultFieldValuesFromAnnotation(Class<?> cls, Object object) {
//        Field[] fields = cls.getDeclaredFields();
//        System.out.println(object.getClass());
//        Arrays
//              .stream(fields)
//              .filter(field -> field.isAnnotationPresent(SetValue.class))
//              .forEach(field ->
//                       {
//                           System.out.println(field.getName());
//                           field.setAccessible(true);
//                           try {
//                               field.set(object, field
//                                     .getAnnotation(SetValue.class)
//                                     .value());
//                           }
//                           catch (IllegalAccessException e) {
//                               throw new RuntimeException(e);
//                           }
//                       });
//    }
    
    //Задача 5
//    Выполнить методы (без параметров) помеченные аннотацией
    public static void invokeMethodWithAnnotation(Class<?> cls, Object object) throws InvocationTargetException, IllegalAccessException {
        for (Method method : List.of(cls.getDeclaredMethods())) {
            if (method.isAnnotationPresent(Invoke.class)) {
                if (Modifier.isPrivate(method.getModifiers())) {
                    method.setAccessible(true);
                }
                
                method.invoke(object);
            }
        }
    }
    
    //Задача 8
    // Выполнить методы (с параметром строковым) помеченные аннотацией
    public static void invokeMethodWithAnnotationParams(Class<?> cls, Object object) throws InvocationTargetException, IllegalAccessException {
        for (Method method : List.of(cls.getDeclaredMethods())) {
            if (method.isAnnotationPresent(InvokeWithParams.class)) {
                if (Modifier.isPrivate(method.getModifiers())) {
                    method.setAccessible(true);
                }
                
                InvokeWithParams invokeWithParams = method.getAnnotation(InvokeWithParams.class);
                if (
                      method.getParameterCount() == 1 &&
                      List.of(method.getParameters()).get(0).getType() == String.class
                ) {
                    method.invoke(object, invokeWithParams.param());
                }
                else {
                    throw new RuntimeException("Метод содержит недопустимое кол-во параметров");
                }
            }
        }
    }
    //Задача 7
    //Создать аннотацию, которая обозначает то, что метод класса должен логироваться и с каким уровнем.
    //Для простоты Debug или Info. По умолчанию info.
    //Написать сервис, который будет писать лог, если метод класса отмечен такой аннотацией.
    
    
}

//[INFO/DEBUG] Logging method nameMethod at time LocalDateTime.now()
