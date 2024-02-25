# Phương thức lập trình
- Lập trình là để giải quyết các vấn đề trong cuộc sống.
- Có hơn 25 phương thức lập trình.
    + Mỗi phương thức lập trình giải quyết cho một vấn đề
    + Một số phương thức khó áp dụng trong thực tiễn lập trình
    + Một số phương thức lập trình chỉ được hưởng ứng bởi một nhóm người hay trong một thời gian ngắn
- Những phương thức lập trình phổ biến:
    + Lập trình hướng sự kiện
    + Lập trình hướng thành phần 
    + Lập trình cấu trúc
    + Lập trình hướng đối tượng
- Phương thức lập trình hướng đối tượng được phát triển rộng rãi hơn cả
# Lập trình hướng đối tượng
- TODO
# Mô hình BOM (Browser Object Model)
-  Còn gọi là các đối tượng liên quan đến trình duyệt browser. Mỗi browser sẽ có những đối tượng khác nhau nên nó không có chuẩn chung nào cả
- Đối với mỗi đối tượng, mỗi trình duyệt hỗ trợ các thuộc tính và phương thức khác nhau
## Đối tượng Window
- Window là đối tượng thể hiển cửa số hiển thị hiện tại trên trình duyệt.
- Các thuộc tính của Window

|       Thuộc tính      |           giải thích          |
|:----------------------|:------------------------------|
|closes |Có giá trị là True khi cửa sổ được đóng|
|defaultStatus  |hiết lập văn bản mặc định trên thanh trạng thái của trình duyệt|
|name   |Thiết lập hoặc trả về tên của cửa sổ|
|opener |Tham chiếu đến cửa sổ tạo ra cửa sổ hiện tại|
|status |Thông tin xuất hiện trên thanh trạng thái|
|innerHeight    |Thiết lập hoặc trả về chiều cao phần nội dung của cửa sổ|
|document |Trả về đối tượng document của cửa sổ|
- Các phương thức của Window

|       Phương thức     |           Giải thích          |
|:----------------------|:------------------------------|
|focus()    |Chuyển focus đến cửa sổ|
|blur() |Bỏ focus đến cửa sổ|
|close() |Đóng cửa sổ|
|open() |Mở cửa sổ|
|print()    |Thực hiện chức năng in|
|moveTo()   |Sử dụng để chuyển cửa sổ về vị trí xác định|
|resizeTo() |Thay đổi kích thước cửa cửa sổ về vị trí xác định|
- Window.open(): Sử dụng để mở một cửa sổ tư cửa sổ hiện thời\
    *window.open(url, ten, dactinh)*
    + url: url của trang web
    + ten: tên của cửa sổ sẽ mở
    + dactinh: các đặc tính mà cửa sổ được mở sẽ có (mỗi trình duyệt sẽ hỗ trợ một tập các đặc tính riêng)
## Đối tượng Screen

|       Thuộc tính      |           Giải thích          |
|:----------------------|:------------------------------|
|availHeight    |Trả về chiểu dài của màn hình (trừ kích thước của window taskbar)|
|availWidth     |Trả về chiều rộng của màn hình (trừ kích thước của window taskbar)|
|height     |Trả về chiều dài của màn hình|
|with       |Trả về chiểu rộng của màn hình|
|pixelDepth |Trả về độ phân giải của màn hình|
|colorDepth |Trả về bảng màu để hiển thị ảnh|
## Đối tượng Navigator
- Cung cấp các thông tin về trình duyệt. Mỗi trình duyệt có cách thức thi hành mã JavaScript riêng

|       Thuộc tính      |           Giải thích          |
|:----------------------|:------------------------------|
|appCodeName    |Trả về mã của trình duyệt|
|appName    |Trả về tên của trình duyệt|
|appVersion     |Trả về phiên bản của trình duyệt|
|cookieEnabled  |Xác định xem Cookie có được bật hay không|
|platform   |Trả về nền tảng mà trình duyệt được biên dịch|

|       Phương thức      |           Giải thích          |
|:-----------------------|:------------------------------|
|javaEnabled()    |Xác định xem trình duyệt có kích hoạt Java hay không|
## Đối tượng History
- Chứa thông tin về các URL được người dùng truy cập

|       Thuộc tính      |           Giải thích          |
|:----------------------|:------------------------------|
|length |Trả về số lượng URL trong danh sách History|

|       Phương thức      |           Giải thích          |
|:-----------------------|:------------------------------|
|back() |Load URL trước đó trong danh sách History|
|forward()  |Load URL sau đó trong danh sách History|
|go()   |Load URL cụ thể từ History|

