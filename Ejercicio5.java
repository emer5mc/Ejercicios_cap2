// Ejercicio 2.31: Escriba una aplicación que calcule los cuadrados y cubos de los números del 0 al 10, 
//y que imprima los valores resultantes en formato de tabla

public class Ejercicio5{
    public static void main(String[]arg){
        int n2, n3;
        
        System.out.println("Numero    Cuadrado    Cubo ");
        
            for( int x=0; x<=10; x++){
                if (x<=3){
                    System.out.printf(Integer.toString(x));
                    n2=x*x;
                    n3=x*x*x;
                    System.out.printf("         %d", n2);
                    System.out.printf("                 %d%n", n3);
                }else if (x>3 && x<=9){
                    System.out.printf(Integer.toString(x));
                    n2=x*x;
                    n3=x*x*x;
                    System.out.printf("        %d", n2);
                    System.out.printf("                %d%n", n3);
                }else{
                    System.out.printf(Integer.toString(x));
                    n2=x*x;
                    n3=x*x*x;
                    System.out.printf("      %d", n2);
                    System.out.printf("               %d%n", n3);
                }
            }   
    }
}