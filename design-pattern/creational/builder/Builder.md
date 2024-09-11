# Builder Pattern

## Khái niện
- Builder pattern là mẫu thiết kế đối tượng được tạo ra để xây dựng một đối tượng phức tạp 
bằng cách sử dụng các đối tượng đơn giản và sử dụng tiếp cận từng bước, việc xây dựng các đối tượng đôc lập với các đối tượng khác.
- Builder Pattern được xây dựng để khắc phục một số nhược điểm của Factory Pattern và Abstract Factory Pattern khi mà Object có nhiều thuộc tính.
## Trường hợp nên dùng?
- Được sử dụng khi đối tượng cần được tạo ra có quá nhiều thuộc tính hoặc tham số, 
và bạn muốn xây dựng đối tượng này từng bước một cách linh hoạt và có kiểm soát.
## Cách cài đặt
<img src ="https://github.com/trongdat1998/course-DatDT/blob/main/image/design-patterns-builder-diagram.png">
- Product: đại diện cho đối tượng cần tạo, đối tượng này phức tạp, có nhiều thuộc tính.
- Builder: là abstract class hoặc interface khai báo phương thức tạo đối tượng.
- ConcreteBuilder : kế thừa Builder và cài đặt chi tiết cách tạo ra đối tượng. 
Nó sẽ xác định và nắm giữ các thể hiện mà nó tạo ra, đồng thời nó cũng cung cấp phương thức để trả các các thể hiện mà nó đã tạo ra trước đó.
- Director/ Client: là nơi sẽ gọi tới Builder để tạo ra đối tượng
### Các cài đặt trong code
- [Tai liệu tham khảo](https://gpcoder.com/4434-huong-dan-java-design-pattern-builder/)