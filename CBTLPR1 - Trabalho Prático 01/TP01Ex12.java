import java.util.Scanner;
/*
12. Volume do cone.
*/
public class TP01Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Altura: ");
        double h = scan.nextDouble();
        System.out.print("Raio: ");
        double r = scan.nextDouble();
        System.out.println("Volume: " + ((1.0/3)*Math.PI*Math.pow(r,2)*h));
        scan.close();
    }
}