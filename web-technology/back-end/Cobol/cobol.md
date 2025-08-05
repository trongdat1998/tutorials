### 1. Cấu trúc chương trình COBOL cơ bản
-  Mỗi chương trình COBOL thường bao gồm 4 DIVISION
	+ IDENTIFICATION: Chứa thông tin về chương trình như tên chương trình, tác giả, mục đích và phiên bả
	+ ENVIRONMENT: Xác định môi trường làm việc của chương trình
	+ DATA: Kkhai báo biến
	+ Procedure Division: Chứa logic xử lý
- Mỗi DIVISION nhiều SECTION nhiều PARAGRAPH nhiều SENTENCE nhiều STATEMENT

	```cobol
	IDENTIFICATION DIVISION.
		PROGRAM-ID. HELLOWORLD.
	ENVIRONMENT DIVISION.
	DATA DIVISION.
		WORKING-STORAGE SECTION
	PROCEDURE DIVISION.
		DISPLAY "Hello world".
		STOP RUN.
	```
#### 1.1. Câu lệnh cơ bản trong PROCEDURE
- DISPLAY – In ra màn hình
	```cobol
	DISPLAY "Xin chào".
	```
- ACCEPT – Nhận đầu vào từ người dùng
	```cobol
	ACCEPT TEN-NGUOI-DUNG.
	```
- MOVE – Gán giá trị cho biến
	```cobol
	MOVE "ChatGPT" TO TEN-BOT.
	```
- IF – Câu lệnh điều kiện
	```cobol
	IF DIEM > 5
	DISPLAY "Đậu"
	ELSE
		DISPLAY "Rớt"
	END-IF.
	```
- PERFORM – Gọi đoạn mã (giống như hàm)
	```cobol
	PERFORM IN_HIEN_THI.

	IN_HIEN_THI.
		DISPLAY "Thông báo từ hàm con".
		EXIT.
	```
- Dùng *> để ghi chú ở cuối dòng (inline comment)
	```cobol
	DISPLAY "Nhập số:"       *> Hiển thị lời nhắc nhập số
	```
#### 1.2. Quy tắc căn lề trong COBOL
- Cột 1 ~ 6: sử dụng để đánh số thứ tự các dòng code. (có thể bỏ)
- Cột 7: Dùng các ký tự đặc biệt để xác định loại dòng
	+ 「* - Dòng chú thích (comment) 」
	+ 「* - Dòng chú thích (comment) 」
- Cột 8 ~ 11: Nơi viết tên division, section, paragraph
- Cột 12 ~ 72: Câu lệnh, biến, logic
- Sau cột 72: Không dùng (bị bỏ qua)
#### 1.3. Hằng số hình tượng
- ZERO / ZEROS / ZEROES ⇒ Một hoặc nhiều chữ số 0 
- SPACE / SPACES ⇒ Một hoặc nhiều ký tự khoảng trắng (" ")
- HIGH-VALUE / HIGH-VALUES ⇒ Giá trị cao nhất trong bảng mã ký tự
- LOW-VALUE / LOW-VALUES ⇒ Giá trị thấp nhất trong bảng mã ký tự
- QUOTE / QUOTES ⇒ Một hoặc nhiều dấu ngoặc kép (")
- ALL ⇒ Dùng để lấp đầy một biến với một giá trị nhất định

### 2. Data types (kiểu dữ liệu)

#### 2.1. Cách khai báo biến trong COBOL
- COBOL thực chất chỉ có 2 kiểu dữ liệu: **số** và **chuỗi**.
- PIC: viết tắt của PICTURE, chỉ định cấu trúc của dữ liệu
- Các ký hiệu như 9, X, A, S, V... xác định kiểu dữ liệu.
- Số ở sau là độ dài của dữ liệu\
	※ Kiểu số
	+ 9 ⇒ Một chữ số từ 0–9
	+ S ⇒ Dấu âm hoặc dương (Sign)
	+ V ⇒ Dấu chấm thập phân ảo (không hiển thị)
		```cobol
		01 LUONG        PIC 9(5).        *> 5 chữ số nguyên
		01 GIA-TIEN     PIC 9(4)V99.     *> 4 chữ số nguyên, 2 thập phân
		01 SO-AM        PIC S9(6)V99.    *> Số có dấu
		```
	※ Chữ + số
	+ X ⇒ Một ký tự bất kỳ (chữ, số, ký hiệu)
		```cobol
		01 TEN-SAN-PHAM  PIC X(20).   *> 20 ký tự bất kỳ
		```
	※Chỉ chữ cái
	+ A ⇒ Một ký tự chữ cái (A–Z hoặc a–z)
		```cobol
		01 MA-CHU        PIC A(5).     *> 5 chữ cái
		```
	※ COBOL còn hỗ trợ các kiểu lưu trữ tối ưu:
	+ COMP ⇒ Lưu số dưới dạng nhị phân (binary)
	+ COMP-1 ⇒ Kiểu dấu phẩy động (float)
	+ COMP-2 ⇒ Kiểu dấu phẩy động độ chính xác cao
	+ COMP-3 ⇒ Dữ liệu số dạng packed decimal (nén)
		```cobol
		01 SO-DEM       PIC 9(4) COMP.        *> Số dạng nhị phân
		01 LUONG-NEN    PIC S9(6)V99 COMP-3.  *> Số dạng packed
		```
#### 2.2. Các Level Number thường dùng
- 01 ⇒ Biến cấp cao nhất – thường là đầu của một cấu trúc dữ liệu
- 02  ~ 49 ⇒ Cấp con (sub-levels) bên trong biến cấp 01 hoặc bên trong group khác
- 66 ⇒ Dùng để định nghĩa tên thay thế (RENAMES) cho các biến khác
- 77 ⇒ Biến độc lập, không thuộc group nào
- 88 ⇒ Mức điều kiện 
	+ Ví dụ 1: Biến nhóm với cấp độ lồng nhau
		```cobol
		01 NHAN-VIEN. 					*>NHAN-VIEN là biến nhóm cấp 01
			05 TEN        PIC X(20). 	*> TEN, TUOI, DIA-CHI là cấp 05 – thành phần của NHAN-VIEN
			05 TUOI       PIC 99.
			05 DIA-CHI.
				10 SO-NHA     PIC X(10). *> SO-NHA, DUONG, QUAN là cấp 10 – thành phần của DIA-CHI
				10 DUONG      PIC X(20).
				10 QUAN       PIC X(15).
		```
	+ Ví dụ 2: Dùng 66 – Định danh thay thế 
		```cobol
		01 HO-TEN.
			05 HO      PIC X(10).
			05 TEN     PIC X(10).
		66 TEN-DAY-DU RENAMES HO THRU TEN. *>66 dùng để gán tên mới cho một phần của group đã khai báo
		```
	+ Ví dụ 3: Dùng 77 – Biến độc lập
		```cobol
		77 MA-NHAN-VIEN     PIC 9(5). 	*>77 dùng cho biến không nằm trong bất kỳ nhóm nào.
		```
	+ Ví dụ 4: Dùng 88 – Tên điều kiện
		```cobol
		01 TRANG-THAI       PIC X(1).
			88 LA-NAM         VALUE "M". *> TRANG-THAI == M => returt LA-NAM = true
			88 LA-NU          VALUE "F". *> TRANG-THAI == F => returt LA-NU = true
		```
### 3. Basic Verbs
#### 3.1. Input / Output Verbs
- ACCEPT ⇒ Nhận đầu vào từ người dùng hoặc hệ thống
- DISPLAY ⇒ In thông tin ra màn hình hoặc thiết bị đầu ra
	```cobol
	IDENTIFICATION DIVISION.
		PROGRAM-ID. NHAP-XUAT-DON-GIAN.

		DATA DIVISION.
		WORKING-STORAGE SECTION.

		01 TEN-NGUOI-DUNG     PIC A(20).

		PROCEDURE DIVISION.
		BEGIN.
			DISPLAY "Nhap ten cua ban: ".
			ACCEPT TEN-NGUOI-DUNG. *> hiển thị màn hình console bạn cần nhập ký tự

			DISPLAY "Xin chao, " TEN-NGUOI-DUNG. *> In ra ký tự bạn vừa nhập

			STOP RUN.
	```
#### 3.2. Initialize Verb
- Dùng để đặt lại giá trị mặc định, nếu là kiểu số thì về 0, nếu là kiểu chữ thì sẽ về khoảng trắng
	```cobol
		WORKING-STORAGE SECTION.
		01 WS-DATA.
			05 WS-NUMBER   PIC 9(5) VALUE 12345.
			05 WS-NAME     PIC X(10) VALUE 'NGOC ANH'.

		PROCEDURE DIVISION.
			DISPLAY "Trước INITIALIZE:".
			DISPLAY WS-NUMBER.
			DISPLAY WS-NAME.

			INITIALIZE WS-DATA. *> Các giá trị được gán trước đấy sẽ về giá trị mặc định

			DISPLAY "Sau INITIALIZE:".
			DISPLAY WS-NUMBER.
			DISPLAY WS-NAME..
	```
- Kết quả:
	```
	Trước INITIALIZE:
	12345
	NGOC ANH
	Sau INITIALIZE:
	00000
	 
	```
#### 3.3. Move Verb
- Lệnh dùng để gán giá trị
	```cobol
	    WORKING-STORAGE SECTION.
			01 NAME        PIC X(10).
			01 AGE         PIC 9(2).

        PROCEDURE DIVISION.
           MOVE "NGOC ANH" TO NAME.
           MOVE 25 TO AGE.

           DISPLAY "Ten: " NAME. *> Ten: NGOC ANH
           DISPLAY "Tuoi: " AGE. *> Tuoi: 25
	```
### 3.4. Add Verb
-  Dùng để cộng số
	```cobol
	01 A   PIC 9(3) VALUE 5.
	01 B   PIC 9(3) VALUE 10.
	01 c   PIC 9(3) VALUE 10.
	PROCEDURE DIVISION.
		ADD A TO B
		ADD A B TO C
		DISPLAY "kq:" B.     *> kq: 15
		DISPLAY "kq:"C.      *> kq: 30
	```
#### 3.5. Subtract Verb
- Dùng để thực hiện phép trừ 
	```cobol
	01 A PIC 9(3) VALUE 5.
	01 B PIC 9(3) VALUE 10.
	01 c PIC 9(3) VALUE 50
	PROCEDURE DIVISION.
		SUBTRACT A FROM B
		SUBTRACT A B FROM C
		DISPLAY "kq:" B.     *> kq: 5
		DISPLAY "kq:" C.     *> kq: 40
	```
#### 3.6. Multiply Verb
- Dụng để thực hiện phép nhân
	```cobol
	01 A   PIC 9(3) VALUE 3.
	01 B   PIC 9(3) VALUE 5.
	01 C   PIC 9(3) VALUE 2.
	PROCEDURE DIVISION.
		MULTIPLY A BY B
		MULTIPLY A BY B GIVING C *> không làm thay đổi A hay B
		DISPLAY "kq:" B.     *> kq: 15
		DISPLAY "kq:" C.	 *> kq: 045

	```
#### 3.7. Divide Verb
- Dùng để thực hiện phép chia
	```cobol
	01 A PIC 9(3) VALUE 2.
	01 B PIC 9(3) VALUE 10.
	PROCEDURE DIVISION.
		DIVIDE A INTO B
		DISPLAY "kq:"B.           *> Kết quả: 5
	```
#### 3.8. Compute Statement
- Dùng để thực hiện tính toán số học phức tạp hơn so với các động từ như: ADD, SUBTRACT, MULTIPLY, hay DIVIDE
	```cobol
	01 A       PIC 9(3) VALUE 10.
	01 B       PIC 9(3) VALUE 5.
	01 RESULT  PIC 9(4).

	PROCEDURE DIVISION.
		COMPUTE RESULT = (A + B) * 2
		DISPLAY RESULT.     *> In ra: 30
	```
### 4. Data Layout
#### 4.1. Redefines Clause
- Cho phép một vùng nhớ được chia sẻ giữa nhiều biến, nghĩa là hai hoặc nhiều biến dùng chung cùng một vùng dữ liệu
- Cú pháp:
	```cobol
	01 ORIGINAL-VARIABLE     PIC X(10).
	01 NEW-VIEW REDEFINES ORIGINAL-VARIABLE.
		05 PART1              PIC X(5).
		05 PART2              PIC X(5).
	```
- Giải thích: Ở đây, NEW-VIEW chia biến ORIGINAL-VARIABLE thành hai phần nhỏ PART1 và PART2, nhưng chúng dùng chung vùng nhớ.
- Ví dụ:
	```cobol
	01 DATA-FIELD            PIC X(6) VALUE 'ABC123'.
	01 SPLIT-FIELD REDEFINES DATA-FIELD.
		05 LETTERS            PIC X(3).
		05 NUMBERS            PIC X(3).

	PROCEDURE DIVISION.
		DISPLAY LETTERS      *> ABC
		DISPLAY NUMBERS      *> 123

	```
#### 4.2. Renames Clause
- Cách để đặt tên mới cho một nhóm các biến liên tiếp trong vùng nhớ
- Cú pháp:
	```cobol
	LEVEL-NUMBER RENAMED-NAME RENAMES FIRST-VARIABLE THRU LAST-VARIABLE.
	```
- Giải thích:
	+ LEVEL-NUMBER: Luôn là 66
	+ RENAMED-NAME: Là tên mới bạn đặt
	+ FIRST-VARIABLE và LAST-VARIABLE: Là hai biến đầu/cuối của nhóm liên tiếp
- Ví dụ:
	```cobol
	01 EMPLOYEE-INFO.
		05 EMP-ID     PIC 9(5).
		05 EMP-NAME   PIC X(20).
		05 EMP-AGE    PIC 99.
		05 EMP-GENDER PIC X.

	66 EMP-NAME-DETAILS RENAMES EMP-NAME THRU EMP-GENDER. *> EMP-NAME-DETAILS giờ là tên đại diện cho cả 3 biến EMP-NAME, EMP-AGE, EMP-GENDER.

	```
#### 4.3. Usage Clause
- Được dùng để xác định cách biểu diễn dữ liệu trong bộ nhớ
- Chi tiết các loại USAGE
	+ USAGE DISPLAY ⇒ Dữ liệu được lưu trữ dưới dạng ký tự (character)
		```cobol
		01 AGE      PIC 99 USAGE DISPLAY.
		```
	+ USAGE COMP ⇒ 	int, short, long trong java
		```cobol
		01 COUNT    PIC 9(4) USAGE COMP.
		```
	+ USAGE COMP-3 => BigDecimal trong java
		```cobol
		01 AMOUNT   PIC S9(6)V99 COMP-3.
		```
	+ USAGE COMP-1 và COMP-2 => COMP-1 = float COMP-2 = double
		```cobol
		01 VALUE1   USAGE COMP-1.
		01 VALUE2   USAGE COMP-2.
		```
#### 5.  Conditional Statements
#### 5.1. IF - ELSE
- Tương tự như trong Java
- Cú pháp: 
	```cobol
	IF điều_kiện
    	THỰC HIỆN_CÂU_LỆNH_1
	ELSE
		THỰC HIỆN_CÂU_LỆNH_2
	END-IF *> Để tránh nhầm lẫn với nhiều IF lồng nhau

	```
#### 5.2. EVALUATE
- Tương tự như switch-case trong Java
- Cú pháp:
	```cobol
	EVALUATE biểu_thức
		WHEN giá_trị_1
		THỰC_HIỆN
		WHEN giá_trị_2
		THỰC_HIỆN
		WHEN OTHER
       THỰC_HIỆN_KHÁC
	END-EVALUATE
	```
### 6. Loop Statements
- Việc lặp (loop) được xử lý chủ yếu thông qua câu lệnh PERFORM
#### 6.1. PERFORM - TIMES (Lặp số lần cố định)
- Cú pháp:
	```cobol
	PERFORM A-PARA 5 TIMES.
	```
- Ví dụ:
	```cobol
	PERFORM DISPLAY-HELLO 5 TIMES.
	DISPLAY-HELLO.
		DISPLAY "Hello World". *> Lặp đúng 5 lần đoạn mã DISPLAY-HELL
	````
#### 6.2. PERFORM VARYING  (Tương đương FOR loop)
- Cú pháp:
	```cobol
	PERFORM A-PARA
		VARYING A FROM 1 BY 1 UNTIL A = 5.
	```
- giải thích:
	+ VARYING:  Giá trị bắt đầu
	+ BY: bước nhảy
	+ UNTIL Điều kiện kết thúc
- Ví dụ:
	```cobol
	01 I      PIC 9(2) VALUE 1.

	PERFORM DISPLAY-NUM
		VARYING I FROM 1 BY 1
		UNTIL I > 5.
	DISPLAY-NUM.
		DISPLAY "Lần lặp: " I. *> Kết quả: in ra I từ 1 đến 5.
	```
#### 6.3 PERFORM UNTIL (Tương đương WHILE)
- Cú pháp:
	```cobol
	PERFORM đoạn-lệnh
    	UNTIL điều_kiện
	```
- Ví dụ:
	```cobol
	01 I      PIC 9(2) VALUE 1.

	PERFORM UNTIL I > 3
		DISPLAY "Lần: " I ADD 1 TO I *> Sẽ lặp và in I cho đến khi I > 3.
	END-PERFORM.
	```
#### 6.4. WITH TEST BEFORE/AFTER (Tương tự như do - while)
- Cú pháp 1:
	```cobol
	PERFORM đoạn-lệnh
    UNTIL điều_kiện
    WITH TEST BEFORE.  *> kiểm tra trước (mặc định)
	```
- Ví dụ 1:
	```cobol
	01 I        PIC 9(1) VALUE 5.

	PROCEDURE DIVISION.
		DISPLAY "== TEST BEFORE =="

		PERFORM UNTIL I > 3
			DISPLAY "I = " I
			ADD 1 TO I
		END-PERFORM

		STOP RUN.
	```
- Giải thích 1:
	+ I bắt đầu từ 5
	+ Điều kiện I > 3 đã đúng ngay từ đầu, nên vòng lặp sẽ không thực hiện gì cả
	+ Không có dòng nào được in ra
- Cú pháp 2:
	```cobol
	PERFORM đoạn-lệnh
    UNTIL điều_kiện
    WITH TEST AFTER.   *> chạy ít nhất 1 lần trước khi kiểm tra
	```
- Ví dụ 2:
	```cobol
	01 I        PIC 9(1) VALUE 5.

	PROCEDURE DIVISION.
		DISPLAY "== TEST AFTER =="

		PERFORM
			DISPLAY "I = " I ADD 1 TO I *> I = 5
		UNTIL I > 3
		WITH TEST AFTER

		STOP RUN.
	```
- Giải thích 2:
	+ Dù I = 5 đã thoả mãn điều kiện dừng, vòng lặp vẫn chạy 1 lần trước
### 7. String Handling
- Dùng để xử lý chuỗi: nối chuỗi, cắt chuỗi, tìm chuỗi con...
### 7.1. STRING – Nối chuỗi
- Cú pháp
	```cobol
	STRING chuỗi-1 DELIMITED BY điều-kiện
       chuỗi-2 DELIMITED BY điều-kiện
       INTO biến-đích
	```
- Ví dụ:
	```cobol
	01 FIRST-NAME  PIC X(10) VALUE "John".
	01 LAST-NAME   PIC X(10) VALUE "Doe".
	01 FULL-NAME   PIC X(25).

	STRING FIRST-NAME DELIMITED BY SPACE
		LAST-NAME  DELIMITED BY SIZE
	INTO FULL-NAME. 	*> FULL-NAME sẽ chứa "JohnDoe"
	```
#### 7.2. UNSTRING – Cắt chuỗi
- Cú pháp:
	```cobol
	UNSTRING biến-nguồn
		DELIMITED BY ký-tự-ngăn-cách
		INTO biến-1, biến-2, ...
	```
- Ví dụ:
	```cobol
	01 ADDRESS     PIC X(30) VALUE "123-Main-Street".
	01 PART1       PIC X(10).
	01 PART2       PIC X(10).
	01 PART3       PIC X(10).

	UNSTRING ADDRESS
		DELIMITED BY "-"
		INTO PART1, PART2, PART3. *> PART1 = "123", PART2 = "Main", PART3 = "Street"
	```
#### 7.3. INSPECT – Đếm hoặc thay thế ký tự
- Cú pháp 1 :Đếm số lần xuất hiện
	```cobol
	INSPECT biến
		TALLYING biến-đếm
		FOR ALL ký-tự
	```
- Ví dụ 1:
	```cobol
	01 TEXT      PIC X(20) VALUE "HELLO WORLD".
	01 COUNT-L   PIC 9(2) VALUE 0.

	PROCEDURE DIVISION.
		INSPECT TEXT 
			TALLYING COUNT-L FOR ALL "L".

		DISPLAY "Số lần xuất hiện của 'L': " COUNT-L. *> Số lần xuất hiện của 'L': 03

		STOP RUN.
	```
- Cú pháp 2: Thay thế hoặc xóa ký tự
	```cobol
	INSPECT biến
		REPLACING ALL " " BY "*"
	```
- Ví dụ 2:
	```cobol
	01 TEXT    PIC X(20) VALUE "HELLO WORLD".

	PROCEDURE DIVISION.
		INSPECT TEXT 
			REPLACING ALL " " BY "*".

		DISPLAY "Chuỗi sau khi thay: " TEXT. *> Chuỗi sau khi thay: HELLO*WORLD

		STOP RUN.

	```
### 8. Table Processing
- Tương tự như xử lý mảng (arrays).
#### 8.1. Khai báo Table (Array)
- Được khai báo bằng mệnh đề OCCURS trong WORKING-STORAGE SECTION hoặc LINKAGE SECTION
- Ví dụ:
	```cobol
	01 STUDENT-NAMES.
    	05 STUDENT-NAME   PIC X(20) OCCURS 5 TIMES. *> Đây là mảng có 5 phần tử, mỗi phần tử là chuỗi 20 ký tự.
	```
#### 8.2. PERFORM VARYING - Duyệt mảng
- Ví dụ:
	```cobol
	01 STUDENT-NAMES.
   	05 STUDENT-NAME   PIC X(20) OCCURS 5 TIMES.
	01 I                 PIC 9(1).

	PROCEDURE DIVISION.
	MOVE "Alice" TO STUDENT-NAME(1)
	MOVE "Bob"   TO STUDENT-NAME(2)
	MOVE "Carol" TO STUDENT-NAME(3)
	MOVE "David" TO STUDENT-NAME(4)
	MOVE "Eve"   TO STUDENT-NAME(5)

	PERFORM VARYING I FROM 1 BY 1 UNTIL I > 5
		DISPLAY "Student: " STUDENT-NAME(I)
	END-PERFORM
	```
- Output:
	```cobol
	Student: Alice               
	Student: Bob                 
	Student: Carol               
	Student: David               
	Student: Eve  
	```
#### 8.3. SEARCH - Tìm kiếm trong mảng
- Ví dụ:
	```cobol
	01 STUDENT-TABLE.
	05 STUDENT-NAME PIC X(20) OCCURS 5 TIMES
		INDEXED BY ST-INDEX.
	01 SEARCH-NAME     PIC X(20) VALUE "Carol".
	PROCEDURE DIVISION.
		MOVE "Alice" TO STUDENT-NAME(1)
		MOVE "Bob"   TO STUDENT-NAME(2)
		MOVE "Carol" TO STUDENT-NAME(3)
		MOVE "David" TO STUDENT-NAME(4)
		MOVE "Eve"   TO STUDENT-NAME(5)

	SEARCH STUDENT-NAME
	AT END
		DISPLAY "K"
	WHEN STUDENT-NAME(ST-INDEX) = SEARCH-NAME
		DISPLAY "C: " ST-INDEX
	END-SEARCH
	```
- Output:
	```cobol
	C: +000000003
	```
#### 9. File
- TODO
### 10. Subroutines
- Là các cách gọi đến các chương trình con (gọi đến các method khác)
#### 10.1 Internal Subroutine – Thủ tục bên trong chương trình
- Là các đoạn mã nằm trong cùng một chương trình
- Ví dụ:
	```cobol
	IDENTIFICATION DIVISION.
	PROGRAM-ID. MainProgram.

	DATA DIVISION.
	WORKING-STORAGE SECTION.
	01 NUM1     PIC 9(3) VALUE 10.
	01 NUM2     PIC 9(3) VALUE 20.
	01 RESULT   PIC 9(4).

	PROCEDURE DIVISION.
		PERFORM ADD-NUMBERS
		DISPLAY "Tổng = " RESULT
		STOP RUN.

	ADD-NUMBERS.
		ADD NUM1 TO NUM2 GIVING RESULT.
	```
- Giải thích:
	+ Gọi bằng PERFORM tên-thủ-tục (ADD-NUMBERS)
	+ Không cần CALL
#### 10.2. External Subroutine - Chương trình con bên ngoài
- Dùng khi bạn muốn tách logic ra thành file độc lập
- Ví dụ 1: Tạo file MainCaller.cbl
	```cobol
	IDENTIFICATION DIVISION.
	PROGRAM-ID. MainCaller.

	DATA DIVISION.
	WORKING-STORAGE SECTION.
	01 NUM1     PIC 9(3) VALUE 50.
	01 NUM2     PIC 9(3) VALUE 70.
	01 RESULT   PIC 9(4).

	PROCEDURE DIVISION.
		CALL "AddRoutine" USING NUM1, NUM2, RESULT
		DISPLAY "Kết quả: " RESULT *> Kết quả: 130
		STOP RUN.
	```
- Ví dụ 2: Tạo file AddRoutine.cbl
	```cobol
	IDENTIFICATION DIVISION.
	PROGRAM-ID. AddRoutine.

	DATA DIVISION.
	LINKAGE SECTION.
	01 N1       PIC 9(3).
	01 N2       PIC 9(3).
	01 SUM      PIC 9(4).

	PROCEDURE DIVISION USING N1, N2, SUM.
		ADD N1 TO N2 GIVING SUM
		EXIT PROGRAM.

	```
### 11. Internal Sort
- Dùng để sắp xếp dữ liệu ngay trong chương trình
- TODO
### 12. Database Interface
#### 12.1. Các thao tác SELECT, INSERT, UPDATE, DELETE
- Cú pháp:
	```cobol
	DATA DIVISION.
	WORKING-STORAGE SECTION.
		EXEC SQL
			<SQL command>
		END-EXEC.
	```
- Chuẩn bị data SQL: STUDENT table
	```sql
	Student Id		Student Name		Student Address
	1001 			   Mohtashim M.		Hyderabad
	1002			   Nishant Malik		Delhi
	1003 			   Amitabh Bachan		Mumbai
	1004			   Chulbul Pandey		Lucknow
	```
- SELECT
	```cobol
	IDENTIFICATION DIVISION.
	PROGRAM-ID. HELLO.

	DATA DIVISION.
	WORKING-STORAGE SECTION.
	EXEC SQL
		INCLUDE SQLCA
	END-EXEC.
	
	EXEC SQL
		INCLUDE STUDENT
	END-EXEC.
	
	EXEC SQL BEGIN DECLARE SECTION
	END-EXEC.
		01 WS-STUDENT-REC.
			05 WS-STUDENT-ID PIC 9(4).
			05 WS-STUDENT-NAME PIC X(25).
			05 WS-STUDENT-ADDRESS X(50).
	EXEC SQL END DECLARE SECTION
	END-EXEC.

	PROCEDURE DIVISION.
	EXEC SQL
		SELECT STUDENT-ID, STUDENT-NAME, STUDENT-ADDRESS
		INTO :WS-STUDENT-ID, :WS-STUDENT-NAME, WS-STUDENT-ADDRESS FROM STUDENT
		WHERE STUDENT-ID=1004
	END-EXEC.
	
	IF SQLCODE = 0 
		DISPLAY WS-STUDENT-RECORD
	ELSE DISPLAY 'Error'
	END-IF.
	STOP RUN.
	```
- INSERT 
	```cobol
	IDENTIFICATION DIVISION.
	PROGRAM-ID. HELLO.

	DATA DIVISION.
	WORKING-STORAGE SECTION.
	EXEC SQL
	INCLUDE SQLCA
	END-EXEC.
	
	EXEC SQL
	INCLUDE STUDENT
	END-EXEC.
	
	EXEC SQL BEGIN DECLARE SECTION
	END-EXEC.
		01 WS-STUDENT-REC.
			05 WS-STUDENT-ID PIC 9(4).
			05 WS-STUDENT-NAME PIC X(25).
			05 WS-STUDENT-ADDRESS X(50).
	EXEC SQL END DECLARE SECTION
	END-EXEC.

	PROCEDURE DIVISION.
	MOVE 1005 TO WS-STUDENT-ID.
	MOVE 'TutorialsPoint' TO WS-STUDENT-NAME.
	MOVE 'Hyderabad' TO WS-STUDENT-ADDRESS.
	
	EXEC SQL
		INSERT INTO STUDENT(STUDENT-ID, STUDENT-NAME, STUDENT-ADDRESS)
		VALUES (:WS-STUDENT-ID, :WS-STUDENT-NAME, WS-STUDENT-ADDRESS)
	END-EXEC.
	
	IF SQLCODE = 0 
		DISPLAY 'Record Inserted Successfully'
		DISPLAY WS-STUDENT-REC
	ELSE DISPLAY 'Error'
	END-IF.
	STOP RUN
	```
#### 12.2. Cursors
- Declare Cursor: Khai báo một con trỏ (cursor) gắn với câu lệnh SQL SELECT
	```cobol
	EXEC SQL
		DECLARE STUDCUR CURSOR FOR
		SELECT STUDENT-ID, STUDENT-NAME, STUDENT-ADDRESS FROM STUDENT
		WHERE STUDENT-ID >:WS-STUDENT-ID
	END-EXEC.
	```




 
