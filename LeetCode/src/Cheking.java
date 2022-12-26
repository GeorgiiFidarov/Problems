import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

class Solution {
    public static boolean canIWin(int maxChoosableInteger,int desiredTotal){
        if (((1+maxChoosableInteger)*maxChoosableInteger )/2<desiredTotal)return false; //победа второго
        if (    desiredTotal<=0) return true;//победа первого
        HashMap<Integer,Boolean> map = new HashMap<>();//задали хэшмап былят
        return helper(maxChoosableInteger,0,desiredTotal,map);
    }
    public static boolean helper(int max,int state,int total,HashMap<Integer,Boolean>map){
        if (total<=0)return false;
        if (map.containsKey(state))return map.get(state);
        for (int i = 0; i < max; i++) {
            if((state&(1<<i))==0){
                int t = state|(1<<i);
                if(!helper(max,t,total-(max-i),map)){
                    map.put(state,true);
                    return true;
                }
            }
        }
        map.put(state,false);
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));

    }
    public static boolean isIsomorphic(String s,String t){
        Integer[] z1 = new Integer[s.length()];
        Integer[] z2 = new Integer[t.length()];
        for (int i = 0;i<s.length();i++){
            z1[i] = (int) s.charAt(i);
        }
        System.out.println(Arrays.toString(z1));
        for (int i = 0;i<t.length();i++){
            z2[i] = (int) t.charAt(i);
        }
        System.out.println(Arrays.toString(z2));
        Map<Integer,Long> map1 = Arrays.stream(z1).collect(groupingBy(Function.identity(),counting()));
        Map<Integer,Long> map2 = Arrays.stream(z2).collect(groupingBy(Function.identity(),counting()));
        return map1.values().equals(map2.values());

        //System.out.println(map1.values()+" : "+map2.values());

//        for (Map.Entry<Integer,Long> entry1:map1.entrySet()){
//            System.out.println(entry1+" first");
//        }
//        for (Map.Entry<Integer,Long> entry2:map2.entrySet()){
//            System.out.println(entry2+" second");
//        }
    }
    public static int pivotIndex(int[] nums) {
        int sum = 0, leftSum = 0;
        for (int x = 0;x< nums.length;x++){
            sum += nums[x];//подсчитаем всю сумму
            System.out.println(sum);
        }
        for (int i = 0; i < nums.length; ++i) {
            if (leftSum == sum - leftSum - nums[i]) return i;
            System.out.println(leftSum+" == "+ sum + " - "+ leftSum + " - "+nums[i]);
            leftSum += nums[i];
        }
        return -1;
    }
    public static void testMap(Map<Integer,String> map){
        map.put(84,"Игорь");
        map.put(74,"Коля");
        map.put(34,"Зоя");
        map.put(56,"Дима");
        map.put(71,"Дима");
        System.out.println(map.entrySet());
        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}