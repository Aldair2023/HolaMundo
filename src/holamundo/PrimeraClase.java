
package holamundo;

import java.util.Scanner;


public class PrimeraClase {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        int x,y, suma;
        System.out.println("ingrese el primer numero");
        x=Integer.parseInt(lea.next());
        System.out.println("ingrese el segundo numero");
        y=Integer.parseInt(lea.next());
        
        suma = x+y;
        System.out.println("la suma es: "+suma);
        
        
        double n1, n2, n3, prom;
        System.out.println("ingrese la primera nota: ");
        n1=Double.parseDouble(lea.next());
        System.out.println("ingrese la segunda nota: ");
        n2=Double.parseDouble(lea.next());
        System.out.println("ingrese la tercera nota: ");
        n3=Double.parseDouble(lea.next());
        
        prom=(n1+n2+n3)/3;
        
        System.out.println("el promedio de notas fue de: "+prom);
        
        
    }
    
}
