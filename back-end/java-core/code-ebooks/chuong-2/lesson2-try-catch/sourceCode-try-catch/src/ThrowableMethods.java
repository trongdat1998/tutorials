public class ThrowableMethods {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.print("Thông báo chuẩn là:\n");
            System.out.print(exc);
            System.out.print("\n Ngăn xếp lưu vết\n");
            exc.printStackTrace();
        }
        //System.out.print("Sau khi kết thúc catch.");
    }
}

class ExcTest {
    static void genException() {
        int number[] = new int[4];
        System.out.print("Trước khi ngoại lệ được sinh ra.\n");
        number[7] = 10;
        System.out.print("Dòng này không được hiển thị");
    }
}
