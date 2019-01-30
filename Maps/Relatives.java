import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Relatives {

    private Map<String, Set<String>> map;

    public Relatives() {
        map = new TreeMap<String, Set<String>>();
    }

    public void add(String person1, String person2) {
        Set<String> relativeSet;
        if(map.containsKey(person1))
            relativeSet = map.get(person1);
        else
            relativeSet = new TreeSet<>();
        relativeSet.add(person2);
        map.put(person1, relativeSet);
    }

    public String toString() {
        String output = "";
        for(String s : map.keySet()) {
            output+= s + " is related to ";
            for(String r : map.get(s)) {
                output += r + " ";
            }
            output += "\n";
        }
        return output;
    }
}