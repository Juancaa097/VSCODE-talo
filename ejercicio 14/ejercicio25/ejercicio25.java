package ejercicio25;
import java.util.Scanner;
public class ejercicio25 {
    public static void main(String[] args){
Scanner leer=new Scanner(System.in);
int num, cont;
cont=1;
System.out.println( " Introduzca un numero: ");
num=leer.nextInt();
while (num>=0) {
    cont ++;
    System.out.println(" Introduzca otro numero: ");
    num=leer.nextInt();

}
System.out.println(" Se han dicho "+cont+ " numeros ");



    }
}
