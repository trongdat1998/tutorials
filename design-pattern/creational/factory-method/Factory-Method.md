# Factory Method

## Khái niện
- Giúp bạn quản lý quản và trả về đúng đối tượng mà bạn đã yêu câu
- Giúp bạn che giấu đi logic cách mà đối tượng ấy được tạo như thế nào
## Trường hợp nên dùng?
- khi có một class cha (super-class) với nhiều class con (sub-class),và trả về một class con theo đúng yêu cầu.
- Chúng ta không biết sau này sẽ cần đến những lớp con nào nữa
## Cách cài đặt
- Super Class: môt supper class trong Factory Pattern có thể là một **interface, abstract class** hay một **class** thông thường.
- Sub Classes: các sub class sẽ **implement** các phương thức của **supper class** theo nghiệp vụ riêng của nó.
- Factory Class
	+ Chịu tránh nhiệm khởi tạo các đối tượng sub class dựa theo tham số đầu vào
	+ Lưu ý:\
		Lớp này là **Singleton** hoặc cung cấp một **public static method** cho việc truy xuất và khởi tạo đối tượng\
		Factory class sử dụng **if-else** hoặc **switch-case** để xác định class con đầu ra.
- Client: chỉ cần đưa tham số đầu vào cho Factory Class
## Các cách tạo Factory Method trong code
- [Tai liệu tham khảo](https://gpcoder.com/4352-huong-dan-java-design-pattern-factory-method/)
- Có một cách tạo duy nhất bạn cần xem source để biết chi tiết cách thiết kế và đọc thêm folde docs để biết yêu cầu bài toán.
<img src ="https://github.com/trongdat1998/course-DatDT/blob/main/image/design-patterns-factory-method-diagram.png">