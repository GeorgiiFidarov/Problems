import java.util.*;

class Solution {
    public static void main(String[] args) {
        String task = "aaabbboohhjjjjvfjfjfjjjjj";
        String noEquals = String.valueOf(removeEquals(task));
        System.out.println(noEquals);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<noEquals.length();i++){
            int inside=0;
            for (int j = 0; j<task.length();j++){
                if (noEquals.charAt(i)==task.charAt(j)){
                    inside++;//количество одинаковых переменных
                }
            }
            sb.append(inside==1 ? ""+noEquals.charAt(i) : inside+""+noEquals.charAt(i) );
        }
        System.out.println(sb);
    }
    public static StringBuilder removeEquals(String task){
        LinkedHashSet<String> cont = new LinkedHashSet<>();
        for (int i = 0; i < task.length(); i++){
            cont.add(String.valueOf(task.charAt(i)));
        }
        StringBuilder sb = new StringBuilder();
        for (String str:cont){
            sb.append(str);
        }
        return sb;
    }
}