package ejercicio17;
import java.util.Scanner;
public class ejercicio17 {
    public static void main(String[] args) {
Scanner leer=new Scanner(System.in);
int dia, mes, año;
System.out.println(" Introduzca un dia: ");
dia=leer.nextInt();
System.out.println(" Introduzca un mes: ");
mes=leer.nextInt();
System.out.println(" Introduzca un año: ");
año=leer.nextInt();

if (dia>=30) {
    dia=0;
    mes++;
    if (mes>=12) {
        mes=1;
        año++;
    }
}
if (año==0) {
   System.out.println(" Fecha erronea ");
} else {
    if (mes<0 || mes>=13) {
        System.out.println(" Fecha erronea ");
    } else {
        if (dia<0||dia>31) {
            System.out.println(" Fecha erronea ");
        } else {
            System.out.println(" El dia siguiente a su fecha es "+ (dia + 1)+"-"+mes+"-"+año);
        }
    }
}


    }
}
