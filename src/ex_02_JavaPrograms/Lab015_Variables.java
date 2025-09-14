package ex_02_JavaPrograms;

public class Lab015_Variables {

    public static void main(String[] args) {

        int a =10;
        a =65+1;
        System.out.println(a);

        /*Why?
            In Java, when you assign a new value to a variable, the old value gets replaced.
            First a was 10, but then a = 65 + 1 reassigns it to 66.
            So the final value printed is 66*/
    }
}
