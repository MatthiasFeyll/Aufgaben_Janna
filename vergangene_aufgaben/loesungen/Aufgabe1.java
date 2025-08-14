public class App {
    public static int summe(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int result = summe(a, b);

        System.out.println("Die Summe von " + a + " und " + b + " ist: " + result);
    }
}
