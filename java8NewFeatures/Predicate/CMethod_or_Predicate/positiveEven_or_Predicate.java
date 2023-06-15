package java8NewFeatures.Predicate.CMethod_or_Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class positiveEven_or_Predicate {
    public static void main(String[] args) {
        List<Integer> numberList=new ArrayList<>();
        numberList.add(1);
        numberList.add(8);
        numberList.add(-5);
        numberList.add(0);
        numberList.add(9);
        numberList.add(7);

        Predicate<Integer> positiveNoFilter= n->n>=0;
        Predicate<Integer> evenNoFIlter=n->n%2==0;
        //here we are combining two conditions by using and method
        Predicate<Integer> andCondForPstvEvenFilter=positiveNoFilter.or(evenNoFIlter);

        for(Integer nos:numberList){
            if(andCondForPstvEvenFilter.test(nos)){
                System.out.println(nos);
            }
        }
    }
}
