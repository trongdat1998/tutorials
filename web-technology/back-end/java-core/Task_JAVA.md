
## 1. Giới thiệu Java ✔
- Được xây dựng và kế thừa kế thừa từ C và C++
### 1.2. Tại sao nên học Java? ✔
### 1.3. Cơ hội nghề nghiệp với Java ✔
### 1.4. Thiết lập môi trường và cài đặt IDE ✔
- Cài đặt JDK.
- Cài đặt IDE: Eclipse, Netbeans, IntelliJ
## 2. Nhập môn Java
### 2.1.Bộ ký tự trong Java ✔
	- Unicode: là chuẩn mã hóa ký tự quốc tế, chứa mọi ngôn ngữ trên thế giới
	- Khi bạn làm việc với tiếng Việt thì nên dùng UTF-8, vì có khả năng biểu diễn đầy đủ ký tự Unicode
### 2.2. Từ khóa trong Java ✔
	- Là những đã được định nghĩa trước, Java có khoảng 50 từ khóa. Bên dưới là một số ví dụ
		+ Kiểu dữ liệu: int, float, double...
		+ Điều khiển luồng: if, else...
		+ Quyền truy cập: public, private, protected..
		+ Xử lý ngoại lệ: try, catch...
### 2.3. Quy tắc đặt tên trong Java ✔
	- Không trùng với từ khoá
	- Không bắt đầu bằng một số
	- Không được chứa khoảng trắng, các ký tự toán học: +, -, *, /, %,...
	- Có phân biệt chữ hoa chữ thường: fullName sẽ khác với fullname.
		+ Đặt tên biến: Chữ cái đầu viết thường chữ cái tiếp theo viết hoa ⇒ fullName
		+ Đặt tên hằng số: Phải được viết hoa, nếu có 2 từ trở lên phải có dấu 「 _ 」 ⇒ MAX_LENGTH
		+ Đặt tên phương thức: Chữ cái đầu viết thường chữ cái tiếp theo viết hoa ⇒ helloWorld()
		+ Đặt tên Class và Interface: Chữ cái đầu tiên của mỗi từ phải được viết hoa: AdminUser, AdminUserServiceImpl.
		+ Đặt tên Package: Tên packages phải được viết thường hết: userauth
### 2.4. Lệnh và khối lệnh trong Java ✔
	- Lệnh: là một dòng mã thực hiện một tác vụ cụ thể và được kết thúc bằng dấu chấm phẩy 「 ; 」
	- Khối lệnh: gồm 2 hoặc nhiều câu lệnh, được bắt đầu và kết thức bởi dấu ngoặc nhọn 「 {} 」
### 2.5. Câu trúc một chương trình Java ✔
	- package: Mô tả không gian chứa lớp đấy
	- import: Để tải một hoặc nhiều class vào chương trình
	- class: Định nghĩa tên lớp của Java
	- variables: Biến hay còn gọi là trường
	- methods: Phương thức hay còn gọi là hàm 
	- constructors: Phương thức khởi tạo (Hay hàm khởi tạo) của đối tượng.
### 2.6. Package trong Java ✔
	- Là một nhóm các class, interface và các package khác
	- Java có 2 loại package chính:
		+ Các package tích hợp sẵn: 「 import java.util.Scanner; 」 (java.lang, java.util, java awt,...)
		+ Các package do chúng ta tự định nghĩa: 「 package com.mamilove.service.impl; 」
### 2.7. Chương trình Java đầu tiên ✔
### 2.8. Nhập xuất thông qua console trong Java ✔
	- Cho phép bạn nhập dữ liệu từ bàn phím, sau đó chuyển vào chương trình rồi xuất ra màn hình
		+ Dùng đối tượng Scanner: nextLine(), nextInt(), nextDouble(),...
		+ Dùng đối tượng BufferedReader: readLine(), Integer.parseInt(), Double.parseDouble(),...
		+ Dùng đối tượng Console: Cung cấp thêm tiện ích cho phép ẩn mật khẩu khi nhập.
	- Ví dụ:
		```java
		import java.io.BufferedReader;
		import java.io.Console;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.util.Scanner;

		public class Main {
			public static void main(String[] args) throws IOException {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Nhập tên của bạn: ");
				String name = scanner.nextLine();
				System.out.print("Nhập tuổi của bạn: ");
				int age = scanner.nextInt();
				System.out.println("Tên của bạn là: " + name);
				System.out.println("Tuổi của bạn là: " + age);

				// Khi dùng BufferedReader phải có throws IOException
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Nhập tên của bạn: ");
				String nameBuf = reader.readLine();
				System.out.println("Tên của bạn là: " + nameBuf);

				Console console = System.console();
				if (console == null) {
					System.out.print("Console không sẵn sàng");
					return;
				}
				System.out.println("Nhập mật khẩu: ");
				char[] passwordChars = console.readPassword();
				String password = String.valueOf(passwordChars);
				System.out.println("Mật khẩu của bạn là: " + password);

			}
		}
		```
### 2.9. Comment trong Java ✔
	- Comment 1 dòng: Dùng hai dấu gạch chéo phía trước 「 // 」
	- Comment nhiều dòng: 「 /* message comment */ 」
### 2.10. Các kiểu dữ liệu trong java ✔
	- Java có 2 loại kiểu dữ liệu: kiểu nguyên thủy và kiểu hướng đối tượng
		+ Kiểu nguyên thủy: có 8 kiểu nguyên thủy (boolean, byte, char, double, float, int, long, short), kiểu int hoạt động nhanh hơn và chiếm ít bộ nhớ hơn so với Integer
		+ Kiểu hướng đối tượng: cung cấp thêm các phương thức: toString(), max(), min(),...
### 2.11. Biến và phạm vi biến trong Java ✔
	- Có 3 kiểu biến
		+ Biến cục bộ: Được khai báo trong phương thức, chỉ phương thức đó mới sử dụng được
		+ Biến toàn cục: Được khai báo bên trong lớp nhưng ngoài phương thức và không được khai báo là static
		+ Biến tĩnh: Tương tự như biến toàn cục nhưng phải được khai báo là static
### 2.12. Hàm - Phương thức trong Java ✔
	- Hàm hay phương thức (method) trong Java là một khối lệnh để thực hiện một hành động cụ thể
	- Nếu 2 method có cùng tên nhưng khác tham số đầu vào thì đó gọi là method overloading
### 2.13. Các toán tử trong Java ✔
	- Toán tử số học
	- Toàn tử quan hệ và logic
	- Toán tử tăng giảm
		+ Dạng tiền tố (++x, --x): Thực hiện tăng giảm trước khi thực hiện logic
		+ Dạng hậu tố (x++, x--): Thực hiện tăng giảm sau khi thực hiện logic
	- Toán tử gán là một dấu bằng đơn
		+ Ví du:
			```java
			int x, y, z;
			x = y = x = 100; // gán giá trị 100 cho 3 biến x, y, z

			// phép toán giản lược: 2 dòng code dưới có kết quả như nhau
			x = x + 10; 
			x += 10;
			```

### 2.14. Ép kiểu trong Java ✔
	- Có 2 kiểu ép kiểu 
		+ Ép kiểu không tường minh: Là chuyển kiểu dữ liệu có kích thước nhỏ hơn sang kiểu có kích thước lớn hơn. Kiểu biến đổi này không làm mất thông tin.
		+ Ép kiểu tường minh: Là chuyển kiểu dữ liệu có kích thước lớn hơn sang kiểu có kích thước nhỏ hơn. Kiểu biến đổi này có thể làm mất thông tin
### 2.15. Chuyển đổi kiểu dữ liệu trong Java ✔
	- Chuyển đổi String thành int: 「 Integer.parseInt() 」
	- Chuyển đổi int thành String: 「 String.valueOf() và Integer.toString() 」
	- Chuyển đổi String thành Date
		```java
		import java.text.SimpleDateFormat;
		import java.util.Date;

		public class StringToDateExample {
			public static void main(String[] args) throws Exception {
				String sDate = "17/07/2017";
				Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
				System.out.println(sDate + "\t" + date);
			}
		}
		```
		+ Output: 17/07/2017 Mon Jul 17 00:00:00 ICT 2017
	- Toán tử cộng: Được sử dụng để chuyển các kiểu số thành String
### 2.16. Các hàm toán học trong Java ✔
	- Được sử dụng thông qua lớp Math, lớp này được đặt sẵn trong gói 「 java.lang 」
		+ Lấy giá trị tuyệt đối: Math.abs(giá_trị)
		+ Làm tròn lên: Math.ceil(giá_trị)
		+ Làm tròn xuống: Math.floor(giá_trị)
		+ Tìm số lớn nhất: Math.max(giá_trị1, giá_trị2)
		+ Tìm số nhỏ nhất: Math.min(giá_trị1, giá_trị2)
		+ Số ngẫu nhiên: Math.random()
### 2.17. Câu lệnh rẻ nhánh ✔
	- 「if-else」: Dùng khi nhỏ hơn 4 nhánh, còn lại dùng switch-case
	- 「switch-case」: 
### 2.18. Câu lệnh lặp ✔
	- 「for」: Dùng khi biết trước số lần lặp
	- 「while」: Dùng khi chưa biết số lần lặp
	- 「do-while」: Dùng khi chưa biết số lần lặp và cần chạy ít nhất 1 lần
### 2.19. Từ khóa break và continue ✔
	- Break buộc vòng lặp phải kết thúc ngay lập tức, bỏ qua toàn bộ đoạn mã còn lại trong thân vòng lặp
	- Continue ép buộc thực thi lần lặp tiếp theo của vòng lặp, bỏ qua toàn bộ đoạn mã nằm giữa lệnh continue
### 2.20. Toán tử 3 ngôi trong Java ✔
	- Là một cách viết tắt cho câu lệnh điều kiện (if-else)
	- Cú pháp:
		「 biến = Biểu thức logic ? Câu lệnh khi biểu thức trả về true : Câu lệnh khi biểu thức trả về false; 」
	- Ví dụ:
		「 String result = isTroiMua() === true ? System.out.println("Tôi sẽ nghỉ học") : System.out.println("Tôi sẽ đi học"); 」
### 2.21. String (chuỗi) trong Java ✔
	- Khởi tạo bằng dấu nháy kép:  String str1 = "hello world";
		+ Khi khởi tạo mới (str2, str3,..) sẽ thực hiện kiểm tra vùng nhớ heap tại string pool
			đã có chuỗi ký tự tương ứng hay chưa ("hello world") nếu có rồi sẽ không tạo thêm vùng nhớ cho (str2, str3,..)
	- Khởi tạo string bằng từ khoá new: String str1 = new String("hello world");
		+ Không tiến hành kiểm tra trong string pool hay chưa mà nó sẽ tiến hành khởi tạo mới
	- Các hàm thường sử dụng của String
		+ int length(): Trả về số lượng ký tự trong chuỗi
		+ String substring(int i): Trả về chuỗi con bắt đầu tại vị trí i đến cuối chuỗi
		+ String substring(int begin, int end): Trả về chuỗi con từ vị trí begin đến end
		+ String concat(String s): Nối chuối s vào cuối chuỗi
		+ indexOf(String str, int fromIndex): Trả về vị trí xuất hiện đầu tiên của str bắt đầu từ vị trí fromIndex
		+ lastIndexOf(String str): Trả về vị trí xuất hiện cuối cùng của st
		+ boolean equals(Object obj): So sánh nội dung của 2 string
		+ boolean equalsIgnoreCase(String str): So sánh với chuỗi str, bỏ qua ký tự hoa thường
		+ Toán tử == có ý nghĩa là so sánh địa chỉ vùng bộ nhớ lưu trữ
		+ String toLowerCase(): Chuyển tất cả các ký tự thành ký tự thường.
		+ String toUpperCase(): Chuyển tất cả các ký tự thành ký tự hoa
		+ String trim(): Xoá các khoảng trắng ở đầu và cuối chuỗi
		+ String replace(char old, char new): thay thế các ký tự old thành new
### 2.22. Mảng trong java ✔
	- Mảng (array) là tập hợp các biến cùng kiểu
	- Khai báo mảng trong java:
		「 <Kiểu dữ liệu>[] <tên mảng> = new <kiểu dữ liệu>[số lượng phần tử];」 
		「int[] arr = new int[100];」
	- Truy xuất các phần tử của mảng
		+ Truy xuất trực tiếp: 「<tên_mảng>[vị_trí];」
		+ Truy xuất tuần tự: dùng thêm vòng lặp (for, for-each)
### 2.23. Mảng đa chiều trong java ✔
	- Là mảng có 2 hoặc nhiều chiều
		+ Cú pháp:
		「<Kiểu dữ liệu>[][][]..[] <tên mảng> = new <kiểu dữ liệu>[<kích thước thứ 1>][<kích thước thứ 2>]….[<kích thước thứ n>];」
		+ Ví dụ:
		「 int[][] mang1 = new int[10][20]; 
	- Truy xuất các phần tử của mảng
		「<tên_mảng>[vị_trí_hàng][vị_trí_cột];」
3. Lập trình hướng đối tượng
- Lập trình hướng đối tượng: 4 tính chất
- Kiểu dữ liệu và toán tử
- Câu lệnh điều khiển và vòng lặp. =>DONE
- Lớp, đối tượng và phương thức
- Gói và giao diện
- Kiểm soát ngoại lệ
- Sử dụng nhập xuất
- Lập trình đa luồng
- Liệt kê, đóng hộp tự động, import tĩnh và annotation
- Generic
- Apple, sự kiện
- Java Swing

