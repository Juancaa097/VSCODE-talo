package ejercicio18;
import java.util.Scanner;
public class ejercicio18 {
    public static void main(String[] args){
        int dia1, mes1, año1;
        int dia2, mes2, año2;
        int dias,aux;
Scanner leer=new Scanner(System.in);
System.out.println(" Introduzca un dia: ");
dia1=leer.nextInt();
System.out.println(" Intrduzca un mes: ");
mes1=leer.nextInt();
System.out.println(" Introduzca un año: ");
año1=leer.nextInt();
System.out.println(" Introduzca otro dia: ");
dia2=leer.nextInt();
System.out.println(" Introduzca otro mes: ");
mes2=leer.nextInt();
System.out.println(" Introduzca otro año: ");
año2=leer.nextInt();
dias=(dia2-dia1)+30*(mes2-mes1)+365*(año2-año1);
System.out.println(" Dias de diferencia: " + dias);

    }
}
