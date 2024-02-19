import clases.Agenda;
import clases.Contacto;

/** 
 * Aplicación Agenda de Contactos
 * (INCOMPLETA: EN DESARROLLO)
 * 
 * @author Antonio J. Sánchez
 * @author José David Quero
 */
public class AgendaContactos {

    /**     
     * @param args
     */
    public static void main(String[] args) {

        int numero ;
        int opcion ;
        Agenda agenda = new Agenda() ; 

        do {

            menu() ;
            opcion = Integer.parseInt(System.console().readLine()) ;

            switch(opcion) {

                // CREAR CONTACTO
                case 1:
                    if (agenda.esLlena()) {
                        System.out.println("La agenda está completa. No se admiten más contactos.");
                    } else {
                        nuevoContacto(agenda); 
                    }
                    break ;
                
                // EDITAR CONTACTO
                case 2:
                    
                   editarContacto(agenda) ;
                    break ;

                // BUSCAR POR DNI
                case 4:
                    buscarContactoDni(agenda) ;
                    break ;

                // LISTAR CONTACTOS
                case 7:
                    System.out.println("LISTADO DE CONTACTOS DE LA AGENDA\n=================================");
                    agenda.listar() ; 
                    break ;
            }

        } while(opcion!=0) ;

        
    }

    /**
     * Muestra el menú de la aplicación
     */
    private static void menu() {

        System.out.println("\n\n") ;
        System.out.println("0. Salir") ;
        System.out.println("1. Introducir contacto") ;
        System.out.println("2. Modificar contacto") ;
        System.out.println("3. Borrar contacto") ;
        System.out.println("4. Buscar por DNI") ;
        System.out.println("5. Buscar contenido (by Juanfran)") ;
        System.out.println("6. Buscar por nombre") ;
        System.out.println("7. Listar contacto") ;

        System.out.print("Opcion? ") ;
    }


    /**
     * Añade un nuevo contacto a la agenda
     * @param agenda
     */
    private static void nuevoContacto(Agenda agenda) {

        String dni ;
        String nombre ;
        String apellido ;        
        Contacto contacto ;

        System.out.print("DNI: ") ;
        dni = System.console().readLine() ;

        System.out.print("Nombre: ") ;
        nombre = System.console().readLine() ;

        System.out.print("Apellido: ") ;
        apellido = System.console().readLine() ;
        
        
        contacto = new Contacto(dni, nombre, apellido) ;
        agenda.crear(contacto) ;

    }


    /**
     * Solicita dni, busca y muestra un contacto
     * @param agenda
     */
    private static void buscarContactoDni(Agenda agenda) {

        String dni ;
        Contacto contacto ;

        System.out.print("DNI: ") ;
        dni = System.console().readLine() ;
        
        contacto = agenda.buscarPorDni(dni) ;

        if (contacto!=null) { 
            System.out.println(contacto); 
        } else { 
            System.out.println("No se ha encontrado el contacto."); 
        }
    }

    private static void editarContacto(Agenda agenda) {

        int numero ;
        Contacto contacto ;

        System.out.println("Nº del contacto a editar: ") ;
        numero = Integer.parseInt(System.console().readLine()) ;

        if (numero > agenda.total()) { 
            System.out.println("El contacto no existe.") ;
        } else {

            // buscamos el contacto
            contacto = agenda.buscarPorId(numero) ;

            // mostramos el contacto
            System.out.println(contacto + " - Edad: " + contacto.getEdad()) ;

            // solicitar datos del contacto
            System.out.print("DNI: ") ;
            contacto.setDni(System.console().readLine()) ;
    
            System.out.print("Nombre: ") ;
            contacto.setNombre(System.console().readLine()) ;
    
            System.out.print("Apellido: ") ;
            contacto.setApellido(System.console().readLine()) ;

            System.out.print("edad: ") ;
            contacto.setEdad(System.console().readLine()) ;

            agenda.actualizar(contacto); 

            // SEGUIMOS POR AQUÍ
            // PREGUTA PACO: NO TENER QUE PEDIR DOS VECES LA MISMA INFORMACIÓN


        }

    }

}
