import java.util.Scanner;
/*
4. Área do triângulo.
*/
public class TP01Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Base: ");
        double b = scan.nextDouble();
        System.out.print("Altura: ");
        double h = scan.nextDouble();
        System.out.println("Área: " + ((b*h)/2));
        scan.close();
    }
}