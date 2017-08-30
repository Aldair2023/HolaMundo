
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
        
        
        
        
    }
    
}
