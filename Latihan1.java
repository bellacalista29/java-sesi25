import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Double Luas;
        double PI = 3.14;
        int r;

        Scanner scan = new Scanner(System.in);
        System.out.print("Input jari jari : ");
        r = scan.nextInt();
        Luas = PI*r*r;
        System.out.println("Luas lingkaran : " + Luas);
        scan.close();
    }
}