import java.util.Scanner;
/*
7. Média geométrica.
*/
public class TP01Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Valor 1: ");
        double a = scan.nextDouble();
        System.out.print("Valor 2: ");
        double b = scan.nextDouble();
        System.out.println("Média geométrica: " + Math.sqrt(a*b));
        scan.close();
    }
}