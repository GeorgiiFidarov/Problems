class Whale extends Cow {
    public Whale(int cowAge) {
        super(cowAge);
    }
    @Override
    public String printName() {
        return "I am not Cow, I am Whale";
    }
}
