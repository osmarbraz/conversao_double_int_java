
public class Principal {

    public static void main(String[] args) {
        double a = 9.8;
        double b = -9.8;

        int x = (int) a;
        int y = (int) b;

        System.out.println("9.8 convertido para int: " + x);
        System.out.println("-9.8 convertido para int: " + y);

        System.out.println("Math.round(9.8): " + Math.round(a));

        System.out.println("Math.round(-9.8): " + Math.round(b));
    }
}
