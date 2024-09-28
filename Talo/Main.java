import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int num ;
     int dm,um,c,d,u;
     boolean capicua = false;
System.out.println("Introduzca un numero del 0 al 99.999 ");
num=leer.nextInt();
if (num<0 ) {
  System.out.println(" No cumple los requisitos");
} else {if (num>=100000) {
  System.out.println(" No cumple los requisitos");
} else {
  

u=num%10;
num=num/10;

d=num%10;
num=num/10;

c=num%10;
num=num/10;

um=num%10;
num=num/10;

dm=num%10;

if (dm==um && um==d) {
  capicua=true;
}
if (dm==0 && um==u && c==d) {
  capicua=true;
}
if (dm==0 && um==0 && c==u) {
  capicua=true;
}
if (dm==0 && um==0 && c==0 && d==u) {
  capicua=true;
}
if (capicua) {
  System.out.println("este numero es capicua");
} else {
  System.out.println("este numero no es capicua");

}
}
    }
  }
}