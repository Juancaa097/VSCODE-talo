package ejercicio20;
import java.util.Scanner;
public class ejercicio20 {
    public static void main(String[] args) {
        int nota;
        Scanner leer=new Scanner(System.in);
        System.err.println(" Introduzca la nota ");
        nota=leer.nextInt();
        switch (nota) {
            case 1:
                System.out.println(" UNO ");
                break;
            case 2:
            System.out.println(" DOS ");
            break;
            case 3:
            System.out.println(" TRES ");
            break;
            case 4:
            System.out.println(" CUATRO ");
            break;
            case 5:
            System.out.println(" CINCO ");
            break;
            case 6:
            System.out.println(" SEIS ");
            break;
            case 7:
            System.out.println(" SIETE ");
            break;
            case 8:
            System.out.println(" OCHO ");
            break;
            case 9:
            System.out.println(" NUEVE ");
            break;
            case 10:
            System.out.println(" DIEZ ");
            break;
            default:
            System.out.println(" NO EXISTE ");
            break;
            
        }
    }
}
