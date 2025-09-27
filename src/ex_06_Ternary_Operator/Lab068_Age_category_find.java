package ex_06_Ternary_Operator;

public class Lab068_Age_category_find {

    public static void main(String[] args) {

            String userInput = args[0]; //12
        System.out.println(userInput);

        //input String
        //String int
        int age = Integer.parseInt(userInput);

        String result = (age < 18) ? "Minor" : (age < 60) ? "Adult" : "Sr. Citizen" ;
        System.out.println(result);


    }
}
