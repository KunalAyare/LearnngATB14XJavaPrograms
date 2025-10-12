package JAva_Practice_Task;

public class PrecedenceAndCasting5 {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.5;

        int expr = a + (int)(b * 2) + 3;

        int result = (a + 2) * 1 + (int)b + 10 - (4 / 2);
        System.out.println("Expression result: " + result);


        double implicit = a + b / 2;

        double implicitExample = a + b;
        System.out.println("Implicit casting: " + implicitExample);


        int explicit = (int) b + 10 - 0;
        System.out.println("Explicit casting: " + explicit);
    }
}
