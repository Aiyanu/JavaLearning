import java.util.*;

public class Main {
    public static void main(String[] args) {
        //HashMap

        HashMap<String,Double> map = new HashMap<>();

        map.put("apple",0.5);
        map.put("orange",1.0);
        map.put("pear",2.0);

//        map.remove("apple");
        if(map.containsKey("apple")){
            System.out.println(map.get("apple"));
        }
        else{
            System.out.println("Key not found");
        }

        System.out.println(map.containsValue(1.0));
        System.out.println(map.size());
        System.out.println(map);
        for(String key:map.keySet()){
            System.out.println(key+" : ₦"+map.get(key));
        }

    }
}