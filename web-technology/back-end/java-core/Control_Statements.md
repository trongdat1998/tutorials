#Control Statements - Các câu lệnh điều kiện
- Java cung cấp 3 câu lệnh điều khiển
##1. Decision Making statements - Câu lệnh rẻ nhánh
「if-else và switch-case」
- if-else dùng khi nhỏ hơn 4 nhánh, còn lại dùng switch-case
+ Cú pháp: if-else
	```Java
		if (điều kiện1) {
			// Khối mã thực thi nếu điều kiện1 đúng
		} else if (điều kiện2) {
			// Khối mã thực thi nếu điều kiện1 sai và điều kiện2 đúng
		} else {
			// Khối mã thực thi nếu tất cả điều kiện đều sai
		}
	```
+ Cú pháp: switch-case
	```Java
		switch (biểu_thức) {
		case giá_trị_1:
			Lệnh 1;
			break;
		case giá_trị_2:
			Lệnh 2;
			break;
		...
		case giá_trị_n:
			Lệnh n;
			break;
		default:
			Lệnh 0;
		}
	```
##2. Loop statements - Câu lệnh lặp
「for, while và do-while」
- for dùng khi biết trước số lần lặp.
+ Cú pháp:\
	```Java
		for (khoi_tao_bien ; check_dieu_kien ; tang/giam_bien) { 
			// Khối lệnh được thực thi
		}
		
		// --- For cải tiến ---
		
		for (Type var : array) { 
		 // Khối lệnh được thực thi
		}
	```
- while dùng khi chưa biết số lần lặp.
+ Cú pháp:\
	```Java
		while (điều_kiện) {
			// Mã thực thi trong vòng lặp
		}
	```
- do-while dùng khi chưa biết số lần lặp và cần chạy ít nhất 1 lần.
+ Cú pháp:\
	```Java
		do { 
			// Khối lệnh được thực thi
		} while(dieu_kien);
	```
##3. Jump statements - Câu lệnh dừng
「break và continue」
- Break để thoát 1 vòng lặp hoặc một lệnh switch
+ Ví dụ:
	```Java
		for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i); //1 2 3 4
        }
	```
- Continue để tiếp tục vòng lặp tại điều kiện đã xác định và phía sau continue sẽ không được thực thi
	```Java
		for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i); //1 2 3 4 6 7 8 9 10
        }
	```
