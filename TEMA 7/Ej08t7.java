import java.util.Scanner;

public class Ej08t7 {


    /*Realizaunprogramaquepidalatemperaturamediaquehahechoencadamesdeun
determinadoañoyquemuestreacontinuaciónundiagramadebarrashorizontales
conesosdatos. Lasbarras del diagrama se pueden dibujarabasedeasteriscoso
 cualquierotrocarácter. */
public static void main(String[] args) {

 String []meses  = {"enero", "febrero","marzo", "abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
 int [] temperaturas = new int[12];
 Scanner sc =new Scanner(System.in);
 for (int i = 0; i < temperaturas.length; i++) {
    System.out.print("Ingrese la temperatura media de " +meses[i]+": ");
    temperaturas[i]=sc.nextInt();
}

for (int b = 0; b < meses.length; b++) {
    System.out.print(meses[b]+" | ");
    for (int i = 0; i < temperaturas[b]; i++) {
        System.out.print(" *" );
    }
    System.out.println();
}

}
}
