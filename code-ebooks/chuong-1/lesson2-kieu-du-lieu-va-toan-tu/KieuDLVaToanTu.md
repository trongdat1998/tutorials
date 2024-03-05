# Kiểu dữ liệu và toán tử

## 1. Tại sao các kiểu dữ liệu quan trọng
- Tất cả các phép toán đều được trình biên dịch kiểm tra về tính tương thích kiểu dữ liệu, các phép toán không hợp lệ sẽ không được biên dịch
- Việc kiểm tra giúp ngăn ngừa lỗi  và nâng cao độ tin cậy
## 2. Các kiểu dữ liệu nguyên thủy của Java
- Có hai loại kiểu dữ liệu có sãn trong Java: **hướng đối tượng** và **không hướng đối tượng**
    + *Kiểu hướng đối tượng* được định nghĩa thông qua việc dùng lớp, vấn đề được bàn luộn sau
    + *Kiểu không hướng đối tượng hay còn gọi là kiểu nguyên thủy* thì có tám kiểu dữ liệu. Các kiểu nguyên thủy không phải là đối tượng vì nó liên quan đến hiệu năng

| Kiểu dữ liệu    | Số bit    |       Phạm vi  |       Ý Ghĩa      |
|:----------------|:----------|:---------------|:------------------|
 |byte   |8  |-128 ~ 127 |   Số nguyên   |
|short  |16 |-2^15 ~ 2^15-1 |Số nguyên ngắn |
|int    |32 |-2^31 ~ -2^31-1    |Số nguyên  
|log    |64 |-2^63 ~ -2^63-1    |Số nguyên dài  |
|float  |32 |3.4028235E38 ~ 1.4E-45|Số dấu chấm động độ chính xác đơn|
|double |64 |1.7976931348623157E308 ~ 4.9E-324|Số dấu chấm động độ chính xác kép|
|char   |16 |Unicode 0 ~ Unicode 2^16-1|Ký tự|
|boolean|1  |true OR false  |Đại diện cho giá trị **đúng - sai**|

## 3. Giá trị hằng (Literal)
- Hằng là một biến mà giá trị không đổi trong suốt chương trình, tất nhiên ta đã khởi tạo giá trị ngay từ đầu.
- Dạng tổng quát
    ```java
    final  <kiểu dữ liệu> <tên biến> = <giá trị hằng>;
    ```
    *kiểu dữ liệu* là một trong tám kiểu dữ liệu nguyên thủy

## 4. Các chuỗi ký tự thoát

|Chuỗi ký tự thoát|             Ý nghĩa                 |
|:----------------|:------------------------------------|
|\' | Tạo dấu nháy đơn  |
|\" | Tạo dấu nháy kép  |
|\\ | Tạo một dấu gạch chéo|
|\r | Xóa các ký tự trước đó|
|\n | Tạo dòng mới  |
|\f | Sang trang mới    |
|\t | Tạp một khoảng tab|
|\b | Xóa một ký tự trước nó|
|\ddd| Tạo một ký tự theo số bát phân (ddd là số bát phân)|
|\uxxxx| Tạo một ký tự theo số lục phận (xxxx là số lục phân)|

## 5. Biến
- Biến là tên của vùng bộ nhớ được dành ra để lưu trữ dữ liệu. **Có 3 kiểu biến trong java**, bao gồm biến local (biến địa phương), biến instance (biến toàn cục) và biến static.
- Dạng tổng quát
    ```java
    DataType varName;
    ```
    Trong đó, *DataType* là kiểu dữ liệu của biến, *varName* là tên biến.
- Quy tắc đặt tên biến trong java:
    + Chỉ được bắt đầu bằng một ký tự(chữ), hoặc một dấu gạch dưới(_), hoặc một ký tự dollar($)
    + Tên biến không được chứa khoảng trắng
    + Bắt đầu từ ký tự thứ hai, có thể dùng ký tự(chữ), dấu gạch dưới(_), hoặc ký tự dollar($)
    + Không được trùng với các từ khóa
    + Có phân biệt chữ hoa và chữ thường
- Khởi tạo giá trị cho biến\
DataType varName
    DataType varName - [giá trị];
- Khởi tạo biến động: là việc giá trị của một biến được thay đổi trong quá trình chạy
    ```java
    double radius = 4, height = 5;
    // biến volume được khởi tạo động tại thời điểm thực hiện câu lệnh
    double volume = 3.1416 * radius * height;
- Phạm vi hoạt động của biến
    + Các biến được tạo ra khi bắt đầu môt phạm vi ( có thể là biến cục bộ hay biến toàn cục) và bị xóa bỏ khi ra ngoài phạm vi của chúng. 
    ```java
    class ScopeDemo {
        public static void main(String[] args) {
            int x; // Biến này được tất cả các đoạn mã trong main nhìn thấy

            x = 10;
            if(x == 10) { //Bắt đầu một phạm vi mới
                int y = 20; // Biến này chỉ được nhìn thấy trong khối mã này
                // cả x và y đều được nhìn thấy trong khối mã này
                System.out.println("x và ỳ: " + x + " " + y);
            }
            // y = 100; // lỗi! y không được nhìn thấy
            // x vẫn được nhìn thấy ở đây
        }
    }
    ```
    + Thời gian tồn tại của một biến bị giới hạn trong phạm vi của biến đó
    ```java
    class VarInitDemo   {
        public static void main(String[] args) {
            int x;

            for(x = 0; x < 3; x++){
                int y = -1;
                System.out.println("y bằng: " + y); // luôn in ra giá trị -1
                y = 100;
                System.out.println("giá trị hiện tại của y: " + y); // luôn in ra giá trị 100
            }
        }
    }
    ```
    Như vậy có thể thấy, y luôn luôn được khởi tạo lại thành -1 mỗi lần bắt đầu vòng lặp for bên trong. Thậm chí khi y được gán giá trị 100, thì giá trị này sau đó cũng bị mất\
    *[Lưu ý]*: Mặc dù các khổi có thể lồng nhau, nhưng khống biến nào được khai báo ở một phạm vi bên trong có thể trùng tên với biến khai báo bên ngoài. Ở ngôn ngữ C/C++ lại cho phép điều đấy
    ```java
    class NestVar{
        public static void main(String[] args) {
            int count;

            for(count = 0; count < 10; count = count + 1){
                System.out.println("Đây là biến count: " + count);

                int count; // lỗi cú pháp!
                for(count = 0; count < 2; count++){
                    System.out.println("Chương trình này có lỗi");
                }
            }
        }
    }
    ```
## 6. Toán tử
todo