package java8NewFeatures.Predicate.AMethodnegate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class negateExmplStrings {
    public static void main(String[] args) {
        List<String> langList=new ArrayList<>();
        langList.add("Java");
        langList.add("");
        langList.add("Python");
        langList.add("C++");
        Predicate<String> emptyValueList=String::isEmpty; // here we will get all empty values of list
        Predicate<String> notEmpty=emptyValueList.negate(); //opp of emptyValueList is not empty so we will get all list values
        for (String laString : langList) {
            if(notEmpty.test(laString)){
                System.out.println(laString);
            }
        }
    }
}
