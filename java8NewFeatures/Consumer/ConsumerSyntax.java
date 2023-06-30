package java8NewFeatures.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerSyntax {
    public static void main(String[] args) {
        // A consumer function in Java is a functional
        // interface that represents an operation that
        // takes in a single input argument and performs
        // some action without returning any result.

        // @FunctionalInterface
        // public interface Consumer<T> {
        // void accept(T t);
        // }
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        List<String> modifiedNames = new ArrayList<>();

        // Example: Modifying each name using a Consumer
        Consumer<String> modifyName = (name) -> modifiedNames.add("Modified: " + name.toUpperCase());
        names.forEach(modifyName);

        Consumer<String> consumeModfy = System.out::println;
        modifiedNames.forEach(consumeModfy);

        // 2nd Operation
        List<Integer> nos = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> modfyNos = new ArrayList<>();

        Consumer<Integer> mocmList = n -> {
            int squeare = n * n;
            modfyNos.add(squeare);
        };
        nos.forEach(mocmList);

        Consumer<Integer> cms = System.out::println;
        modfyNos.forEach(cms);

    }
}