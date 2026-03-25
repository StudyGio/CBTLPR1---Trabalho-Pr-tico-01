import java.util.Scanner;
/*
18. Troco.
*/
public class TP01Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Produto 1: ");
        double p1 = scan.nextDouble();
        System.out.print("Produto 2: ");
        double p2 = scan.nextDouble();
        System.out.print("Produto 3: ");
        double p3 = scan.nextDouble();
        System.out.print("Produto 4: ");
        double p4 = scan.nextDouble();
        System.out.print("Produto 5: ");
        double p5 = scan.nextDouble();
        System.out.print("Valor pago: ");
        double pago = scan.nextDouble();
        double soma = p1+p2+p3+p4+p5;
        System.out.println("Troco: " + (pago - soma));
        scan.close();
    }
}