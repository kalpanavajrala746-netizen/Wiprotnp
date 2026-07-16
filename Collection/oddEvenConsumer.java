package Functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class oddEvenConsumer {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Consumer<Integer> c = n -> {
            if (n % 2 == 0)
                System.out.println(n + " even");
            else
                System.out.println(n + " odd");
        };

        list.forEach(c);
    }
}