package pkg2.pkg8whilecuadrado;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num,cuadrado;
        System.out.println("Introduzca el número");
        num=entrada.nextInt();
        while(num>=0){
            cuadrado =num*num;
            System.out.println("el cuadrado de "+num+"es igual a"+cuadrado);
            System.out.println("");
            System.out.println("Introduzca otro número:");
            num=entrada.nextInt();
        }
        
    }
    
}
