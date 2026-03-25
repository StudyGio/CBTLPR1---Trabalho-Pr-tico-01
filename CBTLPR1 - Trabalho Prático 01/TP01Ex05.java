import java.util.Scanner;
/*
5. Volume da esfera.
*/
public class TP01Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o diâmetro: ");
        double d = scan.nextDouble();
        double r = d/2;
        System.out.println("Volume: " + ((4.0/3)*Math.PI*Math.pow(r,3)));
        scan.close();
    }
}