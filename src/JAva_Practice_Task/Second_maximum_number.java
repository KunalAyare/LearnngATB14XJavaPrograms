package JAva_Practice_Task;

public class Second_maximum_number {
    public static void main(String[] args) {

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

        int high = Integer.MIN_VALUE;
        int Second_high = Integer.MIN_VALUE;

        // int a > high
        // second high = high
        //high = a
        for (int a : numbers)
        {
            if(a > high)
            {
                //if a is high than last high

                Second_high = high;

                //previous high is now second high

                high = a;

            } else if ( a < high  && a > Second_high) {

                Second_high = a;

                
            }

        }
        //System.out.println("high: " + high);
        System.out.println("Second_high: " + Second_high);
    }
}
