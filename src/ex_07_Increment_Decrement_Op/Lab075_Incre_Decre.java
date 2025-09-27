package ex_07_Increment_Decrement_Op;

public class Lab075_Incre_Decre {

    public static void main(String[] args) {

        int a =10;

        System.out.println(a++ + ++a);
        System.out.println(a);

        //a = 10;
        // a++ = 10;
        // now a = 11
        // ++a = 11+1 = 12
        //now a++ + ++a = 10 + 12
    }
}
