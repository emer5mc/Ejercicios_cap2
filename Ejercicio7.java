/* Ejercicio 3.34 Use Web para determinar la población mundialactual y la tasa de crecimiento 
anual de la población mundial. Escriba una aplicación que reciba estos valores como
entrada y luego muestre la población mundial estimada después de uno, dos, tres, cuatro y cinco años.*/ 

public class Ejercicio7{
    public static void main(String[]arg){
        double t=0.01;
        long p;
        p=7950348367L;
        System.out.println("La poblacion actual en el 2022 es de "+ p+ " personas");
        System.out.println("La tasa de crecimiento anual es de: "+ t*100+"%");

        for(int x=3; x<=7; x++){
            p=p+p/100;
            System.out.println("La poblacion en el 202"+x+ " sera de "+p+" personas");  
        }
    }
}