package Dsa;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        String sentence = "the cat sat on the mat the cat and the dog sat";
        String[] words = sentence.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(String word: words){
            if(!word.isEmpty()){
                map.put(word,map.getOrDefault(word,0)+1);
            }
        }
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }
}
