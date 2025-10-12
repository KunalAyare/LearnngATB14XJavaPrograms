package JAva_Practice_Task;
public class Increment_Decrement {
    public static void main(String[] args) {
        int i = 5;

        System.out.println("Original: " + i);
        int preInc = ++i; 
        System.out.println("Pre-increment: " + preInc);
        
        int postInc = i++; 
        System.out.println("Post-increment: " + postInc + " (returned " + postInc + ")");
        
        int preDec = --i;
        System.out.println("Pre-decrement: " + preDec);
       
        int postDec = i--; 
        System.out.println("Post-decrement: " + postDec + " (returned " + postDec + ")");
        
        System.out.println("Final i: " + i);
        
    }
}

