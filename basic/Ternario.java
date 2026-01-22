package basic;
import java.util.*;
public class Ternario {

    public static void main(String[] args) {

        Scanner ed = new Scanner(System.in);

        System.out.println("");
        System.out.println("--Operador Ternario--");
        System.out.println("");
        System.out.println("----Numero mayor a 10----");
        System.out.println("");

        System.out.println("Ingrese un numero: ");
        int n = ed.nextInt();

        String r = (n>=10) ? "Es mayor a 10 ": "Es menor a 10 ";

        System.out.println(r);

        ed.close();
    }
    
}
