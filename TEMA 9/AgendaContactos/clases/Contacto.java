package clases;

/** 
 * Aplicación Agenda de Contactos
 * (INCOMPLETA: EN DESARROLLO)
 * 
 * @author Antonio J. Sánchez
 * @author José David Quero
 */

public class Contacto {

    private String dni ;
    private String nombre ;
    private String apellido ;
    private int edad ;

    public Contacto() { }

    /**     
     * @param dni
     * @param nombre
     * @param apellido
     */
    public Contacto(String dni, String nombre, String apellido) { 
        this.dni = dni ;
        this.nombre = nombre ;
        this.apellido = apellido ;
    }

    public String getDni() {
        return this.dni ;
    }

    public void setDni(String dni) {
        this.dni = dni ;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre ;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad ;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**     
     */
    @Override
    public String toString() {        
        return this.dni + " - " + this.nombre + " " + this.apellido ;
    }

    
}
