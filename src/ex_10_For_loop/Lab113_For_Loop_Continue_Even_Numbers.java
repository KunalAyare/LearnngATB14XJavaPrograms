package ex_10_For_loop;

public class Lab113_For_Loop_Continue_Even_Numbers {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i); // 2, 4, 6, ... , 50
        }
    }
}
