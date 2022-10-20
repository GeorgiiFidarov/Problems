import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
    /**
     * Create TreeSet by name set in any way known
     * to you and fill it with the following three
     * strings "Gamma", "Alpha", "Omega".

     * The code for displaying the set is already written.

     * Sample Input:

     * Sample Output:

     * [Alpha, Gamma, Omega]
     */
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        set.add("Gamma");
        set.add("Alpha");
        set.add("Omega");
        System.out.println(set);
    }
}
