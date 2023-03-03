import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create ArrayDeque by name queue
 * in any way known to you and push the
 * following four numbers 2, 0, 1, 7 .
 -------------------------------------------------------
 * The code for displaying the queue is already written.
 */
public class problem01 {
    public static void main(String[] args) {
        String s = "abBAcC";
        String a = "LeEeetCode";
        System.out.println(remover(s));
    }
    public static String remover(String s){
        StringBuilder sb = new StringBuilder(s);
        while (sb.length()>1){
            boolean find = false;
            for (int i = 0; i<sb.length()-1;i++){
                if (Math.abs(sb.charAt(i)-sb.charAt(i+1))==32){
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i);
                    find=true;
                    break;
                }
            }
            if (!find){
                break;
            }
        }
        return sb.toString();
    }
}