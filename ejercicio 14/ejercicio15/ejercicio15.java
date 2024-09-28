package ejercicio15;
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
Scanner leer=new Scanner(System.in);
int d, m, a;
System.out.println(" Introduzca el dia : ");
d=leer.nextInt();
System.out.println("Introduzca el mes : ");
m=leer.nextInt();
System.out.println(" Introduzca el año : ");
a=leer.nextInt();

if (d>0 && d<=30) {
    if (m>0 && m<=12) {
        if (a>=0 && a<2025) {
            System.out.println("La fecha "+d+ "-" +m+ "-" +a +" es correcta ");
        } else {
          System.out.println("NO"); 
        }
    } else {
        System.out.println("NO");
    }
} else {
    System.out.println("NO");
}



    }

}
