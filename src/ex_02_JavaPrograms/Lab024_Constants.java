package ex_02_JavaPrograms;

//Final keyword it's used to make variable constant
public class Lab024_Constants {

    public static void main(String[] args) {

        int a = 10;
        a = 11;

        System.out.println(a);


        final  int b = 99;
       // b=100; Java can not assign a value to final variable b

        final float PI = 3.14f;
        final int c = 10;
    }
}
