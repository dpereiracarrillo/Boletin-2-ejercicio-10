
package ejercicio.pkg2.pkg10;

import java.util.Scanner;


public class Ejercicio210 {

   
    public static void main(String[] args) {
       float euros;
int b100 , b20 , b5 , m1 ;
System.out.println("€s totales=");
Scanner dato=new Scanner(System.in);
euros=dato.nextFloat();
b100=(int) (euros/100);
b20=(int) ((euros%100)/20);
b5=(int) ((euros%100)%20)/5;
m1=(int) ((((euros%100)%20)%5)/1);
System.out.println("billetes de 100€="+b100+"\n"+"billetes de 20€="+b20+"\n"+"billetes de 5€="+b5+"\n"+"monedas de 1€="+m1);
    }
    
}
