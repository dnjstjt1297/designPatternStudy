package strategyTest.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D","B","C","E","A");

        ListComparator lc = new ListComparator(list, new DecresingStrategy());
        List<String> dl = lc.comparator();
        lc.changeStrategy(new IncresingStrategy());
        List<String> il = lc.comparator();

        System.out.println(il.toString());
        System.out.println(dl.toString());


    }
}
