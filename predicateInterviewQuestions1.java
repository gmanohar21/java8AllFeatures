package java8NewFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class predicateInterviewQuestions {
    public static void main(String[] args) {
        List<Integer> number=List.of(74,1,2,3,4,5,6,71,94);
        // it will take only one value(argument) to check if no is even
        Predicate<Integer> evenPredicate=n->n%2==0;
        //here it will filter and save it to another list
        List<Integer> evenNumbers=filter(number,evenPredicate);
        System.out.println(evenNumbers.toString());
    }
    public static List<Integer> filter(List<Integer> numbers,Predicate<Integer> predicate){
        List<Integer> filteredList=new ArrayList<>();
        for(Integer num:numbers){
            //here test method is used to check if condition satisfies or not if matches return true
            if(predicate.test(num)){
                filteredList.add(num);
            }
        }
        return filteredList;
    }
}
