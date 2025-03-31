import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> counter = new HashMap<>();
        String[] words = paragraph.toLowerCase()
        .replaceAll("[^a-z0-9]+", " ").split(" ");

        for(String word: words){
            if(!ban.contains(word)){
                if(!counter.containsKey(word)) counter.put(word, 1);
                else counter.replace(word, counter.get(word) + 1);
            }
        }

        return Collections.max(counter.entrySet()
        , Map.Entry.comparingByValue()).getKey();
    }
}