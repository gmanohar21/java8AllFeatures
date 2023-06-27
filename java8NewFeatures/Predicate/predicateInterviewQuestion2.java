package java8NewFeatures.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class predicateInterviewQuestion2 {
    public static void main(String[] args) {
        List<String> fruit = List.of("Apple", "mango", "Banana", "Guava", "grapes");
        Predicate<String> fruitPredicate = n -> n.toUpperCase().startsWith("M");
        List<String> filteredList = filter(fruit, fruitPredicate);
        System.out.println(filteredList.toString());
    }

    public static List<String> filter(List<String> frt, Predicate<String> p) {
        List<String> filteredList = new ArrayList<>();
        for (String frNAme : frt) {
            if (p.test(frNAme)) {
                filteredList.add(frNAme);
            }
        }
        return filteredList;
    }
}
