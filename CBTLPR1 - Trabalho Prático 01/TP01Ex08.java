import java.util.Scanner;
/*
8. Converter milhas para km.
*/
public class TP01Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Milhas marítimas: ");
        double m = scan.nextDouble();
        System.out.println("Km: " + (m*1.852));
        scan.close();
    }
}