package map;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;

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

    }
}
