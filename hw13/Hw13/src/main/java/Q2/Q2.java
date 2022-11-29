package Q2;

import java.util.*;
import java.util.stream.Collectors;

public class Q2 {
    public Map<Integer, List<String>> groupByNumberOfCharacters(String[] input) {
        return new TreeMap<>(Arrays.stream(input).collect(Collectors.groupingBy(String::length)));
    }

    public Map<Integer, List<String>> groupByWithQuantity(String[] input) {
        Map<Integer, List<String>> output = groupByNumberOfCharacters(input);
        Set<Integer> keys = findAllKeys(output);
        for (Integer key : keys) {
            String quantity= "Quantity: " +(output.get(key).size());
            List<String> newList= output.get(key);
            newList.add(quantity);
            output.put(key,newList);
        }
        return output;
    }

    public static Set<Integer> findAllKeys(Map<Integer, List<String> > input) {
        Set<Integer> result;
        result = input.keySet();
        return result;
    }
}