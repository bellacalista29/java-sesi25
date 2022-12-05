public class Latihan5B {
    public static void main(String[] args) {
        int X1;
        int X2;
        int y1 = 2;
        int y2 = 5;

        X1 = (y1 + y2) * (y1 + y2);
        X2 = (y1 % 4) * y2;
        System.out.println("X1 : " + X1);
        System.out.println("X2 : " + X2);

        System.out.println("X1 besar sama dengan X2 ===> " + (X1 >= X2));
        System.out.println("X2 besar sama dengan X1 ===> " + (X2 >= X1));
        System.out.println("X1 mod 4 == ++X2 mod 5 ===> " + (X1 % 4 == ++X2 % 5));
    }
}
