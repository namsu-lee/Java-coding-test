package Chapter_03_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class programmers_42840 {
    public int[] solution(int[] answers) {
        int[] patternA = {1, 2, 3, 4, 5};
        int[] patternB = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] patternC = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] scores = new int[3];
        
        for(int i = 0; i < answers.length; i++){
            int answer = answers[i];
            
            if(answer == patternA[i % patternA.length]) scores[0]++;
            if(answer == patternB[i % patternB.length]) scores[1]++;
            if(answer == patternC[i % patternC.length]) scores[2]++;
        }
        
        int max = Arrays.stream(scores).max().getAsInt();
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < scores.length; i++){
            if(scores[i] == max) result.add(i + 1);
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
