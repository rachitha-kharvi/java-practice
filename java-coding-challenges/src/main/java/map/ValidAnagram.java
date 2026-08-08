package map;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
//        String s = "anagram", t = "nagaram";
        String s = "rat", t = "car";
        Map<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) {
            System.out.println("Not a valid anagram");
        } else {
            for (Character ch : s.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            for (Character ch : t.toCharArray()) {
                if (!map.containsKey(ch)) {
                    System.out.println("Not a valid anagram");
                    return;
                }
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) < 0)
                    System.out.println("Not a valid anagram");
            }
            System.out.println("Anagram");
            map.forEach((k,v) -> System.out.println(k+"->"+v));

        }

    }

}
