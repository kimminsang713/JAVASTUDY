package stream;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static List<Integer> strToIntList(List<String> strList){
        List<Integer> intList = new ArrayList<>();

        for(String value:strList){
            intList.add(Integer.parseInt(value));
        }
        return intList;
    }
}
