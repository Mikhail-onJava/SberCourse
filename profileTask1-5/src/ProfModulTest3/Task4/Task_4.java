package ProfModulTest3.Task4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

interface Int1 {
}

interface Releasing {
}

interface Transporting extends Int1 {
}

class Factory
        implements Releasing {
}

class Auto
        extends Factory // расширяет
        implements Transporting { // реализовывает
}

public class Task_4 {
    public static void main(String[] args) {
        Set<Class<?>> interfaces = getAllInterfaces(Auto.class);
        System.out.println("All Interfaces: ");
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getSimpleName());
        }
    }

    public static Set<Class<?>> getAllInterfaces(Class<?> cls) {
        Set<Class<?>> interfaces = new HashSet<>();
        while (cls != Object.class) { // перебор классов
            Set<Class<?>> boxInterfaces = new HashSet<>(List.of(cls.getInterfaces())); // экземпляр класса, которому передаю все интерфейсы класса вхождения в цикл
            for (Class<?> element : boxInterfaces) {
                boxInterfaces.addAll(List.of(element.getInterfaces())); // добавляю интерфейсы класса вхождения в boxInterfaces
            }
            interfaces.addAll(boxInterfaces); // передаю все интерфейсы boxInterfaces
            cls = cls.getSuperclass(); // присваиваю классу вхождения его суперкласс
        }
        return interfaces;
    }
}


//    Set<Class<?>> interfaces1 = getAllInterfaces1(Auto.class);

//    public static Set<Class<?> > getAllInterfaces1(Class<?> cls) {
//        Set<Class<?>> interfaces = new HashSet<>(List.of(cls.getInterfaces()));
//        for (Class<?> inter: interfaces) {
//            Class<?> checkedInterface = inter;
//            while (checkedInterface != null) {
//                interfaces.addAll(List.of(checkedInterface.getInterfaces()));
//                checkedInterface = checkedInterface.getSuperclass();
//            }
//            interfaces.addAll(interfaces);
//        }
//
//        return interfaces;
//    }


//    Написать метод, который с помощью рефлексии получит все интерфейсы
//класса, включая интерфейсы от классов-родителей и интерфейсов-родителей.

