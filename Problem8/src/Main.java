public class Main {
    public static void main(String[] args) {
    }
    public static interface Worker {
        public void workLazy();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static interface Secretary {
        public void workLazy();
    }

    public static interface Miner {
        default void workVeryHard(){}
    }


}
