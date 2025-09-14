package ex_03_Literals;

public class Lab033_Char_Literals {

    public static void main(String[] args) {


        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()+
// char c = "A"; // "" == String = Bunch of Char

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space


        // Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("PramodDutta");
        System.out.println("Pramod" + new_line + "Dutta");
        System.out.println("Pramod\nDutta");
        System.out.println("Pramod"+ tab_line +"Dutta");
        System.out.println("Pramod"+ back_space +"Dutta");
        System.out.println("-------------");

        System.out.println("Hi, This is First Line"+ new_line +"This is Second Line \n This is Third Line");

        char a = 10;
        //ASCII ==These are limited numbers

        char ruppees = '₹';
        System.out.println(ruppees);

        char my_laugh_smily = '\u1f60';
        System.out.println(my_laugh_smily);

        char c11 = '\u1F60';

    }
}