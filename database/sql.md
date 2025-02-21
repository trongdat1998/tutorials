#Giới thiệu về SQL

## Khái niệm
- SQL (Structured Query Language) là một ngôn ngữ truy vấn
- Để thực hiện các truy vấn SQL, bạn cần cài đặt như: Oracle, MySQL, MongoDB, PostGres SQL, SQL Server, DB2, …
## Các lệnh trong SQL:
- Ngôn ngữ truy vấn dữ liệu (Data Query Language - DQL)
	+ Là những câu lệnh truy vấn dữ liệu nhưng không làm thay đổi dữ liệu
	+ Lệnh được dùng: SELECT
	※ Một số nhà phát triển sẽ không đề cập đến DQL mà sẽ gộp nộ dùng phần này vào DML
- Ngôn ngữ thao tác dữ liệu (Data Manipulation Language - DML)
	+ Là những câu lệnh làm thay đổi dữ liệu trong các đối tượng cơ sở dữ liệu (các bảng)
	+ Lệnh được dùng: INSERT, UPDATE, DELETE
- Ngôn ngữ định nghĩa dữ liệu (Data Definition Language - DDL)
	+ Là những câu lệnh tạo và chỉnh sửa đối tượng cơ sở dữ liệu (các bảng)
	+ Lệnh được dùng: CREATE, ALTER, DROP
- Ngôn ngữ điều khiển dữ liệu (Data Control Language - DCL)
	+ Là những câu lệnh quản lý quyền sử dụng cơ sở dữ liệu (các bảng)
	+ Lệnh được dùng: GRANT, REVOKE
## Kiểu dữ liệu trong SQL
※ Độ dài cố định và không cố định
- Độ dài cố định:
+ Không thay đổi được không gian bộ nhớ
+ VD: Khi bạn cấp bộ nhớ là 5 ký tự 「CHAR(5)」 nhưng chỉ dùng hết 3 ký tự 「VALUES ('SQL')」 => máy bạn vẫn cấp phát bộ nhớ cho 5 ký tự
- Độ dài biến đổi
+ Thay đổi được không gian bộ nhớ
+ VD: Khi bạn cấp bộ nhớ là 5 ký tự 「CHAR(5)」 nhưng chỉ dùng hết 3 ký tự 「VALUES ('SQL')」 => máy bạn chỉ cấp phát bộ nhớ 3 ký tự
※ Sự khác biệt giữa CHAR và NCHAR trong SQL?
- CHAR lưu trữ các ký tự ASCII, trong khi NCHAR lưu trữ các ký tự Unicode.

- Kiểu dữ liệu chuỗi kí tự

|		MySQL		|		SQL Serve		|	Oracle Databases	|			Cách sử dùng			|
|:--------------------------|:--------------|:----------------------|:----------------------------------|
|	CHAR(0~255)		|	CHAR(1~800)			|	todo				|	Độ dài cố định <br> Lưu trữ văn bản ngắn: Tên người, Mã sản phẩm|
|		-			|	NCHAR(1~4000)		|	todo				|	Độ dài cố định <br> △			|
|	VARCHAR(0~65535)|	VARCHAR(1~8000) hoặc <br> VARCHAR(max) = 2GB|	Oracle todo						|	Độ dài biến đổi	<br> △|
|					| NVARCHAR(1~4000) hoặc <br> NVARCHAR(max) = 2GB|	Oracle todo						|	Độ dài biến đổi	<br> △|
|					|	TEXT (Tối đa 2GB)	|			Oracle todo	|	Độ dài biến đổi	<br>Lưu trữ văn bản dài: Mô tả sản phẩm, Nội dung bài viết blog, Tệp JSON hoặc XML|
|					|	NTEXT (Tối đa xấp xỉ 1 GB)|					|	Độ dài biến đổi	<br> △			|
|					|	BINARY(1~8000)		|	Oracle todo			|	Độ dài cố định <br> Lưu trữ dữ liệu nhị phân nhỏ: Hash mật khẩu và Chuỗi mã hóa	|
|					|	VARBINARY(1~8000 ) hoặc <br> VARBINARY(max)= 2GB|	Oracle todo					|	Độ dài biến đổi <br> △	|
|					|	IMAGE (Tối đa 2GB)	|Oracle todo			|	Độ dài biến đổi <br> Lưu trữ dữ liệu nhị phân lớn: Hình ảnh, Video, Tệp âm thanh 	|

- Kiểu dữ liệu dạng số trong SQL Server

|			Cú pháp			|			Kích thước			|			Cách sử dùng			|
|:--------------------------|:------------------------------|:----------------------------------|
|	BIT	|	số nguyên 0, 1 hoặc NULL	|	~	|
|	TINYINT	|	 0 ~ 255	|	~	|
|	SMALLINT	|	-32768 ~ 32767	|	~	|
|	INT	|	-2,147,483,648 đến 2,147,483,647	|	~	|
|	BIGINT	|	từ -9,223,372,036,854,775,808 đến 9,223,372,036,854,775,807	|	~	|
|	DECIMAL(m,d)	|	m mặc định là 18 nếu không được chỉ định cụ thể. d mặc định là 0 nếu không được chỉ định cụ thể. | m là tổng số lượng các số còn d là số lượng các số nằm sau dấu phẩy.
|	DEC(m,d)	|	
|	NUMERIC(m,d) =>todo
|	FLOAT(n)	|	số dấu phẩy động n mặc định là 53 nếu không được chỉ định cụ thể	|	~	|
|	REAL	|	tương đương với FLOAT(24)	|		|
|	SMALLMONEY	|		từ - 214,748.3648 đến 214,748.3647	|	a	|
|	MONEY	|		từ -922,337,203,685,477.5808 đến 922,337,203,685,477.5807	|	a	|