import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MyMap {
    public static void main(String[] args) {
           String result="ICS1";
        Map<String,String> map=new HashMap<String,String>();
        map.put("ICS3", "Hii");
        map.put("ICS2", "Hello");
        map.put("ICS1", "Bye");
        
    
        Set<Entry<String, String>> entrySet=map.entrySet();
        for (Entry<String,String> entry : entrySet) {
            if(entry.getKey()==result){
                System.out.println(entry.getValue());
            }
        } 
    }
}
