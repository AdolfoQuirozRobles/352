package pkg9descdiasemana;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: ");
        double montoCompra = scanner.nextDouble();

        System.out.print("Ingrese el día de la semana (en minúsculas): ");
        String diaSemana = scanner.next();

        double descuento = 0.0;
        if (diaSemana.equals("martes") || diaSemana.equals("jueves")) {
            descuento = montoCompra * 0.15;
        }

        double totalPagar = montoCompra - descuento;

        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + totalPagar);
    }
    }
    

