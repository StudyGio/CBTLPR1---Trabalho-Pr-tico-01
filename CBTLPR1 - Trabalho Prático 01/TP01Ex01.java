import java.util.Scanner;
/*
1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
*/
public class TP01Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a base: ");
        double base = scan.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scan.nextDouble();
        System.out.println("Área: " + (base * altura));
        scan.close();
    }
}