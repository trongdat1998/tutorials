public class Example {
    public static void main(String[] args) {
        try {
            int a = 2 / 0;
        } catch (Throwable exc) {
            System.out.print(exc);
        }
    }
}
