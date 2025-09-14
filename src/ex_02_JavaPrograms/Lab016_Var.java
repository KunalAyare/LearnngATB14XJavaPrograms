package ex_02_JavaPrograms;

public class Lab016_Var {

    public static void main(String[] args) {


    // byt age = 128; //out of range

    int age = 128;
    age = age+1;
    age = 76;
        /*In Java, you can assign a new value to the same variable as many times as you want,
         as long as the value is compatible with the variable’s type (int here).
        Only the latest assigned value is kept; earlier values are lost unless you saved them elsewhere.*/

        System.out.println(age);

    }

}
