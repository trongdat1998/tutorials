# Chương 1 - Căn bản về cơ sở dữ liệu
- note: các khái niệm và kỹ năng chính
+ Các thuộc tính của cơ sở dữ liệu
+ Các mô hình cơ sở dữ liệu thông dụng
+ Tóm lược lịch sử cơ sở dữ liệu
+ Tại sao lại phải tập chung vào mô hình quan hệ?
## Các thuộc tính của cơ sở dữ liệu
- Cơ sở dữ liệu (database): là tập hợp các thành phần dữ liệu có liên quan lẫn nhau, được quản lý dưới dạng một đơn vị duy nhất.
- Thể hiện (instance): là một phiên bản của phần mềm cơ sở dữ liệu đang chạy trong bộ nhớ
- Đối tượng cơ sở dữ liệu (database object): là một cấu trúc dữ liệu được đặt tên và lưu trữ trong cơ sở dữ liệu.
- Mô hình cơ sở dữ liệu (database model): là cách cơ sở dữ liệu tổ chức dữ liệu của nó để mô phỏng thế giới thực
## Hệ quản trị cơ sở dữ liệu
- Hệ quản trị cơ sở dữ liệu (database management system - DBMS) là một phầm mềm được cung cấp bởi nhà cung cấp cơ sở dữ liệu
- Các sản phẩm phầm mềm: Microsoft Access, Oracle, Microsoft SQL Server, Sybase ASE, DB2, Ingres và MySQL
- DBMS cung cấp tất cả các dịch vụ cơ bản cần thiết để tổ chức và duy trì cơ sở dữ liệu, nó bao gòm các dịch vụ như dưới
+ Input + Output file dữ liệu vật lý
+ Quản lý người truy cập dữ liệu, bao gồm việc ngăn các cập nhật tại cùng một thời điểm xung đột lẫn nhau
+ Quản lý giao dịch (transaction) - nếu giao dịch thành công thì tất cả các thay đổi của database sẽ được thực hiện,
 ngược lại nếu giao dịch thất bại sẽ không có bất kỳ thay đổi nào được lưu vào database
+ Hỗ trợ ngôn ngữ truy vần (query language)- hệ thống lệnh do người dùng database sử dụng để truy xuất dữ liệu từ database
+ Cho phép sao lưu dự phòng cơ sở dữ liệu và phục hồi sau sự cố
+ Cung cấp cơ chế bảo mật để ngăn các truy cập và chỉnh sửa không được cấp phép