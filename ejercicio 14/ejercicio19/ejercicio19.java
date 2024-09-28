package ejercicio19;
import java.util.Scanner;
public class ejercicio19 {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int h, m, s;
    System.out.println(" Introduzca una hora: ");
    h=leer.nextInt();
    System.out.println(" Introduza minutos: ");
    m=leer.nextInt();
    System.out.println(" Introduzca segundos: ");
    s=leer.nextInt();
    s ++;
        if (h<1 || h>24) {
            System.out.println(" Error ");
        } else {if (m<0 || m>60) {
            System.out.println(" Error ");
        } else {if (s<0 || s>60 ) {
            System.out.println(" Error ");
        } else { if (s>=60) {
            s=0;
            m ++;
        }
         if (m>=60) {
            m=0;
            h ++;
            if (h>=24) {
                h=0;
            }
            System.out.println(" Es "+h+":"+m+":"+s);
            }  
}           
}
}
}

}
