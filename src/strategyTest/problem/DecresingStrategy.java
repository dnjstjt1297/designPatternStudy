package strategyTest.problem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DecresingStrategy implements Strategy {

    @Override
    public List<String> sort(List<String> list) {
        List<String> result = new ArrayList<String>(list);

        result.sort(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                int len = Math.min(o1.length(), o2.length());
                int idx = 0;
                while(idx < len){
                    if(o1.charAt(idx) > o2.charAt(idx)){
                        return 1;
                    }
                    else if(o1.charAt(idx) < o2.charAt(idx)){
                        return -1;
                    }
                    idx++;
                }
                if(o1.length() > o2.length()){
                    return 1;
                }
                return 0;
            }

        });
        return result;
    }
}
