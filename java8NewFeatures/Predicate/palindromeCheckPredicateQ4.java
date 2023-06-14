package java8NewFeatures.Predicate;

import java.util.function.Predicate;

public class palindromeCheckPredicateQ4 {
    public static void main(String[] args) {
        String s1="level";
        String s2="gani";
        Predicate<String> palindCheck=s->{ StringBuffer rev=new StringBuffer(s).reverse();
            return s.equals(rev.toString());
        };

        boolean b=palindCheck.test(s1);
        System.out.println(b);
        boolean b1=palindCheck.test(s2);
        System.out.println(b1);
    }
}
