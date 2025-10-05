package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {

        non_return_type_function();

        String name = return_string_type_function();
        System.out.println(name);

        return_boolean();
        return_float();
        return_byte();
        return_long();
    }

    static void non_return_type_function()
    {
        // this is block of code
        System.out.println("Hi, there, No Return function!");
    }
    //Return Type - Which return a data type (int, String, char, boolean, float)
    static String return_string_type_function()
    {
        // this is block of code
        System.out.println("Hi, there, I will return something");
        return "Kunal";
    }
    static boolean return_boolean(){
        return true;

    }
    static float return_float(){
        return 3.45f;

    }
    static byte return_byte(){
        return 100;

    }
    static long return_long(){
        return 65425666l;

    }


    }

