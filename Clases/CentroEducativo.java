import java.util.Scanner;


public class CentroEducativo {

    private static final int MAXALUMNOS = 100 ;
    public static void main(String[] args) {
    
        int opcion ;
        Alumno[] alumnos = new Alumno[MAXALUMNOS] ;
        Scanner sc = new Scanner (System.in);
        do {
            
            menu() ;

            System.out.println("Opción? ") ;
            opcion = Integer.parseInt(System.console().readLine()) ;

        } while (opcion!=0) ;

    }

    /**
     * Muestra un menú en pantalla
     */
    public static void menu() {

        System.out.println("CENTRO EDUCATIVO HEDY LAMARR") ;
        System.out.println("============================") ;
        System.out.println("0. Salir") ;
        System.out.println("1. Introducir alumno") ;
        System.out.println("2. Modificar alumno *****") ;
        System.out.println("3. Buscar alumno por dni") ;
        System.out.println("4. Mostrar listado de alumnos") ;

    }

    /**
     * introducirAlumno:
     * Solicita los datos de un alumno, lo crea e introduce 
     * en el array.
     */
    public class Alumno {
        private String nombre;
        private String apellido;
        private int edad;
        
        public Alumno(String nombre, String apellido, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }
    
        // getters and setters here
    }
    
    public static void introducirAlumno(Alumno[] alumnos) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del alumno: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce el apellido del alumno: ");
        String apellido = scanner.nextLine();

        System.out.print("Introduce la edad del alumno: ");
        int edad = scanner.nextInt();

        int numAlumnos = 0;
        
        
        alumnos[numAlumnos] = alumnos;
        numAlumnos++;
    
        System.out.print("El estudiante se ha añadido correctamente.");

}

}


    
    /**
     * BuscarAlumno:
     * Solicita el DNI del alumno y lo busca en el array.
     * Si lo encuentra, muestra la información del alumno;
     * en otro caso, se indica que no se ha encontrado.
     */

    /**
      * mostrarListado :
      * Muestra un listado de todos los alumnos almacenados
      * en el array, separando cada uno de ellos por una 
      * línea.
      * 12345678A, Pedro Pérez, 18 años
      * ---------
      * 23456789B, Alicia Gutiérrez, 22 años
      */


