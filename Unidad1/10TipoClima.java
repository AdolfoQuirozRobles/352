package pkg10tipoclima;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados centígrados: ");
        double temperatura = scanner.nextDouble();

        if (temperatura < 10) {
            System.out.println("El clima es frío.");
        } else if (temperatura >= 10 && temperatura < 20) {
            System.out.println("El clima está nublado.");
        } else if (temperatura >= 20 && temperatura < 30) {
            System.out.println("El clima es caluroso.");
        } else {
            System.out.println("El clima es tropical.");
        }
    }
}
 
    

