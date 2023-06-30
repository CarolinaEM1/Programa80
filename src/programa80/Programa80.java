// Desplazar una posicion en un arreglo


package programa80;

import java.util.Scanner;

/**
 *
 * @author Carolina EM
 */
public class Programa80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[] = new int[10];
        int ultimo;
        
        System.out.println("Llenando el arreglo:");
        for (int i=0;i<10;i++){
            System.out.print(i+". Digite un numero: ");
            arreglo[i] = teclado.nextInt();
        }
        
        ultimo =arreglo[9];
        
        for (int i=8;i>=0;i--){  // Avanzar una posicion abajo en el arreglo
            arreglo[i+1] = arreglo[i];
        }
        
        arreglo[0] = ultimo;
        
        System.out.println("\nEl nuevo arreglo es:");
        for (int i=0;i<10;i++){
            System.out.print(i+". Numero: "+arreglo[i]);
        }
    }
    
}
