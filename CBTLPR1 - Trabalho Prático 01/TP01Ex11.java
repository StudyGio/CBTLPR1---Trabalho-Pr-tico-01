import java.util.Scanner;
/*
11. Área do círculo.
*/
public class TP01Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Diâmetro: ");
        double d = scan.nextDouble();
        double r = d/2;
        System.out.println("Área: " + (Math.PI*Math.pow(r,2)));
        scan.close();
    }
}