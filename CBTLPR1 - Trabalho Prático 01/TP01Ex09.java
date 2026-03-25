import java.util.Scanner;
/*
9. Lei de Ohm.
*/
public class TP01Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Resistência: ");
        double r = scan.nextDouble();
        System.out.print("Corrente: ");
        double i = scan.nextDouble();
        System.out.println("Tensão: " + (r*i));
        scan.close();
    }
}