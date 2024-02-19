public class Ej10t7 {
public static void main(String[] args) {
    
    int numero [] = new int[20];
    
    for (int i = 0; i < numero.length; i++) {
        numero[i]=(int)(Math.random()*100)+1;
        System.out.print(numero[i]+" ");
    }
    int [] segundo =new int[20];
    for (int i = 0; i < numero.length; i++) {
        if (numero[i]%2==0) {
            segundo[i] = numero[i];
        }else {
            segundo [segundo.length - 1 -i] = numero [i];
        }
    }
    for (int i = 0; i < segundo.length; i++) {
        System.out.println(segundo[i]);
    }
}
}
