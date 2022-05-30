
/*Ejercicio 2.30: Escriba una aplicación que reciba del usuario un número compuesto por cinco dígitos, 
que separe ese número en sus dígitos individuales y los imprima, 
cada uno separado de los demás por tres espacios. */



import java.util.Scanner;


public class Ejercicio4{
    

    public static void main(String[]arg){
        Scanner input=new Scanner(System.in);
        int n, lon;
        String n1;
        char c;
        
        System.out.print("Ingrese un entero de 5 digitos ");
        n=input.nextInt();
        n1= Integer.toString(n);
        lon= n1.length();
        
        if (lon==5){
            for( int x=0; x<lon; x++){
                c=n1.charAt(x);
                System.out.print(c);
                System.out.print(" ");
            }
        }else{
           System.out.printf("El entero que ingreso tiene: %d digitos", lon); 
        }    
    }
}