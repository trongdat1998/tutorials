1. Java Convert String to int
- Được dùng để thực hiện các phép toán trên chuỗi có chứa số, đưa ra ngoại lệ NumberFormatException nếu chuyển đôi lỗi
- Phương thức:
    ```java
    Integer.parseInt(String s) //Trả về một giá trị nguyên (int)
    //and
    Integer.valueOf(String s) //Trả về một đối tượng (Integer)
    ```
- Ví dụ 1:
    + FileName: StringToIntExample.java
        ```java
        import java.util.Scanner;  
        public class StringToIntExample {  
            public static void main(String[] args) {  
                String str_variable = "200";
                try {
                    int convertedInt = Integer.parseInt(str_variable);
                    System.out.println("Converted int method Integer.parseInt: " + convertedInt);

                    Integer convertedInt2 = Integer.valueOf(str_variable);
                    System.out.println("Converted int method Integer.valueOf: " + convertedInt);

                } catch (NumberFormatException e) {
                    System.out.println("Error: Invalid integer format in the String.");
                }
            }  
        }
        ```
    + Output:
        ```java
        Converted int method Integer.parseInt: 200
        Converted int method Integer.valueOf: 200
        ```
2. Java Convert int to String
- Phương thức:
    ```java
    String.valueOf(int i) //Dùng để chuyển đổi bất kỳ kiểu dữ liệu nào thành chuỗi
    //and
    Integer.toString(int i) //Chỉ áp dụng cho các giá trị nguyên (int, Integer)
    //and
    String.format(String format, int i) // Tương tự String.valueOf và cho phép bạn chèn các giá trị vào một chuỗi định dạng
    ```
- Ví dụ:
    + FileName: IntToStringExample.java
        ```java
        public class IntToStringExample {  
            public static void main(String[] args) {  
                int number = 200;

                String strNumber = String.valueOf(number);
                System.out.println("Converted to String method String.valueOf: " + strNumber);

                String strNumber2 = Integer.toString(number);
                System.out.println("Converted to String method Integer.toString: " + strNumber2);

                String strNumber3 = String.format("I am %d years old.", number);
                System.out.println("Converted to String method String.forma: " + strNumber3);  
            }  
        }  
        ```
    + Output:
        ```java
        Converted to String method String.valueOf: 200
        Converted to String method Integer.toString: 200
        Converted to String method String.forma: I am 200 years old.
        ```
3. Java String to long
- Được dùng để thực hiện các phép toán trên chuỗi có chứa số, đưa ra ngoại lệ NumberFormatException nếu chuyển đôi lỗi
- Phương thức:
    ```java
    Long.parseLong(String s)
    //and
    Long.valueOf(String s)
    //and
    Long.decode(String s)
    ```