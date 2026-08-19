package streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCountEachWord {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "apple",
                "banana",
                "apple"
        );
        names.stream().forEach( word -> {
            Map<Character,Long> charCount=word.chars().
                    mapToObj(c -> (char)c).
                    collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
            String result=charCount.entrySet().stream().map(r-> r.getKey() + "-"+r.getValue())
                    .collect(Collectors.joining(","));
            System.out.println(result);
        });
       /* Map<String,Long> map=names.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println(map);*/
    }
}
