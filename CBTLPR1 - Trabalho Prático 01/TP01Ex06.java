import java.util.Scanner;
/*
6. Média aritmética.
*/
public class TP01Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Valor 1: ");
        double n1 = scan.nextDouble();
        System.out.print("Valor 2: ");
        double n2 = scan.nextDouble();
        System.out.print("Valor 3: ");
        double n3 = scan.nextDouble();
        System.out.print("Valor 4: ");
        double n4 = scan.nextDouble();
        System.out.println("Média: " + ((n1+n2+n3+n4)/4));
        scan.close();
    }
}