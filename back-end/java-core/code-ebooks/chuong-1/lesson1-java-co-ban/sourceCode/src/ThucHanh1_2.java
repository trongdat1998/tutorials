/*
Nâng cấp ConvertGallonToLit
Tự chuyển đổi bắt đầu từ 1 gallon và kết thức 100 gallon
Với điều kiện cú in ra 10 dòng tạo 1 dòng trống
 */
public class ThucHanh1_2 {
    public static void main(String[] args) {
        int countLine = 0;
        for (int start = 1; start <= 100; start++) {
            double lit = start * 3.7854;
            System.out.println(lit);
            countLine++;
            if (countLine == 10) {
                System.out.println();
                countLine = 0;
            }
        }
    }
}
