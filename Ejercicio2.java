//Ejercicio 2.26: Escriba una aplicación que lea dos enteros, determine si el primero es un múltiplo del segundo e imprima el resultado

import java.util.Scanner;

public class Ejercicio2{
    

    public static void main(String[]arg){
        Scanner input=new Scanner(System.in);
        int n2,n1, n;
        System.out.print("Ingrese el primer entero: ");
        n1=input.nextInt();
        System.out.print("Ingrese el segundo entero: ");
        n2=input.nextInt();

        n=n1 % n2;

        if(n==0){
            System.out.printf("El primer entero es multiplo del segundo ");
        }else{
            System.out.printf("El primer entero no es multiplo del segundo" );
        }

    }
}