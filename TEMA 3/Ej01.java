public class Ej01 {
    public static void main(String[] args) {
        
        int num1 ;
        int num2 ;
        int resultado;

        String linea ;

        System.out.println("Este programa multiplica dos números enteros.");
        System.out.print("Por favor introduzca el primer número:");
        
        linea = System.console().readLine();
        num1 = Integer.parseInt(linea);

        System.out.println("Este programa multiplica dos números enteros.");
        
        System.out.print(" Introduzca el segundo número:");
        linea = System.console().readLine();
        num2 = Integer.parseInt(linea);
        
        resultado = num1 * num2 ;
        //System.out.println(num1 +"*" + num2 + "=" + resultado);
        //Otra manera de dar el resultado
        System.out.printf("%d * %d =%d\n", num1, num2, resultado);
    }
}
