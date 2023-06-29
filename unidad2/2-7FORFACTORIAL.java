package pkg2.pkg7forfactorial;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double factorial;
        int num;
        System.out.println("Introducee el numero");
        num=entrada.nextInt();
        factorial=1;
        for(int i=num;i>0;i--){
            factorial=factorial*i;
        }
        System.out.println("El factorial de "+num+"es:"+factorial);
    }
    
}
