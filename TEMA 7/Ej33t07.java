/*Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas
relleno con números aleatorios entre 200 y 300. A continuación, el programa debe 
mostrar los números de la diagonal que va desde la esquina superior izquierda a 
la esquina inferior derecha, así como el máximo, el mínimo y la media de los números
que hay en esa diagonal. */

public class Ej33t07 {
public static void main(String[] args) {
    int filas= 10 ;
    int columnas= 10 ;
    
    int numeros [][] = new int [filas][columnas]; //creamos el array
    int contador = 0;
    for (int i=0;i<numeros.length;i++) {//recorremos las filas
        for (int j=0;j< numeros[i].length;j++) {//recorremos solo las columnas hasta la fila actual
            System.out.print ((int) (Math.random() * 100)  +201 + " ");
            contador ++;
            if (contador == 10) {
                System.out.println("");
                contador = 0; 
            }
        }
    }
System.out.print("Diagonal desde la esquina superior izquierzda a la esquina superior derecha: " );
for (int i = 0; i < ; i++) {
    for (int j = 0; j < ; j++) {
        if (filas == columnas) {
            System.out.printf(" %d ", numeros[filas][columnas]);
        }
    }

}
}
}
