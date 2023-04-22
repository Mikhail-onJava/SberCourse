package ProfModulTest4;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Task6 {
    public static void main(String[] args) {
        Set<Set<Integer>> sets = Set.of(
                new HashSet<>(asList(10, 0, 100, 1000)),
                new HashSet<>(asList(25, 0, 1, 16, 4, 9)),
                new HashSet<>(asList(0, 5, 50))
        );
        Set<Integer> mergedSet = sets.stream().flatMap(Collection::stream).collect(Collectors.toSet());
        System.out.println(mergedSet);
    }
}

// Collections.emptySet()