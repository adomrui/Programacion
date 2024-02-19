import java.util.Scanner;

public class notaexamen {

    public static void main(String[] args) {
        
        float  nota ;
        Scanner entrada= new Scanner(System.in) ;
        System.out.print("Dime tu nota porfavor");
    
        if(nota>=5) {
            System.out.println("Has aprobado");
        }
        else {
            System.out.println("Has supendido, lo siento");
        }
    }
}
