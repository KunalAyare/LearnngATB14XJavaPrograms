package JAva_Practice_Task;

public class MultiplicationTablesNested13 {
    public static void main(String[] args) {
        for (int n = 1; n <= 5; n++) {
            System.out.println("Table of " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%2d x %2d = %3d%n", n, i, n * i);
            }
            System.out.println();
        }
    }
}
