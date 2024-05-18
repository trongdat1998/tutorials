import java.util.Scanner;

/*
Tạo một chương trình Java chuyển đổi tư đơn vị gallon (đơn vị đo thể tích của Mỹ) sang lít.
Một gallon tương ứng với 3.7854 lít
 */
public class ThucHanh1_1 {
    public static void main(String[] args) {
        System.out.print("Enter your gallon: ");

        Scanner input = new Scanner(System.in);
        double gallon = input.nextInt();
        double lit = gallon * 3.7854;
        System.out.printf("Sau khi chuyển đổi %f gallon xẽ được %f lít", gallon, lit);
        input.close();
    }
}
