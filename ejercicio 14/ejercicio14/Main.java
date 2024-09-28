package ejercicio14;
import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        double nota;
        System.out.println(" Introduzca su nota : ");
        nota=leer.nextDouble();
        if (nota>0 && nota<5) {
            System.out.println(" INSUFICIENTE");
        } else {if (nota>=5 && nota<6) {
            System.out.println(" SUFICIENTE ");
        } else {if (nota>=6 && nota<7) {
            System.out.println(" BIEN ");
        } else { if (nota>=7 &&nota<8) {
            System.out.println(" NOTABLE ");
        } else { if (nota>=8 && nota<=10) {
            System.out.println(" SOBRESALIENTE ");
        } else {
            System.out.println(" ESTA NOTA NO ESTA EN EL RANGO DE NOTAS CORRECTO ");
        }
                        }
                    }
                }
            }
        }
    }
