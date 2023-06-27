package java8NewFeatures.Consumer;

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

        Consumer<String> consume = System.out::println;
        names.forEach(consume);
    }
}