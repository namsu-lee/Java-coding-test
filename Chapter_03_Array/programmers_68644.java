package Chapter_03_Array;

import java.util.*;

public class programmers_68644 {
    public int[] solution(int[] numbers) {
        Set<Integer> deduplicate = new HashSet<>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                deduplicate.add(numbers[i] + numbers[j]);
            }
        }
                
        return deduplicate.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
