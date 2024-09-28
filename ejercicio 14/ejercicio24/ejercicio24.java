package ejercicio24;
import java.util.Scanner;
public class ejercicio24 {
    public static void main(String[] args){
Scanner leer=new Scanner(System.in);
int num, par;
System.out.println(" Introduzca un numero: ");
num=leer.nextInt();
par=num%2;
while (num!=0) {
    par=num%2;
    if (par==0) {
        System.out.println(" ES PAR ");
    } else {
        System.out.println(" ES IMPAR ");
    }
    System.out.println(" Introduzca otro numero: ");
    num=leer.nextInt();
}
}
}
