public class ChuyenTiepNgoaiLe {
    public static void genException() {
        int number[] = {4, 5, 6, 7, 45, 85, 2, 66};
        int demo[] = {1, 0, 2, 4};
        for (int i = 0; i < number.length; i++) {
            try {
                System.out.print(number[i] + " / " +
                        demo[i] + " bằng " +
                        number[i] / demo[i] + "\n");
            } catch (ArithmeticException exc) {
                // bắt ngoại lệ
                System.out.print("Không thể chia cho số 0!" + "\n");
            } catch (ArrayIndexOutOfBoundsException exc2) {
                System.out.print(" Không tìm thấy phần tử tương ứng.");
                throw exc2; // chuyển tiếp ngoại lệ
            }
        }
    }
}

class RethrowDemo {
    public static void main(String[] args) {
        try {
            ChuyenTiepNgoaiLe.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.print("Lỗi nghiêm trọng - " + "chương trình đã bị dừng");
        }
    }
}
