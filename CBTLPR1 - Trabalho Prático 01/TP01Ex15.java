import java.util.Scanner;
/*
15. Dólar para real.
*/
public class TP01Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Cotação: ");
        double c = scan.nextDouble();
        System.out.print("Dólar: ");
        double d = scan.nextDouble();
        System.out.println("Reais: " + (c*d));
        scan.close();
    }
}