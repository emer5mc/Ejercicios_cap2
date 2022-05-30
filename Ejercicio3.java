// Ejercicio 2.28: Escriba una aplicación que reciba del usuario el radio de un círculo como un entero, y que imprima el
// diámetro, la circunferencia y el área del círculo mediante el uso del valor de punto flotante 3.14159 para π. 
import java.util.Scanner;


public class Ejercicio3{
    

    public static void main(String[]arg){
        Scanner input=new Scanner(System.in);
        int r, d;
        float c, a;
        
        System.out.print("Ingrese el radio del circulo: ");
        r=input.nextInt();

        
        
        d=2*r;
        c=(float)Math.PI*r*2;
        a=(float)Math.PI*r*r;

        System.out.printf("El Diametro es %d%n", d);
        System.out.printf("La Circunferencia es "+ c);
        System.out.println("");
        System.out.printf("El Area es "+a);
      

    }
}