/* Ejercicio 2.16 Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga
los números del usuario y muestre el número más grande, seguido de las palabras es más grande. Si los números son
iguales, imprima el mensaje Estos números son iguales */

import java.util.Scanner;

public class Ejercicio10{
   
    public static void main(String[]arg){
        Scanner input=new Scanner(System.in);
        int n1, n2;
        System.out.print("Ingrese el primer entero: ");
        n1=input.nextInt();
        System.out.print("Ingrese el segundo entero: ");
        n2=input.nextInt();

        if (n1>n2){
            System.out.printf(n1+" es mas grande que "+n2);

        }else if(n1==n2){
            System.out.print("Son iguales");
        }else{
            System.out.printf(n1+" es mas pequeño que "+n2);
        }
    }
}