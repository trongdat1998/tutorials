# Chương 1: Những kiến thức cơ bản về Java
- Tổng quan: Các khái niệm và kỹ năng chính
+ Lịch sử và triết lý của Java
+ Sự đóng góp của Java đối với Internet
+ Tầm quan trọng của bytecode
+ Các nguyên tắc cơ bản của lập trình hướng đối tượng
+ Sử dụng biến
+ Sử dụng câu lệnh điều kiện *if* và *for*
+ Tạo ra các khối mã
+ Các quy tắc viết code và đặt tên trong Java
## 1. Nguồng gốc của Java
- Được xây dựng dựa trên di sản giàu có kế thừa từ C và C++, Java thêm những cải tiến và các tính năng tương ứng với trạng thái hiện tại của kỹ thuật lập trình
- Ban đầu Java dùng để tạo ra các phầm mềm nhúng vào các thiết bị điện tử  dân dụng (lò vi song, tivi,..).
Vì sự phát triển mạnh mẽ của Internet, đã thúc đẩy Java trở thành ngôn ngữ máy tính hàng đầu, bởi vì Web đòi hỏi tính khả chuyền
### 1.1. Mối liên hệ giữa Java với C và C++ 
- Java kế thừa cú pháp từ C và mô hình đối tượng của Java phỏng theo C++. Vì sao?
+ Không lãng phí thời gian tạo ra những thứ đã có rồi
+ Kỹ nguyên ngôn ngữ lập trình bắt đầu từ C, sau đó chuyển sang C++. Như vậy lập trình viên có thể thích ứng được
**Note:**\
+ C++ là phần mở rộng của C (Các mở rộng của C++ phần lớn nhằm tới mục đích lập trình hướng đối tượng)
+ Java không được thiết kế để thay thế cho C/C++. Vì C++ hỗ trợ con trỏ, con trỏ là địa chỉ của đối tượng nào đó được lưu trong bộ nhớ 
=> Vi phạm bảo mật. Nên Java không hỗ trợ con trỏ
### 1.2. Mối liện hệ giữa Java và C#
- Sau vài năm ra đời của Java, Microsoft đã phát triển ngôn ngũ C#. 
- Ngôn ngữ Java sẽ phù hợp với các dự án lớn có tính ổn định (Tài chính, ngân hàng, chứng khoán).
- Còn các dự án tầm trung muốn đưa ra nhanh sản phầm thì người ta hay chọn C#
## 2. Sự đóng góp của Java đối với Internet 
- Java đã sáng tạo ra một loại chương trình chạy trên mạng gọi là **Applet**
- Java đã giải quyết một số vấn đề gai góc nhất của Internet: **tính khả chuyền và tính bảo mật**
### 2.1. Java Applet
- Applet là một ứng dụng nhỏ được viết bởi ngôn ngữ Java
- Applet có thể nhúng vào trang web và chạy trong trình duyệt web. Bạn không cần cài đặt applet vào trang web
### 2.2. Bảo mật
- Khi tải xuống 1 chương trình => đoạn mã có thể bị cài virus, mã độc,…
- Để giải quyết vấn đề này Java thực hiện bằng cách hạn chế applet trong môi trường thực hiện Java (java execution environment) và
 không cho phép nó truy cập vào thành phần khác trên máy tính