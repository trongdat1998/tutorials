# Abstract Factory Method

## Khái niện
-  Abstract Factory Pattern là một Pattern cấp cao hơn so với Factory Method Pattern.
## Trường hợp nên dùng?
- Để cho bạn rể hiểu là có 1 nhà máy lớn chứa nhiều nhà máy nhỏ, mỗi nhà máy nhỏ lại thực hiện các công việc sản xuất ra các sản phẩm khác nhau
## Cách cài đặt
- AbstractFactory: Khai báo dạng interface hoặc abstract class chứa các phương thức để tạo ra các đối tượng abstract.
- ConcreteFactory: Xây dựng, cài đặt các phương thức tạo các đối tượng cụ thể.
- AbstractProduct: Khai báo dạng interface hoặc abstract class để định nghĩa đối tượng abstract.
- Product: Cài đặt của các đối tượng cụ thể, cài đặt các phương thức được quy định tại AbstractProduct.
- Client: là đối tượng sử dụng AbstractFactory và các AbstractProduct.
## Các cài đặt trong code
- [Tai liệu tham khảo](https://gpcoder.com/4365-huong-dan-java-design-pattern-abstract-factory/)
- Có một cách tạo duy nhất bạn cần xem soure để biết chi tiết cách thiết kế và đọc folde doc để biết yêu cầu bài toán
<img src ="https://github.com/trongdat1998/course-DatDT/blob/main/image/design-patterns-abstract-factory-diagram.png">