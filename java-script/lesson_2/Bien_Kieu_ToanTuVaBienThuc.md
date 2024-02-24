# Biến và khai báo biến
- Biến dùng để lưu trữ dữ liệu
- Cú pháp: *var tenbien;*
- Cách đặt tên biến
	+ Tên biến bao gồm chữ cái và số, nhưng không được bắt  đầu bằng số
	+ Tên biến không bao gồm dấu cách và dấu câu, ngoại trừ dấu gạch dưới (_).
- Có thể khai báo nhiều biến trên một dòng\
	*var x, y, zeta;*
- Có thể vừa khai báo vừa khởi tạo giá trị cho biến
	*var x =1;*\
	*var x =1, y ="hello";*
# Kiểu dữ liệu
- JavaScript hỗ trợ những kiểu dữ liệu sau
 + Kiểu số
 + Kiểu chuỗi ký tự
 + Kiểu Boolean
 + Kiểu mảng
 + Object
## Kiểu số
- JavaScript không chia ra kiểu Double, Interger.. như các ngôn ngữ khác
## Các hàm thao tác với kiểu số
- isNAN(): Xác định xem tham số truyền vào có phải là số hay không
	+ Nếu là số, trả về False
	+ Nếu không phải là số, trả về True
- Lớp tiện ích *math*\
|		Phương thức		|		Giải thích		|		Ví dụ		|		Kết quả		|
|:----------------------|:----------------------|:------------------|:------------------|
|Math.random()			|Trả về số ngẫu nhiên trong khoảng từ o đến 1| | |
|Math.abs(x)|Trả về giá trị tuyệt đối của x|Math.abs(-2)|2|
|Math.pow(x,y)|Trả về giá trị của x mũ y|Math.pow(2,3)|8|
|Math.round(x)|Trả về giá trị làm tròn của x|Math.round(2.6)|3|
## Kiểu chuỗi ký tự
- String được bao quanh bởi cặp dấu nháy kép\
	*"Hello word"*
- Ký tự đặc biệt
|	Ký tự	|	giải thích	|
|:----------|:--------------|
|	\'		|	'			|
|	\"		|	"			|
|	\b		|	Dấu cách	|
|	\t		|	Dấu tab		|
|	\n		|	Xuống dòng	|
## Các thuộc tính và phương thức của String
- Thuộc tính *length*: Đếm số ký tự\
	*var x = "Toi la String."*\
	*alert(x.length); // kq: 14*
	


