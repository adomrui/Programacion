import java.util.Scanner;

public class Ej14t7 {
    /*. Escribe un programa que pida 8 palabras y las almacene en un array. A continuación,
    las palabras correspondientes a colores se deben almacenar al comienzo y las que no
    son colores a continuación. Puedes utilizar tantos arrays auxiliares como quieras. Los
    colores que conoce el programa deben estar en otro array y son los siguientes: verde,
    rojo, azul, amarillo, naranja, rosa, negro, blanco y morado.*/


    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palabra = new String[8];
        String[] color = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] colores = new String[color.length];
        String[] noColor = new String[4];
        int numColor = 0;
        int numNonColor = 0;

        System.out.println("Introduzca 8 palabras (vaya pulsando [INTRO] entre una y otra):");
        for (int i = 0; i < palabra.length-1; i++) {
            palabra[i] = sc.nextLine();
            if (!Colores(palabra[i], color)) {
                colores[numColor] = palabra[i];
                numColor++;
            } else {
                noColor[numNonColor] = palabra[i];
                numNonColor++;
            }
        }

        System.arraycopy(colores, 0, palabra, 0, numColor);
        System.arraycopy(noColor, 0, palabra, numColor, numNonColor);

        System.out.println("Las palabras son:");
        for (int i = 0; i < palabra.length ; i++) {
            System.out.println((i + 1) + " " + palabra[i]);
        }
    }

// Método para comprobar si una palabra es un color o no
    public static boolean Colores(String pal, String[] color) {
        for (int i = 0; i < color.length; i++) {
            if (color[i].equalsIgnoreCase(pal)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isColor(String word, String[] color) {
        for (int i = 0; i < color.length; i++) {
            if (word.equalsIgnoreCase(color[i])) {
                return true;
            }
        }
        return false;
    }
}
