public class ThrowDemo {
    static void validate(int age) {
        try {
            //khi trương chình khác mà chuyền sai thì xẽ sinh ra ngoại lệ do người code tạo ra
            if (age < 18)
                throw new ArithmeticException("not valid");
            else
                System.out.println("welcome");
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
