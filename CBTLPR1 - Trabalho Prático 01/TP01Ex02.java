import java.util.Scanner;
/*
2. Calcular a área de um quadrado pela aresta.
*/
public class TP01Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a aresta: ");
        double a = scan.nextDouble();
        System.out.println("Área: " + (a*a));
        scan.close();
    }
}