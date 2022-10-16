package org.stepik;

public interface RobotConnection extends AutoCloseable{
    static int[] moveRobotTo(int x, int y){
        return null;
    }
    @Override
    String close();
}
