/* Ejercicio 2.13 Indique el orden de evaluación de los operadores en cada una de las 
siguientes instrucciones en Java, y muestre el valor de x después de ejecutar cada
 una de ellas:
 a) x = 7 + 3 * 6 / 2 – 1;
b) x = 2 % 2 + 2 * 2 – 2 / 2;
c) x = (3 * 9 * (3 + (9 * 3 / (3))));*/


public class Ejercicio9{
   
    public static void main(String[]arg){

        int x;
        x=7+3*6/2-1;
        System.out.println("x = 7 + 3 * 6 / 2-1 = "+x);
        x = 2%2+2*2-2/2;
        System.out.println("x = 2 % 2 + 2 * 2-2 / 2= "+x);
        x = (3 * 9 * (3 + (9 * 3 / (3))));
        System.out.println("x = (3 * 9 * (3 + (9 * 3 / (3))))= "+x);

    }
}