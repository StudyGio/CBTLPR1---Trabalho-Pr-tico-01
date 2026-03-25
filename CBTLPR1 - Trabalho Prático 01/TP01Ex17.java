import java.util.Scanner;
/*
17. Potência.
*/
public class TP01Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("X: ");
        double x = scan.nextDouble();
        System.out.print("Y: ");
        double y = scan.nextDouble();
        System.out.println("Resultado: " + Math.pow(x,y));
        scan.close();
    }
}