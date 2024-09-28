package ejercicio21;
import java.util.Scanner;
public class ejercicio21 {
    public static void main(String[] args) {
Scanner leer=new Scanner(System.in);
int num, d, u;
System.out.println(" Escriba un numero del 0 al 99: ");
num=leer.nextInt();
u=num%10;
d=num/10;

switch (d) {
    case 0:
        System.out.println("");
    case 1:
    System.out.println(" DIEZ ");
    break;
    case 2:
    System.out.println(" VEINTE ");
    break;
    case 3:
    System.out.println( " TREINTA ");
    break;
    case 4:
    System.out.println( " CUARENTA ");
    break;
    case 5:
    System.out.println( " CINCUENTA ");
    break;
    case 6:
    System.out.println( " SESENTA ");
    break;
    case 7:
    System.out.println( " SETENTA ");
    break;
    case 8:
    System.out.println( " OCHENTA ");
    break;
    case 9:
    System.out.println( " NOVENTA ");
    break;
} 
switch (u) {
    case 0:
        System.out.println("");
        break;
        case 1:
        System.out.println(" Y UNO ");
        break;
        case 2:
        System.out.println(" Y DOS ");
        break;
        case 3:
        System.out.println(" Y TRES ");
        break;
        case 4:
        System.out.println("Y CUATRO ");
        break;
        case 5:
        System.out.println(" Y CINCO ");
        break;
        case 6:
        System.out.println(" Y SEIS ");
        break;
        case 7:
        System.out.println(" Y SIETE ");
        break;
        case 8:
        System.out.println(" Y OCHO ");
        break;
        case 9:
        System.out.println(" Y NUEVE ");
        break;


    default:
        break;
}

}
    }

