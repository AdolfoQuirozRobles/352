package pkg6precedenciadeoperadores;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        // TODO code application logic here
        calculaoperaciones();
    }
    public static void calculaoperaciones(){
        //En esta parte estamos pidiendo que el usuario introdusca el valor de las letras//
            Scanner reader= new Scanner (System.in);
            double a=0;
            double b=0;
            double c=0;
            double d=0;
            double e=0;
            double f=0;
            double g=0;
            double h=0;
            double j=0;
            double m=0;
            double n=0;
            double p=0;
            double q=0;
            double r=0;
            double s=0;
            double x=0;
            double y=0;
        System.out.println("Introdusca el valor de a: ");
        a=reader.nextDouble();
        System.out.println("Introdusca el valor de b: ");
        b=reader.nextDouble();
        System.out.println("Introdusca el valor de c: ");
        c=reader.nextDouble();
        System.out.println("Introdusca el valor de d: ");
        d=reader.nextDouble();
        System.out.println("Introdusca el valor de e: ");
        e=reader.nextDouble();
        System.out.println("Introdusca el valor de f: ");
        f=reader.nextDouble();
        System.out.println("Introdusca el valor de g: ");
        g=reader.nextDouble();
        System.out.println("Introdusca el valor de h: ");
        h=reader.nextDouble();
        System.out.println("Introdusca el valor de j: ");
        j=reader.nextDouble();
        System.out.println("Introdusca el valor de m: ");
        m=reader.nextDouble();
        System.out.println("Introdusca el valor de n: ");
        n=reader.nextDouble();
        System.out.println("Introdusca el valor de p: ");
        p=reader.nextDouble();
        System.out.println("Introdusca el valor de q: ");
        q=reader.nextDouble();
        System.out.println("Introdusca el valor de r: ");
        r=reader.nextDouble();
        System.out.println("Introdusca el valor de s: ");
        s=reader.nextDouble();
        System.out.println("Introdusca el valor de x: ");
        x=reader.nextDouble();
        System.out.println("Introdusca el valor de y: ");
        y=reader.nextDouble();
        //INSISO A//
        double calculaA;
        calculaA =(3/2)+(4/2);
        System.out.println(("A")+calculaA);
        //INSISO B//
        double calculaB;
        calculaB=(1/(x-5))-((3*x*y)/4);
        System.out.println(("B")+calculaB);
        //INSISO C//
        double claculaC;
        claculaC=(1/2)+7;
        System.out.println(("C")+claculaC);
        //INSISO D//
        double calculaD;
        calculaD=7+(1/2);
        System.out.println(("D")+calculaD);
        //INSISO E//
        double calculaE;
        calculaE=((a*a)/(b-c))+((d-e)/(f-((g*h)/j)));
        System.out.println(("E")+calculaE);
        //INSISO F//
        double calculaF;
        calculaF=(m/n)+p;
        System.out.println(("F")+calculaF);
        //INSISO G//
        double calculaG;
        calculaG=m+(n/(p-q));
        System.out.println(("G")+calculaG);
        //INSISO H//
        double calculaH;
        calculaH=(Math.pow(a, a)/(Math.pow(b, b)))+Math.pow(c, c)/Math.pow(d, d);
        System.out.println(("H")+calculaH);
        //INSISO I//
        double calculaI;
        calculaI=m+(n/p)/q-(r/s);
        System.out.println(("I")+calculaI);
        //INSISO J//
        double calculaJ;
        calculaJ=((3*a)+b)/(c-(d+(5*e)))/(f+(g/(2*h)));
        System.out.println(("J")+calculaJ);
        //INSISO K//
        double calculaK;
        calculaK= (Math.pow(a, a)+(2*a*b)+Math.pow(b, b))/(1/Math.pow(x, x))+2;
        System.out.println(("K")+calculaK);
    }
}
