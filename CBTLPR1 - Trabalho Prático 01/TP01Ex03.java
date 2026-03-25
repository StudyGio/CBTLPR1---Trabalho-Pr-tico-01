import java.util.Scanner;
/*
3. Área do quadrado pela diagonal.
*/
public class TP01Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a diagonal: ");
        double d = scan.nextDouble();
        System.out.println("Área: " + ((d*d)/2));
        scan.close();
    }
}