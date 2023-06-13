
package edad;
import java.util.Scanner;
public class Edad {
   
    public static void main(String[] args) {
       Scanner dato=new Scanner(System.in);
       int n;
        System.out.println("ingresa tu edad");
        n=dato.nextInt();
        if (n>=18){
            System.out.println("eres mayor de edad");
        }
        else{
            System.out.println("eres menor de edad");
        }
        return invalido;
    }
}