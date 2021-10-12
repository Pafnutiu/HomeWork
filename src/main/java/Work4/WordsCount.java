package Work4;

import java.util.HashMap;
import java.util.Map;

public class WordsCount {
    private String[] words;

    public WordsCount(String[] words){this.words = words;}

    public void findWordsInArray() {
        HashMap<String, Integer> myWords = getMapWords(words);
        for (Map.Entry entry: myWords.entrySet()){
            System.out.println(entry.getKey());
        }
    }

    private HashMap<String, Integer> getMapWords(String[] words){
        HashMap<String, Integer> myWords=new HashMap<>();
       for (int i=0; i< words.length; i++){
           if (myWords.containsKey(words[i])){
               myWords.put(words[i],myWords.get(words[i])+1);
           }
           else {
               myWords.put(words[i], 1);
           }
       }
       return myWords;
    }
}







