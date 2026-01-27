package classes;

import java.util.Arrays;

public class ArregloEquals {
    public static void main(String[] args) {

        /*
         * --Arreglos E
         * 
         * El metedo equals en arreglos como su nombre lo dice "ES IGUAL"
         * sirve para comparar si dos arreglos tienen el mismo contenido
         * 
         * 
         * Sintaxis:
         * 
         * Arrays.equals(arreglo1, arreglo2);
         * 
         * 
         * Devuelve verdadero si:
         * 
         * Tienen el mismo tamaño
         * Sus elementos son iguales
         * Están en el mismo orden
         * 
         * 
         * Si no es el caso devolvera falso.
         * 
         * 
         * Nota importante: El metodo equals olo sirve para arreglos 
         * de una dimensión
         * 
         * Ejemplo:
         * 
         * -->
         */
         
        // CASO VERDADERO
        int[] a = {1,2,3};
        int[] b = {1,2,3};

        System.out.println(Arrays.equals(a, b));


        //CASO FALSO
        int[] c = {3,2,1};
        
        System.out.println(Arrays.equals(a, c));

         
        // Otros tipos de casos 
        String[] palabras1 = {"Uno","Dos","Tres"};
        String[] palabras2 = {"Uno","Dos","Tres"};

        System.out.println(Arrays.equals(palabras1, palabras2));

    }

}
