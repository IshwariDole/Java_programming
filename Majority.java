import java.util.*;
public class Majority{
    public static void main(String args[]){
          int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
          HashMap<Integer,Integer>map=new HashMap<>();

          for(int num:arr){
           map.put(num,map.getOrDefault(num,0)+1);
          }

          for(int key:map.keySet()){
            if(map.get(key)>arr.length/2){
                System.out.println(key);
            }
          }
    }
}