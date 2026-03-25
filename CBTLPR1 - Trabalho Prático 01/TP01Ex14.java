import java.util.Scanner;
/*
14. Volume livre.
*/
public class TP01Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Aresta do cubo: ");
        double a = scan.nextDouble();
        System.out.print("Raio da esfera: ");
        double r = scan.nextDouble();
        double cubo = Math.pow(a,3);
        double esfera = (4.0/3)*Math.PI*Math.pow(r,3);
        System.out.println("Volume livre: " + (cubo-esfera));
        scan.close();
    }
}