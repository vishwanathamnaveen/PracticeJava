import java.util.HashMap;
import java.util.Map;

public class hashmap {
    
    
    public static void main(String ars[]){
        HashMap<Integer,String> hash=new HashMap<Integer,String>();
        hash.put(1,"p");
        hash.put(2,"a");
        hash.put(3,"e");
        for(Map.Entry<Integer,String> fd:hash.entrySet()){
            System.out.println(fd.getKey()+" she is "+fd.getValue());

        }


        
    }
}