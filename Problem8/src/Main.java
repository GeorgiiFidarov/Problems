public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow(32);//this is how getter works,helps us to gain data to variable.
        int CowAge = cow.Age;
        String CowColor = cow.printColor();
        String CowName = cow.printName();
        System.out.println(CowColor+" "+CowAge+" "+CowName);

        Whale whale = new Whale(88);
        int whaleAge = whale.Age;
        String b = whale.printName();
        String z = whale.printColor();
        System.out.println(whaleAge+" "+b+" "+z);

        whale.printAll();//both methods from extended in whale cow with Overwriting

        Cow whales = new Whale(32);
        String p = whales.printName();//кит
        System.out.println(p);
        Whale cows = new Whale(31);
        String l = whales.printName();
        System.out.println(l);
        //унаследованный не может быть подтипом наслденика
        //
        //type cast расширение типа.
        Cow cowards = new Whale(32);

        Cow whalez = new Cow(5);
        z = whalez.printName();
        System.out.println(z);

    }
}
