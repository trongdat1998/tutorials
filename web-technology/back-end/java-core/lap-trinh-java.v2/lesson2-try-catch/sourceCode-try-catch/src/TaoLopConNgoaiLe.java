public class TaoLopConNgoaiLe {
    public static void main(String[] args) {
        int number1[] = {14, 15, 5, 7};
        int number2[] = {1, 5, 4};
        for (int i = 0; i < number1.length; i++) {
            try {
                if ((number1[i] % 2) != 0) {
                    throw new NonIntException(number1[i], number2[i]);
                }
            } catch (ArrayIndexOutOfBoundsException exc) {

            } catch (NonIntException exc) {
                System.out.print(exc);
            }
        }
    }
}

class NonIntException extends Exception {
    int a;
    int b;

    NonIntException(int i, int j) {
        a = j;
        b = j;
    }

    public String toString() {
        return "Kết quả của " + a + " / " + b + " không phải là số nguyên\n";
    }
}
