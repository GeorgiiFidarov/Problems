package org.stepik;

import java.util.Arrays;

/**
 * something about try catch and ETC
 */
public class Problem1 implements RobotConnectionManager,RobotConnection{
    public static void main(String[] args) {
        for (int i=1; i<=3; i++) {
            String connect = String.valueOf(getConnection());
            System.out.println(connect);
            Problem1 close = new Problem1();
            String closed = close.close();
            if (connect.equalsIgnoreCase("connected")){
                System.out.println("goTo"+ Arrays.
                        toString(moveRobotTo(7, 2)));
            }try {
                System.out.println(closed);
            }catch (RobotConnectionException e){
                if (i==2)throw new RobotConnectionException("boom");

            }
        }
         /*
        for(int i = 0; i < 3; i++) {
            try(org.stepik.RobotConnection robotConnection = org.stepik.RobotConnectionManager.getConnection())
            {
                int[]a = moveRobotTo(3, 2);
                System.out.println(Arrays.toString(a));
                i = 3;
            } catch (org.stepik.RobotConnectionException e) {
                if (i == 2) throw new org.stepik.RobotConnectionException("error");
            }
        }
        */
    }
    public static RobotConnection getConnection() {
        return null;
    }
    public static int[] moveRobotTo(int x, int y){
        return new int[]{x, y};
    }
    public String close() {
        return "disconnected";

    }

}


