package StringJoinerClass;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerExample1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hyderabad");
        list.add("Chennai");
        list.add("Bangalore");
        list.add("Mumbai");
        
        // Specifying comma as delimiter, { as prefix, and } as suffix
        StringJoiner sj = new StringJoiner(",", "{", "}");
        
        for (String s : list) {
            sj.add(s);
        }
        
        System.out.println(sj);
    }
}
