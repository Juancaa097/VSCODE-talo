package ejercicio22;
import java.util.Scanner;
public class ejercicio22 {
    public static void main(String [] args){
Scanner leer=new Scanner(System.in);
int num, resultado;
System.out.println(" Introduzca un numero: ");
num=leer.nextInt();
while (num>=0) {
    resultado=(num*num);
    System.out.println( num+"² es:" +resultado );
    System.out.println(" Introduzca otro numero ");
    num=leer.nextInt();
}
    }
}
