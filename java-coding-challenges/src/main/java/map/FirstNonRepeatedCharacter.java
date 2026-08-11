package map;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatedCharacter {
    public static void main(String args[]){
        String bankName="swiss";
        Map<Character,Integer> frequencyMap=new HashMap<Character,Integer>();
        for(Character ch: bankName.toCharArray()){
            frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1);
        }
        Character firstNonrepeated=frequencyMap.entrySet().stream().filter(entry -> entry.getValue() == 1).
                map(entry -> entry.getKey()).findFirst().orElse(null);
        System.out.println("\n"+firstNonrepeated);
        // direct using of string
        Character firstNonrepeatedChar= bankName.chars().mapToObj(c -> (char)c)
                .filter(ch -> frequencyMap.get(ch) == 1).findFirst().orElse(null);
        System.out.println(firstNonrepeatedChar);
        //using set
        Set<Character> set=new LinkedHashSet<Character>();
        for(Character ch: bankName.toCharArray()){
            if(!set.add(ch)){
                set.remove(ch);
            }
        }
        Character result=set.stream().findFirst().orElse(null);
        System.out.println(result);
    }
}
