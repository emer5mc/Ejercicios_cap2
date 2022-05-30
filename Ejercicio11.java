/* ) Escriba una aplicación que reciba tres enteros del usuario y muestre la suma,
promedio, producto, menor y mayor de esos números
*/
import java.util.Scanner;
public class Ejercicio11{
    

    public static void main(String[]arg){
        Scanner input=new Scanner(System.in);
        int n1,n2,n3, s, m, p;
        
        System.out.print("Ingrese el primer entero: ");
        n1=input.nextInt();

        System.out.print("Ingrese el segundo entero: ");
        n2=input.nextInt();

        System.out.print("Ingrese el tercer entero: ");
        n3=input.nextInt();

        s=n1+n2+n3;
        m=n1*n2*n3;
        p=s/3;

        System.out.println("La suma es "+s);
        System.out.println("El producto es "+m);
        System.out.println("El promedio es "+p);

        if(n1>n2 && n1>n3){
            System.out.printf("El mayor es "+n1);
        }else if (n2>n1 && n2>n3){
            System.out.printf("El mayor es "+n2);
        }else if (n3>n1 && n3>n2){
            System.out.printf("El mayor es "+n3);
        }else{
            System.out.print("No hay un número mayor");
        }

    }
}