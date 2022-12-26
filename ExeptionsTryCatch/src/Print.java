import java.math.BigInteger;
import java.util.*;

public class Print {
    public static final int MOD = (int) (1e9 * 7);
    List<Integer> cache = new ArrayList<>();

    {
        cache.add(0);
        cache.add(1);
    }

    private int fib(int n) {
        for (int i = cache.size(); i <= n; i++) {
            int res = (cache.get(i - 1) + cache.get(i - 2)) % MOD;
            cache.add(res);
        }
        return cache.get(n);
    }

    private void run(int n) {
        System.out.println(n + ": " + fib(n));
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new Print().run(100000);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " Milliseconds ");
    }





















    public static String encodingString(String s){
        StringBuilder encodedString = new StringBuilder();
        List<Character> listOfChars = new ArrayList<Character>();
        Set<String> removeRepeated = new HashSet<String>();
        //Adding characters of string to list
        for(int i=0;i<s.length();i++){
            listOfChars.add(s.charAt(i));
        }
        //Getting the occurance of each character and adding it to set to avoid repeated strings
        for(char j:listOfChars){
            String temp = Integer.toString(Collections.frequency(listOfChars,j))+Character.toString(j);
            removeRepeated.add(temp);
        }
        //Constructing the encodingString.
        for(String k:removeRepeated){
            encodedString.append(k);
        }
        return encodedString.toString();
    }
    private static String encoder(String sampleInput) {
        String encodedString = null;

        char[] charArr = sampleInput.toCharArray();
        char prev=(char)0;
        int  counter =1;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArr.length; i++) {

            if(i+1 < charArr.length && charArr[i] == charArr[i+1]){
                counter ++;
            }else {

                sb.append(counter + Character.toString(charArr[i]));
                counter = 1;
            }

        }
        return sb.toString();
    }
    public static String runLengthEncoding(String text) {
        String encodedString = "";

        for (int i = 0, count = 1; i < text.length(); i++) {
            if (i + 1 < text.length() && text.charAt(i) == text.charAt(i + 1))
                count++;
            else {
                encodedString = encodedString.concat(Integer.toString(count))
                        .concat(Character.toString(text.charAt(i)));
                count = 1;
            }
        }
        return encodedString;
    }
    static String encode(String s) {
        StringBuilder sb = new StringBuilder();
        char[] word = s.toCharArray();
        char current = word[0]; // We initialize to compare vs. first letter

        // our helper variables
        int index = 0; // tracks how far along we are
        int count = 0; // how many of the same letter we've seen

        for (char c : word) {
            if (c == current) {
                count++;
                index++;

                if (index == word.length)
                    sb.append(current + Integer.toString(count));
            }

            else {
                sb.append(current + Integer.toString(count));
                count = 1;
                current = c;
                index++;
            }
        }
        return sb.toString();
    }

}