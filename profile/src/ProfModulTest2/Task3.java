package ProfModulTest2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Task3 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(0, 1, 2, 4));
        Set<Integer> setIntersection = PowerfulSet.intersection(set1, set2);
        Set<Integer> setUnion = PowerfulSet.union(set1, set2);
        Set<Integer> setRelativeComplement = PowerfulSet.relativeComplement(set1, set2);
        System.out.println(setIntersection);
        System.out.println(setUnion);
        System.out.println(setRelativeComplement);
    }
}

class PowerfulSet {
    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> setIntersection = new HashSet<>(set1);
        setIntersection.retainAll(set2);
        return setIntersection;
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> setUnion = new HashSet<>(set1);
        setUnion.addAll(set2);
        return setUnion;
    }

    public static <T> Set<T> relativeComplement(Set<T> set1, Set<T> set2) {
        Set<T> setRelativeComplement = new HashSet<>(set1);
        setRelativeComplement.removeAll(set2);
        return setRelativeComplement;
    }
}

