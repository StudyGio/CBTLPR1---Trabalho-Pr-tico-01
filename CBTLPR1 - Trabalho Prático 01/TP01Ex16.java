import java.util.Scanner;
/*
16. Funções trigonométricas.
*/
public class TP01Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ângulo em graus: ");
        double g = scan.nextDouble();
        double r = Math.toRadians(g);
        System.out.println("Seno: " + Math.sin(r));
        System.out.println("Cosseno: " + Math.cos(r));
        System.out.println("Tangente: " + Math.tan(r));
        System.out.println("Secante: " + (1/Math.cos(r)));
        scan.close();
    }
}