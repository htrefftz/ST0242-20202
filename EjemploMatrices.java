
/**
 * Write a description of class EjemploMatrices here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EjemploMatrices
{
    public static void ejemplo1() {
        int [][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 0}
        };
        // Sumar por columnas
        for(int col = 0; col < matriz[0].length; col++) {
            int acum = 0;
            System.out.print("Col: " + col + " ");
            for(int fila = 0; fila < matriz.length; fila++) {
                acum = acum + matriz[fila][col];
            }
            System.out.println(acum);
        }
        
    }
}
