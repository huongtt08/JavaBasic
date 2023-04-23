package BT4_VonglapForvaMang;

public class Mang {
    public static void main(String[] args) {
        int mang[] = new int[50];
        int position = 0;

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                mang[position] = i;
                position++;

            }
        }
        for (int i : mang) {
            System.out.println(i);
        }

    }
}
