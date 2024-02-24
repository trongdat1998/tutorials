# JavaScript là gì?
- Mỗi trang web gồm 3 thành phần
	+ Phần nội dung (HTML)
	+ Phần trình bày (CSS)
	+ Phần hành động (JavaScript)
- JavaScript hồi đáp lại các tương tác của người dùng:
	+ Khi người dùng nhấn chuột
	+ Khi người dùng nhấn vào menu
- JavaScript không thể kết nối đến một database server
## ECMAScript (European Computer Manufactures)
- Là tài liệu đăc tả (phiên bản) đầu tiên cho JavaScript
## JavaScript có thể làm được gì?
- Thực hiện các tác vụ phía Client
	+ Tạo menu xổ xuống
	+ Thay đổi nội dung trên trang web
	+ Thêm các thành phần động vào trang web
- JavaScript có thể viết Game
# Chương trình JavaScript
- Một chương trình JavaScript cũng giống như chương trình viết bằng các ngôn ngữ khác
	+ Một chương trình JavaScript bao gồm nhiều câu lệnh
	+ Một câu lệnh được tạo nên từ các toán tử, từ định danh, biến...
- Mã JavaScript được viết trong thẻ <script> và đặt trong thẻ <head/> hoặc (và) <body/>\
	[Chú ý]: Nên đặt mã JavaScript trong thẻ <script/> đặt ở cuối phần body để đảm bảo tất cả các thành phần được load
## Công cụ để lặp trình JavaScript
- JavaScript là ngôn ngữ thông dịch, bộ thông dịch được tích hợp sẵn trên  trình duyệt nên không cần bất cứ công cụ đặc biệt nào để lập trình
- Có thể viết mã JavaScript trên chương trình soạn thảo văn bản như notepad
## Quy tăc cơ bản của JavaScript
- JavaScript phân biệt chữ hoa chữ thường
- JavaScript bỏ qua các ký tự cách
- Ký tự dấu chấm phẩy (;) để kết thúc một dòng lệnh. Ký tự này là bắt buộc
# Câu lệnh JavaScript
- Câu lệnh JavaScript chia làm hai loại
	+ Câu lệnh đơn\
	*var x =4;*
	+ Câu lệnh kép\
	*if( x ==1){ *\
		*//Viết câu lệnh ở đây *\
	*} else { *\
		*//Viết câu lệnh ở đây *\
	*}*
## 	Hàm (function)
- JavaScript cung cấp nhiều hàm dựng sẵn (built-in function)
	+ alert()
- JavaScript cũng cho phép người dùng tự định nghĩa hàm\
	*function ham() {*\
	   *//Thân hàm*\
	*}*
## Lưu mã JavaScript vào file bên ngoài
- Để viết chương trình JavaScript thì có hai cách
	+ Tạo chung với HTML
	+ Viết riêng một file cho JavaScript
- Các bước để lưu mã JavaScript vào file bên ngoài
	+ B1. Tạo file txt mới
	+ B2. Viết mã JavaScript
	+ B3. Đổi file thành file js
	+ B4. Gán địa chỉ của file cho thuộc tính\
[Chú ý]: Nên để file js và html cùng một thư mục