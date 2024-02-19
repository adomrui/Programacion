import java.util.Scanner;

public class Ej09t7 {

/*Realiza un programa que pida 8números enteros yq ueluegomuestreesosnúmeros
 juntoconlapalabra“par”o“impar”segúnproceda. */


public static void main(String[] args) {
    int [] numeros = new int[8];
    String parImpar;  
    Scanner sc =new Scanner(System.in);
    System.out.println("Introduce los 8 números pulse [INTRO] después de cada número:");
    for (int i=0 ; i<numeros.length ;i++){
        numeros[i] = sc.nextInt();
}
for (int i = 0; i < numeros.length; i++) {
    if (numeros[i]%2 != 0) {
        System.out.println(numeros[i]+" Es impar");
    }else {
        System.out.println(numeros[i]+" Es par");
    }
        
    }
}
}
