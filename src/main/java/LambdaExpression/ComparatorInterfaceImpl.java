package LambdaExpression;

import java.util.Comparator;

public class ComparatorInterfaceImpl
{
    public static void main(String[] args) {

        // Implementing comparator interface using regular expression

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(comparator.compare(4,2));

        // implementing the same in lambda
        Comparator<Integer> comparator1 = (Integer a, Integer b) -> {
            return a.compareTo(b);
        };
        System.out.println(comparator1.compare(1,3));
    }

}
