package FunctionalInterfaces.ConsumerExample;

import java.util.function.Consumer;

public class ConsumerExample
{
    public static void main(String[] args) {

        // Consumer is a functional interface that accepts an input and returns an output after
        // performing any action

        // example 1:

        Consumer<String> s1 = (s) -> {
            System.out.println(s.toUpperCase());
        };

        Consumer<Integer> s2 = (val) -> {
            System.out.println(val.toString());
        };

        s1.accept("pranav");
        s2.accept(2002);

        Consumer<Cars> s3 = (car) -> {

        };
    }
}
