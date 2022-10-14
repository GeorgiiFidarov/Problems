class Solution{
    public interface Fly {
        void fly();
    }
    public interface Climb{
        void climb();
    }
    public interface Run{
        void run();
    }
}
class Cats implements Solution.Climb {
    @Override
    public void climb(){

    }

}
class Dog implements Solution.Run{
    @Override
    public void run() {

    }
}
class Duck implements Solution.Fly{
    @Override
    public void fly() {

    }
}