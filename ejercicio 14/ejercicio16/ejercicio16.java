package ejercicio16;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args){
int dia,mes,año;
        Scanner leer=new Scanner(System.in);
System.out.println(" Introduce el dia: ");
dia=leer.nextInt();
System.out.println(" Introduce el mes: ");
mes=leer.nextInt();
System.out.println(" Introduce el año: ");
año=leer.nextInt();
if (año==0) {
    System.out.println(" Esta fecha es incorrecta ");
} else {if ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && dia>0 && dia<=31){
    System.out.println(" Su fecha " + dia + "-" + mes + "-" + año + " es correcta ");
} else {if (mes==2 && dia>0 && dia<=28) {
    System.out.println(" Su fecha " + dia + "-" + mes + "-" + año + " es correcta ");
} else {if ((mes==4 || mes==6 || mes==9 || mes==11) && dia>0 && dia<=30) {
    System.out.println(" Su fecha " + dia + "-" + mes + "-" + año + " es correcta ");
} else {
    System.out.println(" La fecha no es correcta ");
}
    
}
    
}
    
}


    }

}
