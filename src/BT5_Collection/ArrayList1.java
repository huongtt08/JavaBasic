package BT5_Collection;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();

        for (int i = 0; i < 51; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                number.add(i);
            }
        }
    }
}


