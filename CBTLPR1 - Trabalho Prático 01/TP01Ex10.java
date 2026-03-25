import java.util.Scanner;
/*
10. Celsius para Fahrenheit.
*/
public class TP01Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Celsius: ");
        double c = scan.nextDouble();
        System.out.println("Fahrenheit: " + ((c*1.8)+32));
        scan.close();
    }
}