public class Horariocolor {
   
    public static void main(String[]arg){
        System.out.printf("\033[31m%-23s%-23s%-23s%-23s%23s%23s\n", "Hora", "Lunes" ,"Martes", "Miércoles", "Jueves", "Viernes") ;
        System.out.printf("\033[32m%-23s%-23s%-23s%-23s%23s%23s\n", "8:15-9:15", "Programación" ,"Programación", "S.I", "Base de Datos",  "S.I");
        System.out.printf("\033[33m%-23s%-23s%-23s%-23s%23s%23s\n","9:15-10:15", "Programación" ,"Programación", "S.I", "Base de Datos",  "S.I");
        System.out.printf("\033[34m%-23s%-23s%-23s%-23s%23s%23s\n","10:15-11:15", "Lenguaje de marcas" ,"Lenguaje de marcas", "S.I", "Entornos de Desarrollo",  "S.I");
        System.out.printf("\033[35m%-23s%-23s%-23s%-23s%23s%23s\n" ,  "11:15-11:45", "RE", "C", "R", "E", "O") ;
        System.out.printf("\033[36m%-23s%-23s%-23s%-23s%23s%23s\n","11:45-12:45", "Lenguaje de marcas" ,"Lenguaje de marcas", "Programación", "Entornos de desarrollo", "FOL");
        System.out.printf("\033[35m%-23s%-23s%-23s%-23s%23s%23s\n","12:45-13:45", "Base de Datos" , "Base de Datos", "Progrmación", "Programación", "FOL");
        System.out.printf("\033[37m%-23s%-23s%-23s%-23s%23s%23s\n","13:15-14:45", "Base de Datos" , "Base de Datos", "Entornos de Desarrollo", "Programación", "FOL");
        
    }
}
 
