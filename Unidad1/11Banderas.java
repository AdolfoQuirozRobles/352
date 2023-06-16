package explicaciondebandera;

public class Explicaciondebandera {

    public static void main(String[] args) {
        int edadJuan=22;
        int edadPedro=20;
        boolean bandera1;
        bandera1=(edadJuan>edadPedro);
        System.out.println("Resultado de la bandera" + bandera1);
        int edadLupe=35;
        boolean bandera2;
        boolean bandera3;
        bandera2=(edadLupe<edadPedro);
        bandera3=(bandera1&&bandera2);
        System.out.println("Resultado de bandera3:" + bandera3);
        
    }
    
}
