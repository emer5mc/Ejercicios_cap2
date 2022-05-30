
/*Ejercicio 2.33: Cree una calculadora del BMI que lea el peso del usuario en libras y la altura en pulgadas (o, si lo prefiere, el peso del
usuario en kilogramos y la altura en metros), para que luego calcule y muestre el índice de masa corporal del usuario*/



import java.util.Scanner;


public class Ejercicio6{
    

    public static void main(String[]arg){
        Scanner input=new Scanner(System.in);
        float w,h, c;
        
        System.out.print("Ingrese el peso en kilogramos: ");
        w=input.nextFloat();
        
        System.out.print("Ingrese la altura en metros: ");
        h=input.nextFloat();

        c=w/(h*h);

        
        if (c<18.5){
           System.out.print("El BMI es de Bajo Peso");
        }else if (c>=18.5 && c<25){
           System.out.print("El BMI es de Normal");
        } else if (c>=25 && c<30){
           System.out.print("El BMI es de Sobrepeso");
        } else if (c>=30){
           System.out.print("El BMI es Obeso");
        }    
    }
}