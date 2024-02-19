import java.util.Scanner;

public class Ejercicio07t7 {


/*Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer valor
por el segundo en la lista generada anteriormente. Los números que se han cambiado
deben aparecer entrecomillados */


    public static void main(String[] args) {
        int numeros;
        int contador = 0 ;
        int [] cien ;
        cien = new int[100];
        int valorcam;
        int valorcam2;
        Scanner sc = new Scanner(System.in);
        do {
            numeros=(int)(Math.random() * 20 + 0 );
            System.out.printf("%d ",numeros);
            cien [contador] = numeros;
            contador++;
        } while (contador<100);
        System.out.println("\n¿Qué valores desea cambiar ?");
        valorcam = sc.nextInt();
        System.out.println("¿Y el otro valor que quieres cambiar?");
        valorcam2 = sc.nextInt();
    }
}
