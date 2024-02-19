

public class Persona {
    
    private String dni ;
    private String nombre = "John";
    private String apellido ="";
    private int edad;


    /*
     * Constructor de la clase
     */

    public Persona (){


    }

    /*
     * Segundo constructor que recibe únicamente el nombre
     * de la persona
     * @param nombre
     */
    public Persona(String nombre){
        this.nombre = nombre;
    }


}
