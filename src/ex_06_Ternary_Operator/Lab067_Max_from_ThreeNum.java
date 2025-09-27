package ex_06_Ternary_Operator;

public class Lab067_Max_from_ThreeNum {

    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 10;
        int n3 = -11;

        //Logic Building Formula

        //Step 1 --> Find the input and output data type
        //input -->int --> n1, n2, n3;
        //output --> int --> max number or String we can message with max number;

        //Step2 --> Rough logic
        // n1>n2 && n1>n3;
        //n2>n3 ;
        //n3;

        //Step 3 -- Dry Run --program

        int max = (n1>n2) ? (n1 > n3) ?  n1 : n3 : (n2>n3) ?  n2 : n3 ;
        System.out.printf("Max is %d", max);


    }
}
