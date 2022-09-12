import java.util.Map;
import java.util.TreeMap;


public class StudentMarkList {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> markList = new TreeMap<Integer, Integer>();
        markList.put(121,35);
        markList.put(132,40);
        markList.put(183,67);
        markList.remove(121);

        for(Map.Entry data: markList.entrySet()){
            System.out.println("Key : "+data.getKey()+" Value : "+data.getValue());
        }

    }
}
