package ejercicio23;
import java.util.Scanner;
public class ejercicio23 {
    public static void main(String[] args) {
Scanner leer=new Scanner(System.in);
int num;
System.out.println(" introduzca un numero: ");
num=leer.nextInt();
while (num>0 || num<0) {
    if (num>0) {
        System.out.println(" ES POSITIVO ");
    } else {
        System.out.println(" ES NEGATIVO ");
    }
    System.out.println(" Introduzca otro numero: ");
    num=leer.nextInt();
}


    }
}
