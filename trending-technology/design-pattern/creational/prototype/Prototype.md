# Prototype Pattern

## Khái niện
- Sẽ tạo ra một object mới bằng cách copy
## Trường hợp nên dùng?
- Khi bạn không muốn tạo lại đối tượng mới vì nó giống với một đối tượng đã tạo trước đấy tồi
## Cách cài đặt
<img src ="https://github.com/trongdat1998/course-DatDT/blob/main/image/design-patterns-prototype-diagram.png">
- Prototype: khai báo một **class, interface** hoặc **abtract class** cho việc clone chính nó
- ConcretePrototype class: các lớp này thực thi interface (hoặc kế thừa từ lớp abstract) được cung cấp bởi Prototype
- Client class: tạo mới object bằng cách gọi Prototype thực hiện clone chính nó.
## Các cài đặt trong code
- [Tai liệu tham khảo](https://gpcoder.com/4413-huong-dan-java-design-pattern-prototype/)
