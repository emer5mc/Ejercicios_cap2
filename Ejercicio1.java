
/* Ejercicio 2.25 Escriba una aplicación que lea un entero y que determine e
imprima si es impar o par 
*/

import java.util.Scanner;

public class Ejercicio1{
    

    public static void main(String[]arg){
        Scanner input=new Scanner(System.in);
        int n,n1;

        System.out.print("Ingrese un entero: ");
        n=input.nextInt();
        n1=n % 2;

        if(n1==0){
            System.out.printf("El entero  %d es un numero par", n);
        }else{
            System.out.printf("El entero  %d es un numero impar", n);
        }


    }
}