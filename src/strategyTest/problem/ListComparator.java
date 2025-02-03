package strategyTest.problem;

import java.util.ArrayList;
import java.util.List;

public class ListComparator {
    private List<String> list;
    private Strategy strategy;

    public ListComparator(List<String> list, Strategy strategy) {
        this.list = list;
        this.strategy = strategy;
    }

    public void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public List<String> comparator() {
        return strategy.sort(list);
    }

}
