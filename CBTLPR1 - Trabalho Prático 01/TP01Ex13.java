import java.util.Scanner;
/*
13. Velocidade final.
*/
public class TP01Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Velocidade inicial (m/s): ");
        double v0 = scan.nextDouble();
        System.out.print("Aceleração: ");
        double a = scan.nextDouble();
        System.out.print("Tempo: ");
        double t = scan.nextDouble();
        double vf = v0 + a*t;
        System.out.println("Velocidade final (km/h): " + (vf*3.6));
        scan.close();
    }
}