# Biến và khai báo biến
- Biến dùng để lưu trữ dữ liệu
- Cú pháp: *var tenbien;*
- Cách đặt tên biến
	+ Tên biến bao gồm chữ cái và số, nhưng không được bắt  đầu bằng số
	+ Tên biến không bao gồm dấu cách và dấu câu, ngoại trừ dấu gạch dưới (_).
- Có thể khai báo nhiều biến trên một dòng
	```js
	var x, y, zeta;
	```
- Có thể vừa khai báo vừa khởi tạo giá trị cho biến
	```js
	var x =1;
	var x =1, y ="hello";
	```
# Kiểu dữ liệu
- JavaScript hỗ trợ những kiểu dữ liệu sau
 + Kiểu số
 + Kiểu chuỗi ký tự
 + Kiểu Boolean
 + Kiểu mảng
 + Object
## Kiểu số
- JavaScript không chia ra kiểu Double, Interger.. như các ngôn ngữ khác
### Các hàm thao tác với kiểu số
- isNAN(): Xác định xem tham số truyền vào có phải là số hay không
	+ Nếu là số, trả về False
	+ Nếu không phải là số, trả về True
- Lớp tiện ích math.

|		Phương thức		|			Giải thích			|		Ví dụ		|		Kết quả		|
|:---------------------:|:-----------------------------:|:-----------------:|:------------------|
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
### Các thuộc tính và phương thức của String
- Thuộc tính *length*: Đếm số ký tự\
	*string.length*
- Phương thức *subString*: Cắt chuỗi\
	*string.substring(start, end);*
- Phương thức *concat*: Nối chuỗi\
	*string.concat(chuoi_duoc_noi_them);*
- Phương thức *toUpperCase*: Chuyển hết về in hoa.\
	*string.toUpperCase();*
- Phương thức toLowerCase(): Chuyển hết về in thường.\
	*string.toLowerCase()*
## Kiểu Boolean
- Kiểu Boolean có hai giá trị là true và false
- Các biểu thức Boolean thường được sử dụng trong các cấu trúc điều khiển.
## Mảng
- Mảng là kiểu dữ liệu dùng để lưu một tập các dữ liệu có kiểu giống nhau.
- Cú pháp khai báo và gán giá trị cho mảng:
	+ Cách thứ nhất
	```js
	var convat = new Array(); 
	convat[0] = "meo"; 
	convat[1]= "ho"; 
	convat[2] = "voi"; 
	```
	+ Cách thứ hai
	```js
	var convat = new Array("meo", "ho", "voi"); 
	```
## Gía trị null và Undefines
- Gía trị Null: Nghĩa là không gì cả\
	*var x = null;\
	 \\\khác với\
	var x = "";*
- Gía trị Undefined: Chưa xác định được giá trị\
	*var x;*
# Ép kiểu
- Ép kiểu ngầm định: Trình thông dịch tự động chuyển kiểu.
- Ép kiểu tường mình:
	+ Ép kiểu số thành chuỗi
	```js
	var x = String(1000);
	console.log(typeof(x));
	```
	+ Ép kiểu chuỗi thành số
	```js
	var x = "1000"; 
    var y = Number(x); 
    console.log(y);
	```
# Toán tư
- JavaScript hỗ trợ các toán tử lôgíc, toán tử số học, toán tử quan hệ và toán tử một ngôi 
- Giống như các ngôn ngữ khác
# HÀM Prompt
- Dùng để lấy dữ liệu do người dùng nhập vào. Hàm trả về giá trị mà người dùng đã nhập





