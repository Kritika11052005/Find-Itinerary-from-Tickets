import java.util.*;
public class LeetCode {
    public static String getStart(HashMap<String,String>ticket){
        HashMap<String,String> revMap=new HashMap<>();
        for(String key:ticket.keySet()){
            revMap.put(ticket.get(key),key);
        }
        for(String key:ticket.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }

        }
        return null;
    }
    public static void main(String args[]){
        HashMap<String,String> map=new HashMap<>();
        map.put("CHENNAI","BENGALURU");
        map.put("MUMBAI","DELHI");
        map.put("GOA","CHENNAI");
        map.put("DELHI","GOA");
        String start=getStart(map);
        while(map.containsKey(start)){
            System.out.print(start+"->");
            start=map.get(start);

        }
        System.out.print(start);
        
    }
}

    

