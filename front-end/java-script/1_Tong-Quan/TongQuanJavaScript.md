# 1. JavaScript là gì?
- Javascript là một ngôn ngữ lập trình kịch bản
- Javascript được hỗ trợ hầu như trên tất cả các trình duyệt như Firefox, Chrome, ... trên máy tính lẫn điện thoại.
- JavaScript không thể kết nối đến một database server
- Nhiệm vụ: Javascript là một ngôn ngữ lập trình trên trình duyệt ở phía client
# 2. Javascript Framework là gì?
- Javascript Framework là một bộ thư viện được xây dựng dựa vào ngôn ngữ lập trình Javascript
- JavaScript frameworks phổ biến nhất hiện nay:
	+ **Angular:** Một thư viện dùng để xây dựng ứng dụng Single Page.
	+ **NodeJS:** Một thư viện được phát triển phía Server dùng để xây dựng ứng dụng realtime.
	+ **Sencha Touch:** Một Framework dùng để xây dựng ứng dụng Mobile.
	+ **ExtJS:** Một Framework dùng xây dựng ứng dụng quản lý (Web Applications)
	+ **jQuery:** Một thư viện rất mạnh về hiểu ứng.
	+ **ReactJS:** Một thư viện viết ứng dụng mobie.
# 2. Chương trình JavaScript
- Một chương trình JavaScript cũng giống như chương trình viết bằng các ngôn ngữ khác
	+ Một chương trình JavaScript bao gồm nhiều câu lệnh
	+ Một câu lệnh được tạo nên từ các toán tử, từ định danh, biến...
- Mã JavaScript được viết trong thẻ *script* và đặt trong thẻ *head* hoặc (và) *body*\
	```js
		<script language="javascript">
		alert("Hello World!");
		</script>
	```
	[Chú ý]: Nên đặt mã JavaScript trong thẻ *script* đặt ở cuối phần body để đảm bảo tất cả các thành phần được load
## 2.1. Công cụ để lặp trình JavaScript
- JavaScript là ngôn ngữ thông dịch, bộ thông dịch được tích hợp sẵn trên  trình duyệt nên không cần bất cứ công cụ đặc biệt nào để lập trình
- Có thể viết mã JavaScript trên chương trình soạn thảo văn bản như notepad
## 2.3. Quy tăc cơ bản của JavaScript
- JavaScript phân biệt chữ hoa chữ thường
- JavaScript bỏ qua các ký tự cách
- Ký tự dấu chấm phẩy (;) để kết thúc một dòng lệnh. Ký tự này là bắt buộc
## 3. Lưu mã JavaScript vào file bên ngoài
- Để viết chương trình JavaScript thì có hai cách
	+ Tạo chung với HTML
	+ Viết riêng một file cho JavaScript
- Các bước để lưu mã JavaScript vào file bên ngoài
	+ B1. Tạo file txt mới
	+ B2. Viết mã JavaScript
	+ B3. Đổi file thành file js
	+ B4. Gán địa chỉ của file cho thuộc tính\
[Chú ý]: Nên để file js và html cùng một thư mục