package java8NewFeatures.supplier;

import java.util.function.Supplier;

public class SupplierIntro {
    // supplier consists of only get() method

    // The primary purpose of the Supplier interface is to provide a way to generate
    // or produce values lazily, on-demand, without the need for input parameters.
    // It is commonly used in scenarios where you need to defer the computation
    // of a value until it is needed, or when you want to create a factory-like
    // mechanism for generating objects.
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int) (Math.random() * 100);
        int randomVal = s.get();
        System.out.println("Random Number: " + randomVal);
    }

}
